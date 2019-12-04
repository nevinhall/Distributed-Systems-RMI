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
	public void returnHero(Object hero) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
