package gui;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smartFridgeService.ProductRequest;
import smartFridgeService.ProductRequestNoParam;
import smartFridgeService.ProductResponse;
import smartFridgeService.SmartFridgeServiceGrpc;

public class SmartFridgeGUI implements ActionListener {

	private JComboBox<String> request1;
	private JLabel response1;

	private JTextArea textResponse2;
	private ManagedChannel manageService2;

	public SmartFridgeGUI() {
		manageService2 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
	}

	private JPanel getJPanelOne() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JLabel label = new JLabel("Fridge");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));	
		request1 = new JComboBox<>();
		request1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk", "Cheese", "Eggs", "Bacon" }));
		panel.add(request1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		JButton button = new JButton("Check Status");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		response1 = new JLabel("Smart Fridge Display");
		panel.add(response1);
		panel.setLayout(boxlayout);
		
		return panel;

	}

	private JPanel getJPanelTwo() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JButton button = new JButton("All Stocks");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.setLayout(boxlayout);
		textResponse2 = new JTextArea (3, 30);
		textResponse2 .setLineWrap(true);
		textResponse2 .setWrapStyleWord(true);
		panel.add(textResponse2);
		return panel;

	}

	private void build() {
		JFrame frame = new JFrame("SmartFridge GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);
	
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
		panel.add(getJPanelOne());
		panel.add(Box.createVerticalStrut(10));
		panel.add(getJPanelTwo());
		frame.setSize(200, 400);

	
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SmartFridgeGUI gui = new SmartFridgeGUI();
		gui.build();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();

		if (label.equals("Check Status")) {
			ProductResponse response = SmartFridgeServiceGrpc.newBlockingStub(manageService2).productStockChecker(
					ProductRequest.newBuilder().setProduct(this.request1.getSelectedItem().toString()).build());
			this.response1.setText("There is " + response.getStockStatus() + " " + response.getProduct() + " in the stock.");
			
		} else if (label.equals("All Stocks")) {
			
			SmartFridgeServiceGrpc.newBlockingStub(manageService2)
			.fullStockChecker(ProductRequestNoParam.newBuilder().build()).forEachRemaining(productResponse -> {
				String text = this.textResponse2.getText();
				text += productResponse.getProduct() + " : " + productResponse.getStockStatus() + "\n";
				this.textResponse2.setText(text);
			});
		}
	}

}
