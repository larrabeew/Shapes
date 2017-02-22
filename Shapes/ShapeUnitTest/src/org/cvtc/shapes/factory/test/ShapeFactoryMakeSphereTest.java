package org.cvtc.shapes.factory.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.Sphere;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ShapeFactoryMakeSphereTest {

	@Test
	@Parameters({
		"2",
		"4",
		"8"		
	})
	public void testMakeSphere(float radius) {
		
		final double DELTA = 1e-15;
		
		MessageBox dialog = new MessageBox(); 
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		Sphere sphere = shapeFactory.makeSphere(radius);
		
		float expected = radius;
		
		float actual = sphere.getRadius();
		
		assertEquals(expected, actual, DELTA);
		
	}

}
