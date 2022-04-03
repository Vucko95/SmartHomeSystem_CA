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

public class SmartFridgeGUI  implements ActionListener {
	private JComboBox<String> request1;
	private JLabel response1;
	private JLabel response2;
	private JTextArea textResponse;
	private ManagedChannel manageService2;
	public static void main(String[] args) {
		SmartFridgeGUI gui = new SmartFridgeGUI();
		gui.build();

	}

	public SmartFridgeGUI() {
		
		int port = 50052;
		String host = "localhost";
		manageService2 = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
}
	
	
	private void build () {
		
		JFrame frame = new JFrame("Smart Fridge GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);

		
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

		panel.add(FridgPanel1());
		panel.add(FridgPanel2());
		
		frame.setSize(500, 500);

		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);	
		
	}
	
	
	private JPanel FridgPanel1() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JLabel label = new JLabel("Check Product in Smart Fridge");
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

		response1 = new JLabel("--");
		panel.add(response1);
		panel.setLayout(boxlayout);
		
		return panel;

	}
	
	private JPanel FridgPanel2() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JButton button = new JButton("Show Full Smart Fridge Stock");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 10)));

		panel.setLayout(boxlayout);
		textResponse = new JTextArea (3, 15);
		textResponse .setLineWrap(true);
		textResponse .setWrapStyleWord(true);
		panel.add(textResponse);
		return panel;

	}
	
	
	public void actionPerformed(ActionEvent e) { }
	
	
	
	
}// class
