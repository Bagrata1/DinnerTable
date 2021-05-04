// Name:  Irakli, Bagratishvili.
// This project is all my own work.
// I have not knowingly allowed others to copy my work.
package dtp;

public class SinglePerson extends Person {
	private String searching;

	//constructor singleperson
	public SinglePerson(String name, int age, String sex, String relation, String searching){
		setName(name);
		setAge(age);
		setSex(sex);
		setRelation(relation);
		this.searching=searching;
	}

	public String getsearching() {
		return searching;
	}

	public void setsearching(String searching) {
		this.searching = searching;
	}

	//returns all info on person as string
	@Override
	public String toString() {


		return "Name: "+ super.getName() + "\t Age: "+ super.getAge() + "\t Sex "+ super.getSex()+ "\t Relation: " + super.getRelation()+ "\t Is Searching "+ searching ;
	}

	public String printsearching() {
		return searching;
	}
}
