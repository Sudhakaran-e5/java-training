/*
 * This java file is a Demo Java program which depicts 
 *  AccessSpeciferDemo class.
 */
package com.package1;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass(1,2,3,4);
		
		/*
		 * There will be compilation error if we try to 
		 * uncomment the following line as var1 is 
		 * having private access in com.mypackage1.MyClass
		 */
		//System.out.println("Private Access: "+ myClass.var1);
		
		System.out.println("Default Access: var2 = " + myClass.var2);
		System.out.println("Protected Access: var3 = "+myClass.var3);
		System.out.println("Public Access: var4 = "+ myClass.var4);
	}
}
