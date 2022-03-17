package gymRoomControlService;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import gymRoomControlService.GymRoomServiceGrpc.GymRoomServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;




public class GUIGymRoomControl {
	
	private GymRoomServiceBlockingStub blockingStub;
	
	private JFrame frame;
	private JTextField textNumber1;
//	private JTextField textName2;
	private JTextArea textResponse;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIGymRoomControl window = new GUIGymRoomControl();
		window.frame.setVisible(true);
	} //main

	public GUIGymRoomControl() {
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		blockingStub = GymRoomServiceGrpc.newBlockingStub(channel);
		//Combine the code from JFrame and GRPC - two frameworks
		initialize();
		
	}
	private void initialize() {
		
		frame = new JFrame();
	
		frame.setTitle("Gym Room Service");
		
		frame.setBounds(100, 100, 500, 300);
		// Detrmine what will happen on the close (Behaviour of the X)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		//Setting up layout
		frame.getContentPane().setLayout(bl);
		
		JPanel panel_service_1 = new JPanel();
		
		frame.getContentPane().add(panel_service_1);
		
		//flow layout - gaps between
		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 6,6));
		
		//New Label Creation and attaching to pannel
		JLabel lblNewLabel_1 = new JLabel(" Please enter Temperature you would like to set ");
		panel_service_1.add(lblNewLabel_1);
		
		//Input textbox - 
		textNumber1 = new JTextField();
		panel_service_1.add(textNumber1);
		
		//width of input box
		textNumber1.setColumns(5);

		JButton btnSend = new JButton("Send Temp to server");
		
		//add action listener to button
		btnSend.addActionListener(new ActionListener(){
			
			//action for action method - will happen when button clicked
			public void actionPerformed(ActionEvent e) {
				
			//retrieve data from gui
			int num1 = Integer.parseInt(textNumber1.getText());
			
				
				//Grpc code
	
				TempRequest request = TempRequest.newBuilder().setIndex(num1).build();
				TempResponse response = blockingStub.changeRoomTemp(request);
				
				
				//print out response
				//System.out.println(response);
				//add response into GUI
			
			
				textResponse.append("reply: "+response);
			}
		});
		panel_service_1.add(btnSend);
		
		textResponse = new JTextArea (3, 30);
		textResponse .setLineWrap(true);
		textResponse .setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		panel_service_1.add(scrollPane);
		
	}
	
}//class

























