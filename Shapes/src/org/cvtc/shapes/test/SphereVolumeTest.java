/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author wlarrabee
 *
 */
@RunWith(JUnitParamsRunner.class)
public class SphereVolumeTest {

	@Test
	@Parameters({
		"2",
		"4",
		"8",
		"0",
		"-1"		
	})
	public void volumeTest(float radius){
		//1.Arrange
		final double DELTA = 1e-15;
		
		Sphere sphere = new Sphere(radius);

		float expected = (float)Math.PI * radius * radius * radius * 4 / 3;
		
		//2.Act
		float actual = sphere.volume();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}
}
