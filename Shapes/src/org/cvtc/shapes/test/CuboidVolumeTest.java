/**
 * 
 */
package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author wlarrabee
 *
 */
@RunWith(JUnitParamsRunner.class)
public class CuboidVolumeTest {

	@Test
	@Parameters({
		"2, 3, 1",
		"4, 5, 3",
		"8, 1, 5",
		"0, 3, 4",
		"3, 0, 5",
		"-4, 5, -2",
		"5, -4, 3",
		"-1, -1, -3"		
	})
	public void volumeTest(float width, float height, float depth){
		//1.Arrange
		final double DELTA = 1e-15;
		
		Cuboid cuboid = new Cuboid(width, height, depth);
		
		if(width < 0.0){
			width = 0;
		}
		
		if(height < 0.0){
			height = 0;
		}
		
		if(depth < 0.0){
			depth = 0;
		}
		
		float expected = depth*height*width;
		
		//2.Act
		float actual = cuboid.volume();		
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}
}
