package data;

import java.io.Serializable;

public class RecordingQueue implements Serializable{

	private Recording[] recordings;
	
	public RecordingQueue() {
		
	}
	
	public void addRecord(Recording r){
		
	}
	
	public Record removeRecording(Recording r){
		return null;
		
	}

	public Recording[] getRecordings() {
		return recordings;
	}

	public void setRecordings(Recording[] recordings) {
		this.recordings = recordings;
	}
	

}
