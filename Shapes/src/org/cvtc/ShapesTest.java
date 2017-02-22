/**
 * 
 */
package org.cvtc;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.Sphere;

/**
 * @author Wesley Larrabee
 * A Test class to make sure the other classes are functioning properly.
 *
 */
public class ShapesTest {

	public static void main(String[] args) {
		
		try{
			MessageBox dialog = new MessageBox();
			
			ShapeFactory shapeFactory = new ShapeFactory(dialog);
			
			//Create Cuboid that is 3 X 4 X 5
			//Cuboid cuboid = new Cuboid(1,4,5, dialog);
			Cuboid cuboid = shapeFactory.makeCuboid(3, 4, 5);
		
			//Create a cylinder with radius 3 and height of 6
			//Cylinder cylinder = new Cylinder(3,6, dialog);
			Cylinder cylinder = shapeFactory.makeCylinder(3,6);
		
			//Create a sphere with radius of 8
			//Sphere sphere = new Sphere(8, dialog);
			Sphere sphere = shapeFactory.makeSphere(8);
						
		
			//render each of the new shapes
			cuboid.render();
			cylinder.render();
			sphere.render();
		}
		catch (Exception e){
			//Show msgbox for incorrect inout
			
			JOptionPane.showMessageDialog(null, "You have input a value of 0 or below.");
		}
		
	}

}
