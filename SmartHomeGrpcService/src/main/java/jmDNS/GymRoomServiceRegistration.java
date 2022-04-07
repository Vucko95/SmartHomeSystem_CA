package jmDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class GymRoomServiceRegistration {

	public void run(int port, String service_clientstreaming, String service_name) {

		//get a jMDNS instance
		try {
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			
						
			int service_port = port;
			String service_desc = "test integration of jmDNS with gRPC";
				
			
			//Create ServiceInfo  
			//use the factory method to create the object			
			ServiceInfo serviceInfo = ServiceInfo.create(service_clientstreaming, service_name, service_port, service_desc);
			

//			Service Registration
			jmdns.registerService(serviceInfo);
			
			System.out.printf("registering service with type: %s and name: %s on port %d ", service_clientstreaming, service_name, service_port);
			
			//sleep for 5 seconds
			Thread.sleep(5000);
			System.out.println("\nService Registered");
	
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
