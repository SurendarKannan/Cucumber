package org.Oops;

public class Honor extends Nokia{

	@Override
	public void camera() {

		System.out.println("Capture the image");
	}

	public static void main(String[] args) {

		Honor h = new Honor();
		h.call();
		h.text();
		h.camera();
		
	}


}
