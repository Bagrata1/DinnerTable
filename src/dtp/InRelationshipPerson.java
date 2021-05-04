// Name:  Irakli, Bagratishvili.
// This project is all my own work.
// I have not knowingly allowed others to copy my work.
package dtp;

public class InRelationshipPerson extends Person{
	private String partner;


	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}	


	//constructor
	
	public InRelationshipPerson(String name, int age, String sex, String relation, String partner){
		setName(name);
		setAge(age);
		setSex(sex);
		setRelation(relation);
		this.partner=partner;
	}

	//toString method, converting info to string
	public String toString() {
		
		return "name: "+ super.getName() + "\t age: "+ super.getAge() + "\t sex "+ super.getSex()+ "\t relation: " + super.getRelation()+ "\t Partner "+ partner ;
	}
}
