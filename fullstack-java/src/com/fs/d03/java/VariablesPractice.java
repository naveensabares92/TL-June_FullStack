// Practise on class hours

package com.fs.d03.java;

public class VariablesPractice {

	static int staticVar;
	int nonStaticVar;
	
	VariablesPractice() {
		// TODO Auto-generated constructor stub
		
		VariablesPractice.staticVar = 1;
		this.nonStaticVar = 2;
		this.getStaticVar();
		VariablesPractice.setStaticVar(nonStaticVar);
	}
	
	public static void main(String[] args) {
		VariablesPractice name = new VariablesPractice();
		System.out.println("Before set - Static var : " + name.getStaticVar());
		System.out.println("Before set - non-static var : " + name.getNonStaticVar() + "\n \n ");
		
		setStaticVar(22);
		System.out.println("After set - Static var : " + name.getStaticVar());
		name.setNonStaticVar(23);
		System.out.println("After set - non-static var : " + name.getNonStaticVar());
		
		VariablesPractice name1 = new VariablesPractice();
		name1.setNonStaticVar(24);
		System.out.println("After set - non-static var : " + name1.getNonStaticVar());
		
		VariablesPractice.setStaticVar(25);

		System.out.println("After set - Static var : " + name.getStaticVar());
		setStaticVar(29);
		
		VariablesPractice name2 = new VariablesPractice();
		name2.setNonStaticVar(100);
		System.out.println("After set - non-static var : " + name.getNonStaticVar());
		System.out.println("After set - non-static var : " + name1.getNonStaticVar());
		System.out.println("After set - non-static var : " + name2.getNonStaticVar());
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(staticVar);
	}

	public int getStaticVar() {
		return staticVar;
	}

	public static void setStaticVar(int staticVar) {
		VariablesPractice.staticVar = staticVar;
	}

	public int getNonStaticVar() {
		return nonStaticVar;
	}

	public void setNonStaticVar(int nonStaticVar) {
		this.nonStaticVar = nonStaticVar;
	}
}
