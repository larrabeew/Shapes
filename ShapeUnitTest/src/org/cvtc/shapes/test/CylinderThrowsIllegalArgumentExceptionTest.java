/**
 * 
 */
package org.cvtc.shapes.test;

import org.cvtc.shapes.Cylinder;
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
public class CylinderThrowsIllegalArgumentExceptionTest {

	@Test(expected=IllegalArgumentException.class)
	@Parameters({
		"-1, -1",
		"1, 1"
	})
	public void throwsIllegalArgumentExceptionTest(float radius, float height){
		//1.Arrange and the expeced is taken care of above
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Cylinder cylinder = new Cylinder(radius, height, messageBoxSub);
		
	}

}
