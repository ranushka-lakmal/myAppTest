import java.util.ArrayList;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Museum extends Attraction{

	private int museumId;
	private String description;
	private String meseumType;

	/*constructor for museum*/
	public Museum(int museumId, String description, String meseumType) {
		this.museumId = museumId;
		this.description = description;
		this.meseumType = meseumType;
	}

	/*super constructor*/
	public Museum(int museumId, String description, String meseumType, String name, int oTime, int cTime, float cost, String location) {
		super(name, oTime, cTime, cost, location);
		this.museumId = museumId;
		this.description = description;
		this.meseumType = meseumType;
	}

	Museum(int i, String test_description, String type_1, String london_Museum, int i0) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public int getMuseumId() {
		return museumId;
	}

	public void setMuseumId(int museumId) {
		this.museumId = museumId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeseumType() {
		return meseumType;
	}

	public void setMeseumType(String meseumType) {
		this.meseumType = meseumType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getoTime() {
		return oTime;
	}

	public void setoTime(int oTime) {
		this.oTime = oTime;
	}

	public int getcTime() {
		return cTime;
	}

	public void setcTime(int cTime) {
		this.cTime = cTime;
	}


	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	void addMuseum1() throws InterruptedException{

		Museum m1 = new Museum(1, "test description", "Miitary", "Army Museum", 1930, 2230, 2, "London");
		if(m1.cost < 5){
			if(m1.oTime > 1900){
				System.out.println("ID          : " + m1.getMuseumId());
				System.out.println("Name        : " + m1.getName());
				System.out.println("Location    : " + m1.getLocation());
				System.out.println("Open Time   : " + m1.getoTime()+ " A.M");
				System.out.println("close Time   : " + m1.getcTime()+ " P.M");
				System.out.println("Ticket Cost : " + m1.getCost()+ "£ (Sterling Pound)");
				System.out.println("Description : " + m1.getDescription());
				System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
			}
		}

	}

	void check(){

		ArrayList<Museum> museum = new ArrayList<>();

// a Museum object created first
		Museum ms1 = new Museum (11111, "AAAAAAAAAAAA", "Miitary", "Army Museum", 830, 1730, 450, "London");
// and then added to the list
		museum.add(ms1);

// person objects can also be created "in the same sentence" that they are added to the list
//persons.add(new Person("Matthew"));
//persons.add(new Person("Martin"));

		for (Museum museum1: museum) {
			System.out.println(museum);
		}

	}

}
