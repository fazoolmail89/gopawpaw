package com.sunking.swing;

import java.io.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

//import java.awt.event.*;
/**
 * <p>Title: OpenSwing</p>
 * <p>Description: JStringField 限制可输入长度的文字输入框</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */
public class JStringField
    extends JTextField
    implements Serializable {
    public JStringField() {
        this(255);
    }

    public JStringField(int MaxLen) {
        setPreferredSize(new Dimension(100, 25));
        setDocument(new StringDocument(MaxLen));
    }

    public static void main(String[] args){
        JFrame frame = OpenSwingUtil.createDemoFrame("JStringField Demo");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JStringField(10), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

class StringDocument
    extends PlainDocument {
    int MaxLength;
    public StringDocument(int MaxLen) {
        MaxLength = MaxLen;
    }

    public void insertString(int offset, String s, AttributeSet attributeSet) throws
        BadLocationException {
        int sLen = s.length();
        int conLen = getLength();
        String str = getText(0, conLen);
        if ( ( (sLen + conLen) > MaxLength) || s.equals("\'") || s.equals("\"")) {
            Toolkit.getDefaultToolkit().beep();
            return;
        }
        super.insertString(offset, s, null);
    }
}
