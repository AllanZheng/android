package data;

import ui.Status;

public class Recording {

	private Author author;
	private Record record;
	private Status status;
	
	
	public Recording(Author a, Record r, Status s) {
		author = a;
		record = r;
		status = s;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public Record getRecord() {
		return record;
	}


	public void setRecord(Record record) {
		this.record = record;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

}
