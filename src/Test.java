import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		ArrayList<Object> hero = new ArrayList<Object>();
		Object test = null;
		Admin testAdmin = new Admin();
		
		for(int i = 0; i < 5;i++) {
			hero.add(test);
		}
	
		testAdmin.returnHero(hero);
		System.out.println("ran " + 1);

	}

}
