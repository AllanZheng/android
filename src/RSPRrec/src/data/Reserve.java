package data;

public class Reserve {

	private String name;
	private String location;
	private String description;
	
	public Reserve(String n, String l, String d) {
		name = n;
		location = l;
		description = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
