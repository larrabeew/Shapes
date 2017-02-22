package org.cvtc.shapes.factory.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.ShapeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ShapeFactoryMakeCuboidTest {

	@Test
	@Parameters({
		"2, 3, 1",
		"4, 5, 3",
		"8, 1, 5"		
	})
	public void testMakeCuboidTest(float width, float height, float depth) {
		
		final double DELTA = 1e-15;
		
		MessageBox dialog = new MessageBox(); 
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		Cuboid cuboid = shapeFactory.makeCuboid(width, height, depth);
		
		float expected = width;
		
		float actual = cuboid.getWidth();
		
		assertEquals(expected, actual, DELTA);
		
		
	}

}
