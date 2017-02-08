/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
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
	public void surfaceAreaTest(int y){
		//1.Arrange
		final double DELTA = 1e-15;
		Sphere sphere = new Sphere(y);
		double expected = (4 * (float)Math.PI * y * y);
		
		//2.Act
		double actual = sphere.surfaceArea();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}

}
