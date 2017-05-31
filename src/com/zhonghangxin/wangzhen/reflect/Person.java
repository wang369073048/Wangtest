package com.zhonghangxin.wangzhen.reflect;

public class Person extends Demo{
	private String name ;
	private int age;
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
	@Override
	public String toString(){
		return "["+this.name + " " +this.age+"]";
		
	}
	public Person(){
		
		System.out.println("222222222");
	}
	
	public Person(String name){
        this.name=name;
    }
    public Person(int age){
        this.age=age;
    }
	public Person(String name, int age) {
		this();
        this.age=age;
        this.name=name;
    }
}
