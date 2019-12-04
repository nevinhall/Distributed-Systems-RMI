import java.io.File;
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
		File temp = new File("D://college 2019//College third year//semester one//Disturbted systems//common//");
		ServerObservable checkForVillians =  new ServerObservable();
		ServerObserver retriveVillians = new ServerObserver();
	

		retriveVillians.setTemp(temp);

		checkForVillians.addObserver(retriveVillians);
		checkForVillians.tempFile(temp);
		
		villainsToBeSent = retriveVillians.getVillainsToBeSent();
		
		for(int i = 0; i < villainsToBeSent.size(); i++){
			System.out.println("villain retrieved from folder " + villainsToBeSent.get(i));
			
		}
		
		
		
		 ManageHerosVillains serverAdmin = new Admin(villainsToBeSent);
		 ManageHerosVillains stub = (ManageHerosVillains) UnicastRemoteObject
				  .exportObject((ManageHerosVillains) serverAdmin, 0);

		Registry registry = LocateRegistry.createRegistry(1097);
		registry.bind("server",  stub);
		
		System.out.println("Server Running");
	}
	

	}
