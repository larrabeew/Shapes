package org.cvtc.shapes.test;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.Parameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class CylinderRenderTest {

	@Test
	@Parameters({
		"3, 1",
		"4, 5",
		"5, 4",
		"1, 1"
	})
	public void contructorTestRender(float radius, int height){
		//1.Arrange
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
				
		Cylinder cylinder = new Cylinder(radius, height, messageBoxSub);
		
		//2.Act
		cylinder.render();
				
		//3.Assert
		
	}
}