/**
 * 
 */
package com.gopawpaw.frame.common;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import com.gopawpaw.frame.javax.swing.GppJPanel;

/**
 * @version 2010-6-4
 * @author Àî½õ»ª
 * 
 */
public class GppActionPanel extends GppJPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 884656227428201952L;

	String text;
	Font font;
	private boolean selected;
	BufferedImage open, closed;
	public Rectangle target;
	final int OFFSET = 100, PAD = 5;

	/**
	 * 
	 */
	public GppActionPanel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public GppActionPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public GppActionPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public GppActionPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	

    public GppActionPanel(String text, MouseListener ml) {
        this.text = text;
        addMouseListener(ml);
        font = new Font("sans-serif", Font.PLAIN, 12);
        selected = false;
        setBackground(new Color(200, 200, 220));
        setPreferredSize(new Dimension(100, 20));
        setBorder(BorderFactory.createRaisedBevelBorder());
        setLayout(new BorderLayout());
        add(new JButton(text), BorderLayout.CENTER);
//        setPreferredSize(new Dimension(200, 20));
//        createImages();
        setRequestFocusEnabled(true);
    }

    public void toggleSelection() {
        selected = !selected;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        if (selected)
            g2.drawImage(open, PAD, 0, this);
        else
            g2.drawImage(closed, PAD, 0, this);
        g2.setFont(font);
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics(text, frc);
        float height = lm.getAscent() + lm.getDescent();
        float x = OFFSET;
        float y = (h + height) / 2 - lm.getDescent();
        g2.drawString(text, x, y);
    }

    private void createImages() {
        int w = 20;
        int h = getPreferredSize().height;
        target = new Rectangle(2, 0, 20, 18);
        open = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = open.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(getBackground());
        g2.fillRect(0, 0, w, h);
        int[] x = { 2, w / 2, 18 };
        int[] y = { 4, 15, 4 };
        Polygon p = new Polygon(x, y, 3);
        g2.setPaint(Color.green.brighter());
        g2.fill(p);
        g2.setPaint(Color.blue.brighter());
        g2.draw(p);
        g2.dispose();
        closed = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        g2 = closed.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(getBackground());
        g2.fillRect(0, 0, w, h);
        x = new int[] { 3, 13, 3 };
        y = new int[] { 4, h / 2, 16 };
        p = new Polygon(x, y, 3);
        g2.setPaint(Color.red);
        g2.fill(p);
        g2.setPaint(Color.blue.brighter());
        g2.draw(p);
        g2.dispose();
    }

}
