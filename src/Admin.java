import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Admin  extends UnicastRemoteObject  implements ManageHerosVillains {

	protected Admin() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object fetchVillain() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void returnHero(Object hero, int i) throws IOException {
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
