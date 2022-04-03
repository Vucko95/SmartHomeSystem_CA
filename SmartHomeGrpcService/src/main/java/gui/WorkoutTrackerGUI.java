package gui;



import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

	import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;

	public class WorkoutTrackerGUI   implements ActionListener {

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

//			panel.add(());
//			panel.add(());
			frame.setSize(500, 500);
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);	
		}
		
		


		public void actionPerformed(ActionEvent e) { }




	}// class
