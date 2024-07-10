/*
 * This java file is a Demo Java program which depicts 
 *  Test class.
 */

package com.package2;
import com.package1.MyClass;

public class Test extends MyClass {
	
	/**
	 * @param var1
	 * @param var2
	 * @param var3
	 * @param var4
	 */
	public Test(int var1, int var2, int var3, int var4) {
		super(var1, var2, var3, var4);
	}

	public static void main(String[] args) {
		System.out.println("Using MyClass with Inheritance....");
		Test test = new Test(1,2,3,4);
		/*
		 * There will be compilation error if we try to 
		 * uncomment the following line as var1 is 
		 * having private access in com.mypackage1.MyClass
		 */
		//System.out.println("Private Access: "+ test.var1);
		
		/*
		 * There will be compilation error if we try to 
		 * uncomment the following line as var2 is 
		 * having default access in com.mypackage1.MyClass
		 */
		
		//System.out.println("Default Access: var2 = " + test.var2);
	
		/*
		 * We can easily access var3 in Test as it is having 
		 * protected access in MyClass and our Test class extends
		 * MyClass
		 */
		System.out.println("Protected Access: var3 = "+test.var3);
		System.out.println("Public Access: var4 = "+ test.var4);
		
		System.out.println("Using MyClass without Inheritance....");
		MyClass myClass  = new MyClass(1,2,3,4);
		/*
		 *There will be compilation error if we try to 
		 * uncomment the following line as the subclass 
		 * can see the protected member
		 * only through inheritance.
 		 */
		//System.out.println("Protected Access: var3 = "+myClass.var3);
		System.out.println("Public Access: var4 = "+myClass.var4);
	}
}
