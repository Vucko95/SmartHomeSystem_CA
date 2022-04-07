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
import javax.swing.border.EmptyBorder;

	import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;

	public class WorkoutTrackerGUI   implements ActionListener {
		private JComboBox<String> request1;
		private JLabel response1;
		private JTextArea responseAll;
		private ManagedChannel manageService3;
		public static void main(String[] args) {
			WorkoutTrackerGUI gui = new WorkoutTrackerGUI();
			gui.build();

		}
		public WorkoutTrackerGUI() {

			int port = 50053;
			String host = "localhost";
			manageService3 = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
	}


		private void build () {
			JFrame frame = new JFrame("Workout Tracker GUI");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
			panel.setLayout(boxlayout);
			panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
			panel.add(WorkoutTrackerPanel1());
			panel.add(Box.createVerticalStrut(10));
			panel.add(WorkoutTrackerPanel2());
			frame.setSize(500, 500);
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);	
		}
		
		private JPanel WorkoutTrackerPanel1() {
			JPanel panel = new JPanel();
			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
			JLabel label = new JLabel("Workout");
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			request1 = new JComboBox<>();
			request1.setModel(
					new javax.swing.DefaultComboBoxModel<>(new String[] { "Walking", "Running", "Stairclimb", "Cycling" }));
			panel.add(request1);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			JButton button = new JButton("Check");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			response1 = new JLabel("Workout Display");
			panel.add(response1);
			panel.setLayout(boxlayout);

			return panel;

		}
		private JPanel WorkoutTrackerPanel2() {
			JPanel panel = new JPanel();
			BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
			JLabel label = new JLabel("");
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));

			JButton button = new JButton("View All");
			button.addActionListener(this);
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(10, 0)));
			responseAll = new JTextArea();	
			panel.setLayout(boxlayout);
			responseAll = new JTextArea (3, 10);
			responseAll .setLineWrap(true);
			responseAll .setWrapStyleWord(true);
			panel.add(responseAll);
			return panel;

		}


		public void actionPerformed(ActionEvent e) { }




	}// class
