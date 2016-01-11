package jp.ac.tut.cs.t153321;

public class Human {
	private String name;
	private int age;

	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Human(String name,int age,Prefacture p){
		this.name=name;
		this.age=age;
		p.register(name);
	}

	void eat(String food){
		System.out.println(food+"を食べました");
	}
	void walk(){
		System.out.println("歩きました");
	}

	public String getName() {
		return name;
	}
}
