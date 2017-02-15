/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author wlarrabee
 *
 */
@RunWith(JUnitParamsRunner.class)
public class CylinderVolumeTest {

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
	public void volumeTest(float radius, float height){
		//1.Arrange
		final double DELTA = 1e-15;
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Cylinder cylinder = new Cylinder(radius, height, messageBoxSub);
		
		float expected = (float)Math.PI * radius * radius * height;
		
		//2.Act
		float actual = cylinder.volume();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}
}
