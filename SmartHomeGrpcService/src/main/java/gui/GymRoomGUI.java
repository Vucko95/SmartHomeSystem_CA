package gui;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BoxLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GymRoomGUI {
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

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);

		
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

		panel.add(getService1JPanel());
		panel.add(getService2JPanel());

		
		frame.setSize(500, 500);

		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	private JPanel getService1JPanel() {
		return null;
		}
	private JPanel getService2JPanel() {
		return null;
		}
	

}// class GymRoomGUi