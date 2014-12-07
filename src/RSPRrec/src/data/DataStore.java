package data;

import utilities.Settings;

public class DataStore {

	private Author currentUser;
	private RecordingQueue allRecordings;
	private Settings currentSettings;
	
	public DataStore() {
		
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

}
