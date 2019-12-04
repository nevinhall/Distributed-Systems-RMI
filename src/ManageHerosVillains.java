import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  ManageHerosVillains extends Remote{
	public Object fetchVillain() throws RemoteException; 	
	public  void returnHero(Object hero) throws  RemoteException; 	
}
