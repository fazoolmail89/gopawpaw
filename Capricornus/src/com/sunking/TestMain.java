package com.sunking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sunking.swing.*;
import com.sunking.swing.print.*;

public class TestMain extends JFrame implements ActionListener{
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu menuBasic = new JMenu();
    JMenuItem itemJCalendarPanel = new JMenuItem();
    JMenuItem itemJDateField = new JMenuItem();
    JMenuItem itemJDatePicker = new JMenuItem();
    JMenuItem itemJDirChooser = new JMenuItem();
    JMenuItem itemJFileTree = new JMenuItem();
    JMenuItem itemJFontDialog = new JMenuItem();
    JMenuItem itemJGroupPanel = new JMenuItem();
    JMenuItem itemJIpAddressField = new JMenuItem();
    JMenuItem itemJListChooser = new JMenuItem();
    JMenuItem itemJNumberField = new JMenuItem();
    JMenuItem itemJPopupButton = new JMenuItem();
    JMenuItem itemJStatusBar = new JMenuItem();
    JMenuItem itemJStringField = new JMenuItem();
    JMenuItem itemJTreeComboBox = new JMenuItem();
    JMenuItem itemJCloseableTabbedPane = new JMenuItem();
    JMenuItem itemExit = new JMenuItem();
    JMenu jMenu2 = new JMenu();
    JMenuItem itemPrint = new JMenuItem();
    public TestMain(){
        try{
            jbInit();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception{
        this.setJMenuBar(jMenuBar1);
        menuBasic.setText("Basic");
        itemJCalendarPanel.setText("JCalendarPanel");
        itemJCloseableTabbedPane.setText("JCloseableTabbedPane");
        itemJDateField.setText("JDateField");
        itemJDatePicker.setText("JDatePicker");
        itemJDirChooser.setText("JDirChooser");
        itemJFileTree.setText("JFileTree");
        itemJFontDialog.setText("JFontDialog");
        itemJGroupPanel.setText("JGroupPanel");
        itemJIpAddressField.setText("JIpAddressField");
        itemJListChooser.setText("JListChooser");
        itemJNumberField.setText("JNumberField");
        itemJPopupButton.setText("JPopupButton");
        itemJStatusBar.setText("JStatusBar");
        itemJStringField.setText("JStringField");
        itemJTreeComboBox.setText("JTreeComboBox");
        itemExit.setText("Exit");

        jMenu2.setText("Advanced");
        itemPrint.setText("Print Demo");
        jMenuBar1.add(menuBasic);
        jMenuBar1.add(jMenu2);

        menuBasic.add(itemJCalendarPanel);
        menuBasic.add(itemJCloseableTabbedPane);
        menuBasic.add(itemJDateField);
        menuBasic.add(itemJDatePicker);
        menuBasic.add(itemJDirChooser);
        menuBasic.add(itemJFileTree);
        menuBasic.add(itemJFontDialog);
        menuBasic.add(itemJGroupPanel);
        menuBasic.add(itemJIpAddressField);
        menuBasic.add(itemJListChooser);
        menuBasic.add(itemJNumberField);
        menuBasic.add(itemJPopupButton);
        menuBasic.add(itemJStatusBar);
        menuBasic.add(itemJStringField);
        menuBasic.add(itemJTreeComboBox);
        menuBasic.addSeparator();
        menuBasic.add(itemExit);

        jMenu2.add(itemPrint);
        itemJCalendarPanel.addActionListener(this);
        itemJCloseableTabbedPane.addActionListener(this);
        itemJDateField.addActionListener(this);
        itemJDatePicker.addActionListener(this);
        itemJDirChooser.addActionListener(this);
        itemJFileTree.addActionListener(this);
        itemJFontDialog.addActionListener(this);
        itemJGroupPanel.addActionListener(this);
        itemJIpAddressField.addActionListener(this);
        itemJListChooser.addActionListener(this);
        itemJNumberField.addActionListener(this);
        itemJPopupButton.addActionListener(this);
        itemJStatusBar.addActionListener(this);
        itemJStringField.addActionListener(this);
        itemJTreeComboBox.addActionListener(this);
        itemExit.addActionListener(this);
        itemPrint.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == itemJCalendarPanel){
            JCalendarPanel.main(null);
        }
        if(obj == itemJCloseableTabbedPane){
            JCloseableTabbedPane.main(null);
        }
        if(obj == itemJDateField){
            JDateField.main(null);
        }
        if(obj == itemJDatePicker){
            JDatePicker.main(null);
        }
        if(obj == itemJDirChooser){
            JDirChooser.main(null);
        }
        if(obj == itemJFileTree){
            JFileTree.main(null);
        }
        if(obj == itemJFontDialog){
            JFontDialog.main(null);
        }
        if(obj == itemJGroupPanel){
            JGroupPanel.main(null);
        }
        if(obj == itemJIpAddressField){
            JIpAddressField.main(null);
        }
        if(obj == itemJListChooser){
            JListChooser.main(null);
        }
        if(obj == itemJNumberField){
            JNumberField.main(null);
        }
        if(obj == itemJPopupButton){
            JPopupButton.main(null);
        }
        if(obj == itemJStatusBar){
            JStatusBar.main(null);
        }
        if(obj == itemJStringField){
            JStringField.main(null);
        }
        if(obj == itemJTreeComboBox){
            JTreeComboBox.main(null);
        }
        if(obj == itemExit){
            System.exit(0);
        }
        if(obj == itemPrint){
            PrintDemo.main(null);
        }
    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

            Font font = new Font("SimSun", Font.PLAIN, 12);
            java.util.Enumeration keys = UIManager.getLookAndFeelDefaults().
                keys();
            while(keys.hasMoreElements()){
                Object key = keys.nextElement();
                if(UIManager.get(key) instanceof Font){
                    UIManager.put(key, font);
                }
            }

        } catch(Exception e){
        }
        JFrame frame = new TestMain();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OpenSwing Demo");
        frame.setSize(600, 400);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(
            (d.width - frame.getSize().width) / 2,
            (d.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

}
