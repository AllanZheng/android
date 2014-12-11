package data;

import java.io.Serializable;

import utilities.Settings;

public class DataStore implements Serializable{

	private Author currentUser;
	private RecordingQueue allRecordings;
	private Settings currentSettings;
	private boolean loggedIn;
	
	public DataStore() {
		currentSettings = new Settings();
		loggedIn = false;
	}

	public Author getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Author currentUser) {
		this.currentUser = currentUser;
	}

	public RecordingQueue getAllRecordings() {
		return allRecordings;
	}

	public void setAllRecordings(RecordingQueue allRecordings) {
		this.allRecordings = allRecordings;
	}

	public Settings getCurrentSettings() {
		return currentSettings;
	}

	public void setCurrentSettings(Settings currentSettings) {
		this.currentSettings = currentSettings;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}
