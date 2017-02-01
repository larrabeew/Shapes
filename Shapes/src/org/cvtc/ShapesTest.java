/**
 * 
 */
package org.cvtc;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Sphere;

/**
 * @author Wesley Larrabee
 * A Test class to make sure the other classes are functioning properly.
 *
 */
public class ShapesTest {

	public static void main(String[] args) {
		//Create Cuboid that is 3 X 4 X 5
		Cuboid cuboid = new Cuboid(3,4,5);
		
		//Create a cylinder with radius 3 and height of 6
		Cylinder cylinder = new Cylinder(3,6);
		
		//Create a sphere with radius of 8
		Sphere sphere = new Sphere(8);
		
		//render each of the new shapes
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}
