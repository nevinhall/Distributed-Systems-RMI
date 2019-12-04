import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RMIServer {

	public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException{  
		ArrayList<Object> villainsToBeSent = new  ArrayList<Object>();
		
		 ManageHerosVillains serverAdmin = new Admin(villainsToBeSent);
		 ManageHerosVillains stub = (ManageHerosVillains) UnicastRemoteObject
				  .exportObject((ManageHerosVillains) serverAdmin, 0);

		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("server",  stub);
		
		System.out.println("Server Running");
	}
	

	}
