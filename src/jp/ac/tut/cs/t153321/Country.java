package jp.ac.tut.cs.t153321;

import java.util.ArrayList;

public class Country {
	private String name;
	private int money=0; //資産
	private ArrayList<Prefacture> prefacture=new ArrayList<Prefacture>();
	TaxOffice office=new TaxOffice();

	public Country(String name){
		this.name=name;
	}

	void useTax (int money){
		System.out.println(name+"は"+money+"の資金を使用");
		this.money=this.money-money;
		System.out.println(name+"の資金は"+this.money);
	}
	void order_pay(){
		System.out.println("税務署にある全ての税金の回収を要求");
		this.money+=office.pay();
		System.out.println(name+"の資金は"+this.money);
	}
	void order_recovery(int money){
		System.out.println(this.name+"は住民に"+money+"の納金するよう命令した");
		office.recovery(this.prefacture,money);
		office.showTax();
	}
	void showResidents(){
		for(Prefacture p:prefacture){
			p.show();
		}
	}
	void showPrefactures(){
		for(Prefacture p:prefacture){
			System.out.println(p.getPrefacturename());
		}
	}
	public void addPrefacture(Prefacture prefacture){
		//System.out.println(prefacture.getPrefacturename()+"は"+name+"に所属");
		this.prefacture.add(prefacture);
	}
	public void setPrefacture(ArrayList<Prefacture> prefacture) {
		this.prefacture = prefacture;
	}
}
