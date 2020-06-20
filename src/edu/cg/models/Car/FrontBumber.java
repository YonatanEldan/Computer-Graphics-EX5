package edu.cg.models.Car;

import com.jogamp.opengl.GL2;

import edu.cg.models.IRenderable;
import edu.cg.models.SkewedBox;

public class FrontBumber implements IRenderable {
	// TODO: Add fields as you like (and methods if you think they are necessary).
	private SkewedBox bumperBox = new SkewedBox(Specification.F_BUMPER_LENGTH, Specification.F_BUMPER_HEIGHT_1, Specification.F_BUMPER_HEIGHT_2, Specification.F_BUMPER_DEPTH, Specification.F_BUMPER_DEPTH);

	private SkewedBox bumperWingsBox1;


	@Override
	public void render(GL2 gl) {
		// TODO: Render the front bumper relative to it's local coordinate system.
		// Remember the dimensions of the bumper, this is important when you
		// combine the bumper with the hood.
	}

	@Override
	public void init(GL2 gl) {
	}

	@Override
	public String toString() {
		return "FrontBumper";
	}

}
