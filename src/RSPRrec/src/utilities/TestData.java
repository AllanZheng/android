package utilities;

import java.io.Serializable;
import java.util.ArrayList;

public class TestData {
	
	private ArrayList<Account> accounts;
	
	public TestData(){
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String uid, String pass){
		Account a = new Account(uid, pass);
		accounts.add(a);
	}
	
	public boolean checkAccount(String uid, String pass){
		for(int i = 0; i < accounts.size(); i++){
			if(uid.equals(accounts.get(i).getUid())){
				
				if(pass.equals(accounts.get(i).getUid())){
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	

	private class Account implements Serializable{
		
		private String uid;
		private String pass;
		
		public Account(String u, String p){
			uid = u;
			pass = p;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}
	
	}
	
	
}
