import java.lang.Math;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Vector {

	double tuple[] = new double[3];
	
	Vector(double tuple[]) {
		this.tuple = tuple;
	}

	Vector addVectors(Vector v) {
		double coords[] = new double[3];
		for (int i = 0; i < 4; i++) {
			coords[i] = this.tuple[i] + v.tuple[i];
		}
		return new Vector(coords);
	}

	Vector subtractVectors(Vector v) {
		double coords[] = new double[3];
		for (int i = 0; i < 4; i++) {
			coords[i] = this.tuple[i] - v.tuple[i];
		}
		return new Vector(coords);

	}

	Vector RotateXY(double degrees) {
		double radians = Math.toRadians(degrees);
		double b0 = (this.tuple[0] * Math.cos(radians)) - (this.tuple[1] * Math.sin(radians));
		double b1 = (this.tuple[0] * Math.sin(radians)) + (this.tuple[1] * Math.cos(radians));
		double coords[] = {b0, b1, this.tuple[2]};
		Vector vec = new Vector(coords);
		return vec;
	}
	
	Vector RotateYZ(double degrees) {
		double radians = Math.toRadians(degrees);
		double b0 = (this.tuple[0] * Math.cos(radians)) + (this.tuple[2] * Math.sin(radians));
		double b2 = (this.tuple[2] * Math.cos(radians)) - (this.tuple[0] * Math.sin(radians));
		double coords[] = {b0, this.tuple[1], b2};
		Vector vec = new Vector(coords);
		return vec;
		
	}
	
	Vector RotateXZ(double degrees) {
		double radians = Math.toRadians(degrees);
		double b1 = (this.tuple[1] * Math.cos(radians)) - (this.tuple[2] * Math.sin(radians));
		double b2 = (this.tuple[1] * Math.sin(radians)) + (this.tuple[2] * Math.cos(radians));
		double coords[] = {this.tuple[0], b1, b2};
		Vector vec = new Vector(coords);
		return vec;
		
	}
	
	Vector scale(double s1, double s2, double s3) {
		double coords[] = {this.tuple[0] * s1, this.tuple[1] * s2, this.tuple[2] * s3};
		Vector vec = new Vector(coords);
		return vec;
	}
	
}
