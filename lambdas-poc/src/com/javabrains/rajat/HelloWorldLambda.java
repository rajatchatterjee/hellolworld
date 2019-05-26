package com.javabrains.rajat;

public class HelloWorldLambda {

	public static void main(String[] args) {
		new HelloWorldLambda().print(() -> System.out.println("Hello"));
	}

	private void print(Printer p) {
		p.call();
	}

}

interface Printer {
	public void call();
}
