package org.cvtc.shapes.test;


import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.test.subsitutes.MessageBoxSub;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.Parameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class SphereRenderTest {

	@Test
	@Parameters({
		"3",
		"4",
		"5",
		"1"
	})
	public void contructorTestRender(float radius){
		//1.Arrange
		
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		
		Sphere sphere = new Sphere(radius, messageBoxSub);		
		
		//2.Act
		sphere.render();
				
		//3.Assert		
		
	}

}
