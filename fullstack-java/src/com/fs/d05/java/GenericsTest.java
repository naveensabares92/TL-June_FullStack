package com.fs.d05.java;

import java.util.ArrayList;


public class GenericsTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test");
		list.add("Leaf");
		list.add("LeafTest");
		
//		GenericsTryOut<K, GenderEnum.Gender> genericTest = new GenericsTryOut<>();
//		genericTest.display(1, "TestLeaf", GenderEnum.Gender.MALE);
//		
//		genericTest.display(new K(), GenderEnum.Gender.MALE);
//		
//		GenericsTryOut<K, T> genericTest1 = new GenericsTryOut<>();
//		genericTest1.display(new K(), new T());
//		
		GenericsTryOut genericTest2 = new GenericsTryOut();
		genericTest2.display("Test");
	}
	
	public static class GenderEnum {

		enum Gender {
			MALE, FEMALE
		}
	}
	
	public static class K{
		K() {
			System.out.println("At K");
		}
	}
	
	public static class T{
		T() {
			System.out.println("At T");
		}
	}
}


