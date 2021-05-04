// Name:  Irakli Bagratishvili.
// This project is all my own work.
// I have not knowingly allowed others to copy my work.
package dtp;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class TestDinnerTable {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int filetouse = 0;
		while(filetouse==0) {
			try {
		// Following code ask an user to enter the name of the file to retrieve the data
				System.out.println("Please enter the name of the guest data file");
				Scanner keyinput = new Scanner(System.in);
				String filename = keyinput.next();
				File file = new File(filename);
				Scanner input = new Scanner(file);

		
				//Making temp arraylist to process dinnertable object 
				
				
				ArrayList guestlist = new ArrayList<Person>();
				while (input.hasNext()) {
					
					//splits lines and adds words to an array
					String line= input.nextLine();
					String[] words = line.split(" ");
					int age = Integer.parseInt(words[1]);
					//based on relationship status creating diff objects
					if (words[4].equals("n")||words[4].equals("y")) {
						SinglePerson person= new SinglePerson(words[0],age,words[2],words[3],words[4]);
						guestlist.add(person);
					}
					else {
						InRelationshipPerson person=new InRelationshipPerson(words[0],age,words[2],words[3],words[4]);
						guestlist.add(person);
					}
				}
				//creating a dinnertableobject using guestlist
				try {
					DinnerTable dinnertable = new DinnerTable(guestlist);
					filetouse=1;
					System.out.println(dinnertable.toString());
				} 
				//catch block for dinnertable exception, not enough single persons.
				catch (DinnerTableException e) {
					System.out.println("Problems with dinner table.");
					System.out.println(e);
				}
		
		

		}
	}
}
