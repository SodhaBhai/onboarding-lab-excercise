package com.amdocs;

public class Mobile {
	
	private Camera camera;
	public Mobile() {
		camera = new Camera();
	}
	public Mobile(Camera camera)
	{
		this.camera = camera;
	}
	
	
	
	public boolean startPhotoApp() {
		
		System.out.println("Inside start photo app method");
		if( camera.on()) {
			System.out.println("Positve code path");
			System.out.println("Assume some hardware interaction happens here");
			return true;
		}
		System.out.println("Negative code path");
		System.out.println("Assume some exception handling and error long happens here");
		return false;
	}

}
