/**
 * 
 */
package org.cvtc.shapes.test;

import org.cvtc.shapes.Sphere;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author weslar
 *
 */
@RunWith(JUnitParamsRunner.class)
public class SphereThrowsIllegalArgumentExceptionTest {

	@Test(expected=IllegalArgumentException.class)
	@Parameters({
		"0",
		"-1"
	})
	public void throwsIllegalArgumentExceptionTest(float radius){
		//1.Arrange and the expeced is taken care of above
		
		Sphere sphere = new Sphere(radius);
		
	}

}
