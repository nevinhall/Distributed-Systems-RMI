import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class RMIClient {
	public static void main(String args[]) throws MalformedURLException, RemoteException, NotBoundException{
		ArrayList<Object> recievedVillains = new ArrayList<Object>();
		Registry registry = LocateRegistry.getRegistry();
		
		ManageHerosVillains client = (ManageHerosVillains) registry.lookup("server");

		recievedVillains = client.fetchVillain();

		for(int i = 0; i < recievedVillains.size();i++){
			System.out.println("Hero sent from villain is " + recievedVillains.get(i));
		}


	} 

}

