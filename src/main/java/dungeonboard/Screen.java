package dungeonboard;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;

public class Screen {
	
	private final Rectangle rectangle;
	private final String name;
	
	public Screen(GraphicsDevice graphicsDevice) {
		rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
		name = graphicsDevice.getIDstring();
	}
	
	@Override
	public String toString() {
		return String.format("%s  %dx%d", name, rectangle.width, rectangle.height);
	}

	public Dimension getSize() {
		return rectangle.getSize();
	}

	public Rectangle getRectangle() {
		return rectangle;
	}
}