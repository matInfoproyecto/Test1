package colores;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class JPanelGradientColorHorizontal extends JPanel {
	private static final long serialVersionUID = 1L;

	private Color color1 = Color.WHITE;
	private Color color2 = ColoresBarras.VERY_LIGHT_Blue;;

	@Override
	protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        int w = getWidth();
	        int h = getHeight();
	        GradientPaint gp = new GradientPaint(50, 290, color1, 0, h, color2);
	        g2d.setPaint(gp);    
	        g2d.fillRect(0, 0, w, h);
	        
	    }
}