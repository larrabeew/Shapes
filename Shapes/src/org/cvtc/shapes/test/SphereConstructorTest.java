package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class SphereConstructorTest {

	@Test
	@Parameters({
		"2",
		"4",
		"8",
		"0",
		"-1"	
	})
	public void contructorTestRadius(float radius){
		//1.Arrange
		final double DELTA = 1e-15;
		
		Sphere sphere = new Sphere(radius);
		
		if(radius < 0.0){
			radius = 0;
		}
		
		
		float expected = radius;
		
		//2.Act
		float actual = sphere.getRadius();
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}

}
