package com.sunking.swing.print.content;

import java.awt.*;
import java.awt.print.*;

/**
 * <p>Title: OpenSwing</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */

public class PrintRightString
    implements PrintContentInterface {
    String s;
    public PrintRightString(String s) {
        this.s = s;
    }

    public void draw(Graphics g, Point p, PageFormat pf, int startPos) {
        FontMetrics fm = g.getFontMetrics();
        int pw = (int) (pf.getImageableWidth() - startPos);
        int ph = (int) pf.getImageableHeight();

        p.x = (int) (pw - fm.stringWidth(s));
        g.drawString(s, p.x, p.y);
        p.x = pw;
    }
}
