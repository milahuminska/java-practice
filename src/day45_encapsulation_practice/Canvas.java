package day45_encapsulation_practice;

import java.util.*;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java programming");

		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Maruf");
		javaTeachers.add("Muhtar");

		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Mila");
		javaStudents.add("Angy");
		javaStudents.add("Ivan");
		javaStudents.add("Vladik");
		javaStudents.add("Vika");
		
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());

		course1.addTeacher("Maria");
		course1.addStudent("Kate");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		
		
		if(course1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student");
		}else {
			System.out.println("Kate is not a student");
		}
		
		course1.removeTeacher("Muradil");
		course1.removeStudent("Vladik");
		
		
		if(!course1.getTeachers().contains("Muradil")) {
			System.out.println("Muradil is removed succssesfully");
		}else {
			System.out.println("Muradil is still a teacher");
		}
		
		
		
		if(!course1.getStudents().contains("Vladik")) {
			System.out.println("Vladik is removed succssesfully");
		}else {
			System.out.println("Vladik is still a student");
		}
		
		
		
		
		
	}
}
