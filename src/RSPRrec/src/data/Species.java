package data;

public class Species {

	private String commonName;
	private String latinName;
	private int id;
	
	public Species(String c, String l, int i) {
		commonName = c;
		latinName = l;
		id = i;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
