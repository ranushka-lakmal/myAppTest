public class Attraction {

	public String name;
	public int oTime;
	public int cTime;
	public float cost;
	public String location;

	public Attraction(String name, int oTime, int cTime, float cost, String location){

		this.name = name;
		this.oTime = oTime;
		this.cTime = cTime;
		this.cost = cost;
		this.location = location;
	}

	public Attraction() {
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

}
