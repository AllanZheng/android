package utilities;

import java.io.Serializable;

public class Settings implements Serializable{

	private boolean gps;
	private boolean sendPrompt;
	private boolean photoSave;
	private boolean wiFi;
	
	public Settings() {
		
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isSendPrompt() {
		return sendPrompt;
	}

	public void setSendPrompt(boolean sendPrompt) {
		this.sendPrompt = sendPrompt;
	}

	public boolean isPhotoSave() {
		return photoSave;
	}

	public void setPhotoSave(boolean photoSave) {
		this.photoSave = photoSave;
	}

	public boolean isWiFi() {
		return wiFi;
	}

	public void setWiFi(boolean wiFi) {
		this.wiFi = wiFi;
	}
}
