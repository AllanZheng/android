package data;

import java.io.Serializable;

import android.media.Image;

public class Record implements Serializable{

	private Species species;
	private char abundance;
	private int latitude;
	private int longitude;
	private Reserve reserve;
	private String comment;
	private Image speciesImage;
	private Image speciesScene;
	
	
	public Record(Species s, char a, int lat, int lng, Reserve r, String c, Image sI, Image sS) {
		species = s;
		abundance = a;
		latitude = lat;
		longitude = lng;
		reserve = r;
		comment = c;
		speciesImage = sI;
		speciesScene = sS;
	}


	public Species getSpecies() {
		return species;
	}


	public void setSpecies(Species species) {
		this.species = species;
	}


	public char getAbundance() {
		return abundance;
	}


	public void setAbundance(char abundance) {
		this.abundance = abundance;
	}


	public int getLatitude() {
		return latitude;
	}


	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}


	public int getLongitude() {
		return longitude;
	}


	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}


	public Reserve getReserve() {
		return reserve;
	}


	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Image getSpeciesImage() {
		return speciesImage;
	}


	public void setSpeciesImage(Image speciesImage) {
		this.speciesImage = speciesImage;
	}


	public Image getSpeciesScene() {
		return speciesScene;
	}


	public void setSpeciesScene(Image speciesScene) {
		this.speciesScene = speciesScene;
	}

}
