package com.test.java;

public class Student {
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	private static String school;
	
	public Student() {
		this("미정",0,0,0,0);
	}

	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public Student(String name, int age) {
		this(name,age,0,0,0);
	}
	
	public Student(int grade, int classNumber, int number) {
		this("미정",0,grade,classNumber,number);
	}
	
	static {
		Student.school="역삼 중학교";
	}
	
	public String info() {
		return String.format("%s(나이 : %d, 학년 : %d, 반 : %d, 번호 : %d)", this.name,this.age,this.grade,this.classNumber,this.number);
	}
	
}
