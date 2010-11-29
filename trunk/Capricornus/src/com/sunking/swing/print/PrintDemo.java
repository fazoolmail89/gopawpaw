package com.sunking.swing.print;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.swing.*;

import com.sunking.swing.print.content.*;
//import javax.swing.text.*;

public class PrintDemo
    extends JFrame
    implements BookOfPrint {
    JMenuBar jMenuBar1 = new JMenuBar();
    JToolBar jToolBar1 = new JToolBar();
    JMenu jMenu1 = new JMenu("File");
    PrintAction pa = new PrintAction(this);
    JTextArea txt = new JTextArea("Print Demo");
    JLabel lbV = new JLabel();

    public Book makeBook(boolean isPreview, PageFormat pageFormat) {
        PrintContent content = new PrintContent();
        String lines[] = txt.getText().split("\n");
        for(int i = 0; i < lines.length; i ++){
                content.println(new PrintString(lines[i]));
        }
        DrawOut printable = new DrawOut(content, isPreview);

        Component c = lbV;
        Graphics2D g2 = (Graphics2D) (c.getGraphics());
        Book book = new Book();
        book.append(printable, pageFormat,
                    printable.getPageCount(g2, pageFormat));
        c.repaint();
        return book;
    }


    public PrintDemo() {
        try {
            jbInit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar(jMenuBar1);
        lbV.setText("");
        this.getContentPane().add(jToolBar1, BorderLayout.NORTH);
        jMenuBar1.add(jMenu1);
        jMenu1.add(pa.getAction(PrintAction.PAGESET_ACTION));
        jMenu1.add(pa);
        jMenu1.add(pa.getAction(PrintAction.PRINT_ACTION));
        jMenu1.addSeparator();
        jMenu1.add(new ExitAction());
        jToolBar1.add(pa);
        jToolBar1.add(pa.getAction(PrintAction.PRINT_ACTION));
        jToolBar1.add(lbV, null);
        setJMenuBar(jMenuBar1);
        getContentPane().add(new JScrollPane(txt), BorderLayout.CENTER);
    }

    class ExitAction
        extends AbstractAction {
        public ExitAction() {
            super.putValue(Action.NAME, "Exit");
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        }
//        catch (Exception e) {
//        }
         JFrame frame = new PrintDemo();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Print Demo");
        frame.setSize(400, 320);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation( (d.width - frame.getSize().width) / 2,
                          (d.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
