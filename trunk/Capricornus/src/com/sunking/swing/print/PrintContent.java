package com.sunking.swing.print;

import java.util.*;

import java.awt.*;
import java.awt.print.*;

import com.sunking.swing.print.content.*;

/**
 * <p>Title: OpenSwing</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */
public class PrintContent {
    private Vector vAllContents = new Vector();
    private Component c;
    public PrintContent() {
    }

    public void println() {
        vAllContents.add(new Content(null, null));
    }

    public void print(PrintContentInterface content, Font f) {
        vAllContents.add(new Content(content, f));
    }

    public void println(PrintContentInterface content, Font f) {
        print(content, f);
        println();
    }

    public void print(PrintContentInterface content) {
        vAllContents.add(new Content(content, null));
    }

    public void println(PrintContentInterface content) {
        print(content);
        println();
    }

    public void setStartPos(int i) {
        vAllContents.add(new Content(new StartPos(i), null));
    }

    public void setColor(Color c) {
        vAllContents.add(new Content(new PrintColor(c), null));
    }

    public void draw(Graphics g, Point p, PageFormat pf) {
        FontMetrics fm = g.getFontMetrics();
        int pw = (int) pf.getImageableWidth();
        int ph = (int) pf.getImageableHeight();
        p.y = fm.getHeight() * 2; //最开始时将纵坐标移下
        int startPos = 2;

        for (int i = 0; i < vAllContents.size(); i++) {
            Content content = (Content) vAllContents.elementAt(i);
            Font newFont = content.getFont();
            pw = (int) (pf.getImageableWidth() - startPos);
            if (p.x < startPos) p.x = startPos;
            if (newFont != null) {
                g.setFont(newFont);
                fm = g.getFontMetrics();
            }

            PrintContentInterface obj = content.getContent();
            if (obj == null) { //换行
                p.x = startPos;
                p.y += fm.getHeight();
                if (p.y % ph < fm.getHeight() * 1.25) p.y += fm.getHeight();
            }
            else if (obj instanceof StartPos) { //重置起点
                startPos = ( (StartPos) obj).getStartPos();
            }
            else {
                obj.draw(g, p, pf, startPos);
            }
        }
    }
}

class Content {
    PrintContentInterface content;
    Font f;
    public Content(PrintContentInterface content, Font f) {
        this.content = content;
        this.f = f;
    }

    public PrintContentInterface getContent() {
        return content;
    }

    public Font getFont() {
        return f;
    }
}

class PrintColor
    implements PrintContentInterface {
    Color c;
    public PrintColor(Color c) {
        this.c = c;
    }

    public void draw(Graphics g, Point p, PageFormat pf, int startPos) {
        g.setColor(c);
    }
}

class StartPos
    implements PrintContentInterface {
    int pos;
    public StartPos(int pos) {
        this.pos = pos;
    }

    public int getStartPos() {
        return pos;
    }

    public void draw(Graphics g, Point p, PageFormat pf, int startPos) {
        //
    }
}
