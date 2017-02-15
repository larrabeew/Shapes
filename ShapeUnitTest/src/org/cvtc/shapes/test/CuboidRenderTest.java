package org.cvtc.shapes.test;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CuboidRenderTest {

	@Test
	@Parameters({
		"3, 1, 5",
		"4, 5, 2",
		"5, 4, 3",
		"1, 1, 3"
	})
	public void contructorTestRender(float width, float height, float depth){
		//1.Arrange
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Cuboid cuboid = new Cuboid(width, height, depth, messageBoxSub);

		cuboid.render();
		
	}
}