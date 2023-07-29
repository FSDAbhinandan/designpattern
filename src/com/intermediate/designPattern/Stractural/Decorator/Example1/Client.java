package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class Client {
	public static void main(String[] args) {
		IceCream ic = new ChocolateScoop(
				 new VanilaScoop(
							new ChocolateSyrup(
									new OrangeCone(
											new VanillaSyrup(
													new ChocolateCone()
													)
											)
									)
							)
				);
		
		System.out.println(ic.getDescription());
		System.out.println(ic.getcost());
	}
}
