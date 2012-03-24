package com.sunking.swing;

/**
 * <p>Title: OpenSwing</p>
 * <p>Description: JDateField 日期输入框</p>
 *                 确保输入正确的日期
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */

import java.io.*;
import java.text.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;

import com.sunking.swing.refer.*;

public class JDateField
    extends JTextField
    implements Serializable {
    /**
     * 年月日格式
     */
    public static final SimpleDateFormat dateFormat
        = new SimpleDateFormat("yyyy-MM-dd");

    private JDateDocument doc = new JDateDocument(this,dateFormat);
    public JDateField() {
        setPreferredSize(new Dimension(100, 25));
        setDocument(doc);
        super.setHorizontalAlignment(JTextField.CENTER);
    }

    /**
     * 取得日期
     * @return Date
     */
    public Date getDate() {
        try {
            return dateFormat.parse(this.getText());
        }
        catch (Exception ex) {
            return new Date();
        }
    }

    /**
     * 设置日期
     * @return Date
     */
    public void setDate(Date date) {
        try {
            dateFormat.format(date);
        }
        catch (Exception ex) {
            dateFormat.format(new Date());
        }
    }

    /**
     * 测试
     * @param args String[]
     */
    public static void main(String[] args) {
        JFrame frame = OpenSwingUtil.createDemoFrame("JDateField Demo");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JDateField(), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
