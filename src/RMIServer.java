import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

public class RMIServer {

	public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException{  
		ArrayList<Object> villainsToBeSent = new  ArrayList<Object>();
		
		Admin serverAdmin = new Admin(villainsToBeSent);

		LocateRegistry.createRegistry(8000);
		
		Naming.bind("server", serverAdmin);
	}
	

	}
