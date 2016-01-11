package jp.ac.tut.cs.t153321;

import java.util.ArrayList;

public class Prefacture {
	private ArrayList<String> residents=new ArrayList<String>();
	private String prefacturename;

	public Prefacture(String name){
		this.prefacturename=name;
	}
	public Prefacture(String name,Country country){
		this.prefacturename=name;
		country.addPrefacture(this);
	}
	void show(){
		System.out.println("-"+prefacturename+"の住民-");
		for(String s:residents){
			System.out.println(s);
		}
	}

	int register(String name){
		residents.add(name);
		System.out.println(name+"は"+this.getPrefacturename()+"の住民です");
		return residents.size();
	}

	public String getPrefacturename() {
		return prefacturename;
	}
	public ArrayList<String> getresidents(){
		return new ArrayList<String>(residents);

	}
}
