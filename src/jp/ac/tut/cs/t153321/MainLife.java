package jp.ac.tut.cs.t153321;

public class MainLife {

	public static void main(String[] args) {
		Country japan=new Country("日本");
		Country italy=new Country("イタリア");
		Prefacture aichi = new Prefacture("愛知",japan);
		Prefacture kanagawa = new Prefacture("神奈川",japan);
		Prefacture napoli = new Prefacture("ナポリ",italy);

		MeFirst me1=new MeFirst("Aさん",20,aichi);
		MeFirst me2=new MeFirst("Bさん",20,napoli);
		MeFirst me3=new MeFirst("Cさん",20,kanagawa);
		MeFirst me4=new MeFirst("Dさん",20,napoli);

		japan.showResidents();
		italy.order_recovery(500);
		italy.order_recovery(500);
		italy.order_pay();
		italy.useTax(200);
	}

}
