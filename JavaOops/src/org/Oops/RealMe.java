package org.Oops;

public class RealMe implements Samsung {


	@Override
	public void call() {

		System.out.println("Calling..........");
	}

	@Override
	public void camera() {

		System.out.println("Capture the image.........");
	}

	@Override
	public void fingerPrint() {

		System.out.println("Lock/Unlock");
	}

public static void main(String[] args) {

	RealMe r = new RealMe();
	r.call();
	r.camera();
	r.fingerPrint();
	
}
}