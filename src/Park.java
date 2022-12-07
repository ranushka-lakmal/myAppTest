
public class Park extends Attraction{

	private int parkId;
	private int ageLimit;
	private String parkType;

	public Park(int parkId, int ageLimit, String parkType) {
		this.parkId = parkId;
		this.ageLimit = ageLimit;
		this.parkType = parkType;
	}

	public Park(int parkId, int ageLimit, String parkType, String name, int oTime, int cTime, float cost, String location) {
		super(name, oTime, cTime, cost, location);
		this.parkId = parkId;
		this.ageLimit = ageLimit;
		this.parkType = parkType;
	}

	public int getParkId() {
		return parkId;
	}

	public void setParkId(int parkId) {
		this.parkId = parkId;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getParkType() {
		return parkType;
	}

	public void setParkType(String parkType) {
		this.parkType = parkType;
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
