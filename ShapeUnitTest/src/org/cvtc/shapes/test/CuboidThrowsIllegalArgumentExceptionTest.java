/**
 * 
 */
package org.cvtc.shapes.test;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author weslar
 *
 */
@RunWith(JUnitParamsRunner.class)
public class CuboidThrowsIllegalArgumentExceptionTest {

	@Test(expected=IllegalArgumentException.class)
	@Parameters({
		"3, 0, 5",
		"-4, 5, -2",
		"5, -4, 3",
		"-1, -1, -3"
	})
	public void throwsIllegalArgumentExceptionTest(float width, float height, float depth){
		//1.Arrange and the expeced is taken care of above
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Cuboid cuboid = new Cuboid(width, height, depth, messageBoxSub);
		
	}

}
