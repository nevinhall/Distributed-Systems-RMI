
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ServerObserver  implements Observer{
	private File temp;
	private int i = 1;
	private File deleteVillain;
	private FileInputStream idTemp;
	private Object objectFound;



	
	private ArrayList<Object> villainsToBeSent = new  ArrayList<Object>();



	@Override
	public void update(Observable o, Object arg) {





		deleteVillain = new File("D://college 2019//College third year//semester one//Disturbted systems//common//battle-zone-" + i + ".ser");
		System.out.println(i + " this is the current value");

	


		try {
			idTemp = new FileInputStream(deleteVillain);
			
	


			ObjectInputStream in;

			in = new ObjectInputStream(idTemp);
			
			objectFound = (Object)in.readObject();
			villainsToBeSent.add(objectFound);
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n file contains " + objectFound.getClass());
		

		deleteVillain.delete();
		
		i++;
	}

	public File getTemp() {
		return temp;
	}

	public void setTemp(File temp) {
		this.temp = temp;
	}

	public ArrayList<Object> getVillainsToBeSent() {
		return villainsToBeSent;
	}

	public void setVillainsToBeSent(ArrayList<Object> villainsToBeSent) {
		this.villainsToBeSent = villainsToBeSent;
	}
	




}
