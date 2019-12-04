import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class RMIClient {
	public static void main(String args[]) throws NotBoundException, FileNotFoundException, IOException{
		ArrayList<Object> recievedVillains = new ArrayList<Object>();
		ArrayList<Object> convertedHeroes = new ArrayList<Object>();
		
		Registry registry = LocateRegistry.getRegistry(1097);
		
		ManageHerosVillains client = (ManageHerosVillains) registry.lookup("server");

		recievedVillains = client.fetchVillain();

		for(int i = 0; i < recievedVillains.size();i++){
			System.out.println("Villians sent from server is " + recievedVillains.get(i));
		}
		System.out.println("**********************************************************");
		
		ReactID convertVillains =  new ReactID();
		convertedHeroes = convertVillains.id(recievedVillains);
		client.returnHero(convertedHeroes);


	} 

}

