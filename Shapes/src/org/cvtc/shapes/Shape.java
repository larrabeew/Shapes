/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Wesley Larrabee
 * This is the superclass for the shapes.  The Cuboid, Cylinder, and Sphere will be subclass of this class to start.
 * 
 *
 */
public abstract class Shape {
	
	private Dialog dialog;
	
	public float surfaceArea(){
		//dummy function to handle sf
		return 0;
	}
	
	public float volume(){
		//dummy function to handle volume
		return 0;
	}
	
	public void render(){
		//dummy function for rendering
	}
	
	public Shape(Dialog dialog){
		setDialog(dialog);
	}

	public Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
}
