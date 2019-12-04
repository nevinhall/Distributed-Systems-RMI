import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  ManageHerosVillains extends Remote{
	public Object fetchVillain() throws RemoteException; 	
	public  void returnHero(Object hero, int i) throws  RemoteException, FileNotFoundException, IOException; 	
}
