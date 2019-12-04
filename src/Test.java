import java.io.IOException;
import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) throws IOException {
		Admin testAdmin = new Admin();
		int i = 1;
		Object hero = null;
		testAdmin.returnHero(hero, i);

	}

}
