// Name:  Irakli, Bagratishvili.
// This project is all my own work.
// I have not knowingly allowed others to copy my work.
package dtp;
import java.util.ArrayList;

public class DinnerTable {
	private ArrayList<Person> dinnertable;
	public DinnerTable(ArrayList<Person> guestlist) throws DinnerTableException{
		this.dinnertable=guestlist;
		int n=0;
		for (int i=0; i<dinnertable.size();i++) {
			//Incrementing if person is single and searching 
			if (dinnertable.get(i).getClass()==SinglePerson.class) {
				SinglePerson singleperson= (SinglePerson) dinnertable.get(i);
				if (singleperson.getsearching().equals("y")) {
					n++;
				}
			}
		}
		if (n<=1) {
			throw new DinnerTableException("Number of Singles Looking: " +n);
		}
	}

//gives us number of single persons searching for partner
	
	public int getSinglessearching() {
		int n=0;
		for (int i=0; i<dinnertable.size();i++) {
			
			
//Incrementing if person is single and searching 
			if (dinnertable.get(i).getClass()==SinglePerson.class) {
				SinglePerson singleperson= (SinglePerson) dinnertable.get(i);
				if (singleperson.getsearching().equals("y")) {
					n++;
				}
			}
		}
		return n;
	}
	//print the dinnertable
	public String toString() {
		return dinnertable.get(0).toString()+ "\n" +dinnertable.get(1).toString()+"\n" +dinnertable.get(2).toString()+"\n"+dinnertable.get(3).toString()+"\n";

	}
}
