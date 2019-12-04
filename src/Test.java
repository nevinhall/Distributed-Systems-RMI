import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		ArrayList<Object> hero = new ArrayList<Object>();
		ArrayList<Object> similatedVillains = new ArrayList<Object>();
		ArrayList<Object> similatedHeroes = new ArrayList<Object>();
		
	
		Admin testAdmin = new Admin(similatedVillains);
		
	
	
		
		similatedVillains = testAdmin.fetchVillain();
		
		for(int i = 0; i < similatedVillains.size();i++) {
			System.out.println("I have been sent from the server test " + similatedVillains.get(i));
		}
		similatedHeroes = similatedVillains;
		testAdmin.returnHero(similatedHeroes);
	}

}
