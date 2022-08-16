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

public class Point {
	
	double tuple[] = new double[3];
	
	Point(double[] tuple) {
		this.tuple = tuple;
	}
	
	
	Point addVectorToPoint(Vector v) {
		double coords[] = {this.tuple[0]+v.tuple[0], this.tuple[1]+v.tuple[1], this.tuple[2]+v.tuple[2]};
		return new Point(coords);
	}
	
	Point subtractVectorFromPoint(Vector v) {
		double coords[] = {this.tuple[0]-v.tuple[0], this.tuple[1]-v.tuple[1], this.tuple[2]-v.tuple[2]};
		return new Point(coords);
	}
	
	
	Vector subtractPointFromPoint(Point p) {
		double coords[] = {this.tuple[0]-p.tuple[0], this.tuple[1]-p.tuple[1], this.tuple[2]-p.tuple[2]};
		return new Vector(coords);
	}
	
	void setPointToPoint(Point p) {
		for(int i = 0; i < 4; i++) {
			this.tuple[i] = p.tuple[i];
		}
	}
	
	void drawPoint() {
		glClear(GL_COLOR_BUFFER_BIT);
		glBegin(GL_POINTS);
		glVertex3d(this.tuple[0], this.tuple[1], this.tuple[2]);
		glEnd();
	}
	
}
