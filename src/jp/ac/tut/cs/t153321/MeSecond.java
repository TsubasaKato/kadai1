package jp.ac.tut.cs.t153321;

public class MeSecond extends Me153321{
	public MeSecond(String name, int age) {
		super(name, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public MeSecond(String name, int age,Prefacture p) {
		super(name, age,p);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	String task="STUDY";
	String target="TUT";
	public void ride(String object){
		System.out.println(object+"に乗りました");
	}
	void buy(String object){
		System.out.println(object+"を買いました");
	}
}
