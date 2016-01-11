package jp.ac.tut.cs.t153321;

import java.util.ArrayList;

public class TaxOffice {
	private int tax;

	void recovery(ArrayList<Prefacture> prefacture,int money){
		for(Prefacture p:prefacture){
			ArrayList<String> name=p.getresidents();
			for(String s:name){
				System.out.println(s+"は"+money+"納金した");
				this.tax+=money;
			}
		}
	}

	int pay(){
		int money=new Integer(tax);
		this.tax=0;
		return money;
	}
	void showTax() {
		System.out.println("税務署の管理している税金は"+tax+"です");
	}

}
