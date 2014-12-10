package data;

import java.io.Serializable;

public class RecordingQueue implements Serializable{

	private Recording[] recordings;
	private int frontPointer, backPointer;
	private boolean isEmpty;
	
	public RecordingQueue() {
		recordings = new Recording[10];
		isEmpty = true; 
		frontPointer = 0;
		backPointer = 0;
	}
	
	public void addRecord(Recording r){
		if(backPointer == recordings.length){
			extendQueue();
		}
		recordings[backPointer] = r;
		backPointer = incPointer(backPointer);
	}
	
	public Recording removeRecording(){
		if(!isEmpty){
			Recording head = examineFront();
			recordings[frontPointer] = null;
			frontPointer = incPointer(frontPointer);
			if(frontPointer == backPointer){
				isEmpty = true;
			}
			return head;
		}
		
		return null;
	}

	public Recording examineFront() {
		if(!isEmpty){
			Recording head = recordings[frontPointer];
			return head;
		}
		return null;
	}

	public void setRecordings(Recording[] recordings) {
		this.recordings = recordings;
	}
	
	private int incPointer(int ptr){
		//TODO: implement method body
		return 0;
	}
	
	private void extendQueue(){
		Recording[] tempQ = new Recording[(recordings.length * 2)];
		for(int i = 0; i < recordings.length; i++){
			tempQ[i] = recordings[i];
		}
		recordings = tempQ;
	}
}
