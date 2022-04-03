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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GymRoomGUI implements ActionListener  {
	
	private JTextField textNumber1, textResponse;
	private JComboBox<String> LigthEntry2;
	private JTextField textResponse2;
	
	
	public static void main(String[] args) {
		GymRoomGUI gui = new GymRoomGUI();
		gui.build();
	}

	ManagedChannel manageService1;

	public GymRoomGUI() {
		
		int port = 50051;
		String host = "localhost";
		manageService1 = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
}
	private void build() {

		JFrame frame = new JFrame("GymRoomGUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);

		
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

		panel.add(Temp1JPanel());
		panel.add(LightsJPanel());
		
		frame.setSize(500, 500);

		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	private JPanel Temp1JPanel() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JLabel label = new JLabel("Desired Temperature");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		textNumber1 = new JTextField("", 10);
		panel.add(textNumber1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Change Temperature");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		textResponse = new JTextField("", 50);
		textResponse.setEditable(false);
		panel.add(textResponse);

		panel.setLayout(boxlayout);

		return panel;
		}
	
	private JPanel LightsJPanel() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		JLabel label = new JLabel("Light Status");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		LigthEntry2 = new JComboBox<>();
		LigthEntry2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On", "Off" }));
		panel.add(LigthEntry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Change Light Status");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		textResponse2 = new JTextField("", 50);
		textResponse2.setEditable(false);
		panel.add(textResponse2);
		panel.setLayout(boxlayout);
		return panel;

	}
	
	public void actionPerformed(ActionEvent e) {}
	
		

	

}// class GymRoomGUi