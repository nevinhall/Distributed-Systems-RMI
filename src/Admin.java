import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Admin  extends UnicastRemoteObject  implements ManageHerosVillains {
	private ArrayList<Object> villainsToBeSent;
	
	protected Admin(ArrayList<Object> villainsToBeSent) throws RemoteException {
		super();
		this.villainsToBeSent = villainsToBeSent;
		
		//for testing only needs to be delted
		for(int i = 0; i < 5;i++) {
			villainsToBeSent.add("simulatedFetchVillaintest"+i);
		}
		//******************************************
	}
 
	
	
	@Override
	public ArrayList<Object>  fetchVillain() throws RemoteException {
		return villainsToBeSent;
	}

	@Override
	public void returnHero(ArrayList<Object> hero) throws IOException {
		System.out.println("size of sent array is " + hero.size());
		for(int i = 0; i < hero.size();i++) {
			
			System.out.println("Recived hero" + hero.get(i));
			
			File destination = new File ("D://college 2019//College third year//semester one//Disturbted systems//common//saved-the-world-again//saved" +  i + ".ser");
			FileOutputStream fileOut;
			fileOut = new FileOutputStream(destination);

			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(hero);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data succesfully \n");
		}

	}


	public ArrayList<Object> getVillainsToBeSent() {
		return villainsToBeSent;
	}


	public void setVillainsToBeSent(ArrayList<Object> villainsToBeSent) {
		this.villainsToBeSent = villainsToBeSent;
	}
	
	

}
