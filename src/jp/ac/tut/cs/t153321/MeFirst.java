package jp.ac.tut.cs.t153321;

public class MeFirst extends Me153321{
	public MeFirst(String name, int age) {
		super(name, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public MeFirst(String name, int age,Prefacture p) {
		super(name, age,p);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	String work="REPORT";
	void takeBath(){
		System.out.println("風呂に入りました");
	}
	void sleep(int hour){
		System.out.println(hour+"時間寝ます");
	}
}
