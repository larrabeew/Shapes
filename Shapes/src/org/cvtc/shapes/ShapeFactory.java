package org.cvtc.shapes;

public class ShapeFactory {
	
	public Dialog dialog = null;

	public ShapeFactory(Dialog dialog){
		this.dialog = dialog;
	}
	
	public Cuboid makeCuboid(float width, float hieght, float depth){
		
		return new Cuboid(width, hieght, depth, dialog);
		
	}
	
	public Sphere makeSphere(float radius){
		
		return new Sphere(radius, dialog);
		
	}
	
	public Cylinder makeCylinder(float radius, float height){
		
		return new Cylinder(radius, height, dialog);
		
	}
	
}
