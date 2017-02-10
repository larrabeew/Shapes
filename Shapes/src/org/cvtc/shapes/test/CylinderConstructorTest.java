package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CylinderConstructorTest {

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
	public void contructorTestRadius(float radius, int height){
		//1.Arrange
		final double DELTA = 1e-15;
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		float expected = radius;
		
		//2.Act
		float actual = cylinder.getRadius();
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}
	
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
	public void contructorTestHeight(float radius, float height){
		//1.Arrange
		final double DELTA = 1e-15;
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		float expected = height;
		
		//2.Act		
		float actual = cylinder.getHeight();
				
		//3.Assert
		assertEquals(expected, actual, DELTA);
		
	}
	
}
