/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Wesley Larrabee
 * This class is for creating spheres.  You can set the radius along with calculating the SF and volume.
 *
 */
public class Sphere extends Shape {
	
	private float radius = (float) 0.0;
	
	public float getRadius() {
		//gets the radius for the sphere
		return radius;
	}

	private void setRadius(float radius) {
		//sets the radius for the Cylinder
		this.radius = radius;
	}

	public Sphere(float radius, Dialog dialog) throws IllegalArgumentException{
		//Constructor class for the sphere
		super(dialog);
		//Check for negative numbers and make them equal to 0
		if(radius <= 0){
			throw new IllegalArgumentException(Float.toString(radius));
		}
		setRadius(radius);	
	}

	@Override
	public float surfaceArea() {
		//return formula for surface area of a sphere SF = 4 * pi * radius ^ 2
		return 4 * (float)Math.PI * getRadius() * getRadius();
	}

	@Override
	public float volume() {
		// return formula for volume of a sphere V = 4/3 pi * radius ^ 3
		return (float)Math.PI * getRadius() * getRadius() * getRadius() * 4 / 3;
	}

	@Override
	public void render() {
		//render function for the sphere
		//JOptionPane.showMessageDialog(null, "The sphere has a radius of " + getRadius() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume());
		this.getDialog().show("The sphere has a radius of " + getRadius() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume(), "Sphere");
	}
	
}
