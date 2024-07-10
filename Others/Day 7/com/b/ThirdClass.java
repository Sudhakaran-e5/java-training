package com.b;

import com.a.PackageDemo;

public class ThirdClass {

	public static void main(String[] args) {
		PackageDemo demo = new PackageDemo();
		demo.print();
		
		com.a.PackageDemo1 demo1 = new com.a.PackageDemo1();
		demo1.print();

		System.out.println("I am in  Package B Now!!!");
	}
}