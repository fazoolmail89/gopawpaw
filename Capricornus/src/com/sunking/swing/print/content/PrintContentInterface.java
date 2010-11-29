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

public interface PrintContentInterface {
    void draw(Graphics g, Point p, PageFormat pf, int startPos);
}
