
public class Theater extends Attraction{

	private int theaterID;
	private float duration;
	private String theaterType;
	private String movieList;


	public Theater(int theaterID, float duration, String theaterType, String movieList) {
		this.theaterID = theaterID;
		this.duration = duration;
		this.theaterType = theaterType;
		this.movieList = movieList;
	}

	public Theater(int theaterID, float duration, String theaterType, String movieList, String name, int oTime, int cTime, float cost, String location) {
		super(name, oTime, cTime, cost, location);
		this.theaterID = theaterID;
		this.duration = duration;
		this.theaterType = theaterType;
		this.movieList = movieList;
	}

	public int getTheaterID() {
		return theaterID;
	}

	public void setTheaterID(int theaterID) {
		this.theaterID = theaterID;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public String getTheaterType() {
		return theaterType;
	}

	public void setTheaterType(String theaterType) {
		this.theaterType = theaterType;
	}

	public String getMovieList() {
		return movieList;
	}

	public void setMovieList(String movieList) {
		this.movieList = movieList;
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
