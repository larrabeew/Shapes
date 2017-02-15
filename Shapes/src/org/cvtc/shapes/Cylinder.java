/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Wesley Larrabee
 * This class is for creating cylinders.  You can set the height and radius along with calculating the SF and volume.
 *
 */
public class Cylinder extends Shape {
	
	private float radius = (float) 0.0;
	
	private float height = (float) 0.0;
	
	public float getRadius() {
		//gets the radius for the Cylinder
		return radius;
	}

	private void setRadius(float radius) {
		//sets the radius for the Cylinder
		this.radius = radius;
	}

	public float getHeight() {
		//gets the height for the Cylinder
		return height;
	}

	private void setHeight(float height) {
		//sets the height for the Cylinder
		this.height = height;
	}

	public Cylinder(float radius, float height, Dialog dialog) throws IllegalArgumentException{
		
		super(dialog);
		//Constructor class for the Cylinder
		//Check for negative numbers and make them equal to 0
		if(radius <= 0){
			throw new IllegalArgumentException(Float.toString(radius));
		}
		if(height <= 0){
			throw new IllegalArgumentException(Float.toString(height));
		}
		setRadius(radius);
		setHeight(height);		
	}

	@Override
	public float surfaceArea() {
		//return formula for surface area of a Cylinder SF = 2 * pi * radius * height + 2 * pi * radius ^ 2
		return 2 * (float)Math.PI * getRadius() * getHeight() + 2 * (float)Math.PI * getRadius() * getRadius();
	}

	@Override
	public float volume() {
		// return formula for volume of a Cylinder V = pi * radius ^ 2 * height
		return (float)Math.PI * getRadius() * getRadius() * getHeight();
	}

	@Override
	public void render() {
		//render function for the Cylinder
		//JOptionPane.showMessageDialog(null, "The cylinder is " + getRadius() + " x " + getHeight() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume());
		this.getDialog().show("The cylinder is " + getRadius() + " x " + getHeight() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume(), "Cylinder");
	}
	
}
