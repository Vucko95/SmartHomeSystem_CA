package gui;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import gymRoomControlService.GymRoomServiceGrpc;
import gymRoomControlService.LightRequest;
import gymRoomControlService.LightResponse;
import gymRoomControlService.LightStatus;
import gymRoomControlService.TempRequest;
import gymRoomControlService.TempResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

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
		// Layout type for GUI
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
		panel.add(Temp1JPanel());
		panel.add(Box.createVerticalStrut(10));

		panel.add(LightsJPanel());
		// Frame size
		frame.setSize(500, 500);
		// Window Visiability is by  default false
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
		textNumber1 = new JTextField("", 5);
		panel.add(textNumber1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Change Temperature");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		textResponse = new JTextField("", 20);
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
		panel.add(Box.createRigidArea(new Dimension(10, 10)));

		textResponse2 = new JTextField("", 5);
		textResponse2.setEditable(false);
		panel.add(textResponse2);
		panel.setLayout(boxlayout);
		return panel;

	}

	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();
		if (label.equals("Change Temperature")) {
			System.out.println("changing temperature...");
//			Client Streaming
			final GymRoomServiceGrpc.GymRoomServiceStub gymRoomServiceStub = GymRoomServiceGrpc.newStub(manageService1);
			final StreamObserver<TempRequest> req = gymRoomServiceStub
					.changeRoomTemp(new StreamObserver<TempResponse>() {
						@Override
						public void onNext(TempResponse tempResponse) {
							textResponse.setText("Desired Temperature is set to : " + tempResponse.getTempOutput());
						}

						@Override
						public void onError(Throwable throwable) {

						}

						@Override
						public void onCompleted() {

						}
					});
			try {
				req.onNext(TempRequest.newBuilder().setTempInput(Integer.parseInt(this.textNumber1.getText())).build());
				req.onCompleted(); }

				catch (RuntimeException err) {
					err.printStackTrace();
						System.out.println(err);
				}

			System.out.println("changing temperature ...");
		} 
		// Unary RPC
		else if (label.equals("Change Light Status"))
		{
			String lightStatus = (String) this.LigthEntry2.getSelectedItem();
			LightStatus lightRequest = lightStatus.equalsIgnoreCase(LightStatus.off.name()) ? LightStatus.off
					: LightStatus.on;
			final LightResponse gymRoomServiceBlockingStub = GymRoomServiceGrpc.newBlockingStub(manageService1)
					.turnOnOffLights(LightRequest.newBuilder().setTurnLightRequest(lightRequest).build());

			this.textResponse2.setText("Lights are now " + gymRoomServiceBlockingStub.getTurnLightResponse().name());
		}
	}
}// class GymRoomGUi