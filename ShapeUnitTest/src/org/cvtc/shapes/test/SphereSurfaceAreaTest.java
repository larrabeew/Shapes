/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.*;

/**
 * @author wlarrabee
 *
 */
@RunWith(JUnitParamsRunner.class)
public class SphereSurfaceAreaTest {

	@Test
	@Parameters({
		"2",
		"4",
		"8",
		"0",
		"-1"		
	})
	public void surfaceAreaTest(float radius){
		//1.Arrange
		final double DELTA = 1e-15;
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Sphere sphere = new Sphere(radius, messageBoxSub);
		
		float expected = (4 * (float)Math.PI * radius * radius);
		
		//2.Act
		float actual = sphere.surfaceArea();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}

}
