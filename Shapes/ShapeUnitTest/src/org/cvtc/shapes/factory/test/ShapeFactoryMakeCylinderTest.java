package org.cvtc.shapes.factory.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.ShapeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ShapeFactoryMakeCylinderTest {

	@Test
	@Parameters({
		"2, 3",
		"4, 5",
		"8, 1"		
	})
	public void testMakeCylinder(float height, float radius) {
		
		final double DELTA = 1e-15;
		
		MessageBox dialog = new MessageBox(); 
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		Cylinder cylinder = shapeFactory.makeCylinder(radius, height);
		
		float expected = radius;
		
		float actual = cylinder.getRadius();
		
		assertEquals(expected, actual, DELTA);
		
	}

}
