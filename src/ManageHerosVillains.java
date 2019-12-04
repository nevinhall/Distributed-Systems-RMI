import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface  ManageHerosVillains extends Remote{
	public ArrayList<Object>  fetchVillain() throws RemoteException; 	
	public  void returnHero(ArrayList<Object> hero) throws  RemoteException, FileNotFoundException, IOException; 	
}
