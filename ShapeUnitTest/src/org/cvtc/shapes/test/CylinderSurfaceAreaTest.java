/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.*;

/**
 * @author wlarrabee
 *
 */
@RunWith(JUnitParamsRunner.class)
public class CylinderSurfaceAreaTest {

	@Test
	@Parameters({
		"2, 3",
		"4, 5",
		"8, 1",
		"0, 3",
		"3, 0",
		"-4, 5",
		"5, -4",
		"-1, -1"		
	})
	public void surfaceAreaTest(float radius, float height){
		//1.Arrange
		final double DELTA = 1e-15;
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Cylinder cylinder = new Cylinder(radius, height, messageBoxSub);
		
		float expected = 2 * (float)Math.PI * radius * height + 2 * (float)Math.PI * radius * radius;
		
		//2.Act
		float actual = cylinder.surfaceArea();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}

}
