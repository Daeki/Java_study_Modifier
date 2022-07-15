package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	
	private static Iu iu=null;
	
	private Iu() {}
	
	public static Iu getInstance() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Setter
	//public void set변수명(데이터타입 변수명){}
	
	//Getter
	//public 리턴타입 get변수명(){}
	
	
}
