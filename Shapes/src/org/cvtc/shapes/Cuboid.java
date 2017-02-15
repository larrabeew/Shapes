/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Wesley Larrabee
 * This class is for creating Cuboids.  You can set the width, height, and length along with calculating the SF and volume.
 *
 */
public class Cuboid extends Shape {
	
	private float width = (float) 0.0;
	
	private float height = (float) 0.0;
	
	private float depth = (float) 0.0;
	
	public float getWidth() {
		//Returns the width of the Cuboid
		return width;
	}

	private void setWidth(float width) {
		//sets the width of the Cuboid
		this.width = width;
	}
	
	public float getHeight() {
		//Returns the height of the Cuboid
		return height;
	}

	private void setHeight(float height) {
		//sets the height of the Cuboid
		this.height = height;
	}

	public float getDepth() {
		//Returns the depth of the Cuboid
		return depth;
	}

	private void setDepth(float depth) {
		//sets the depth of the Cuboid
		this.depth = depth;
	}
	
	
	public Cuboid(float width, float height, float depth, Dialog dialog) throws IllegalArgumentException{
		
		super(dialog);
		//Constructor class for the Cuboid
		//Check for negative numbers and make them equal to 0
		if(width <= 0.0){
			throw new IllegalArgumentException(Float.toString(width));
		}
		if(height <= 0.0){
			throw new IllegalArgumentException(Float.toString(height));
		}
		if(depth <= 0.0){
			throw new IllegalArgumentException(Float.toString(depth));
		}
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	@Override
	public float surfaceArea() {
		//return formula for surface area of a Cuboid SF = 2(depth*width + width*height + depth*height)
		return 2 * ((getDepth() * getWidth()) + (getWidth() * getHeight()) + (getHeight() * getDepth()));
	}

	@Override
	public float volume() {
		// return formula for volume of a Cuboid V = depth*width*height
		return getDepth()*getHeight()*getWidth();
	}

	@Override
	public void render() {
		//render function for the Cuboid
		//JOptionPane.showMessageDialog(null, "The cubiod is " + getWidth() + " x " + getHeight() + " x " +  getDepth() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume());
		this.getDialog().show("The cubiod is " + getWidth() + " x " + getHeight() + " x " +  getDepth() + ".  Having a surface area of " + surfaceArea() + " and a volume of " + volume(), "Cuboid");
	}
	
}
