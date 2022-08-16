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

public class Camera {
	double minX, maxX;
	double minY, maxY;
	double minZ, maxZ;
	Object[] inView;
	
	Camera(double minX, double maxX, double minY, double maxY, double minZ, double maxZ, Object[] inView) {
		
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
		this.minZ = minZ;
		this.maxZ = maxZ;
		this.inView = inView;
		
	}
	
	void drawScene() {
		
	}
	
}
