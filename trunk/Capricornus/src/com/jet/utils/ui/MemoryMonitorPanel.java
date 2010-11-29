package com.jet.utils.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import java.text.*;

import java.util.*;

/**
 *
 */
public class MemoryMonitorPanel extends JPanel {
   GraphPanel graphPanel=null;

   MemTextPanel textPanel=null;

   long msScale=60000;
   long refreshInterval=3000; 

   /** */
   public MemoryMonitorPanel() {
      this (60000, 3000);
   }

   /** */
   public MemoryMonitorPanel(long xscale, long interval) {
      super(new BorderLayout());

      msScale=xscale;
      refreshInterval=interval;

      graphPanel= new GraphPanel();

      add(graphPanel, BorderLayout.CENTER);

      Toolbar toolbar=new Toolbar();
      add(toolbar, BorderLayout.NORTH);

      textPanel=new MemTextPanel();
      add(textPanel, BorderLayout.SOUTH);
      
      RefreshThread rt=new RefreshThread();
      rt.start();
   }


   /** */
   public class GraphPanel extends JPanel {
      ArrayList data=new ArrayList();

      int graphH=0;
      int graphW=0;

      public GraphPanel() {
         super();
      }

      public void addDataPoint(MemDataPoint mdp) {
         data.add(mdp);
         //System.out.println ("data contains "+data.size()+" elements");
      }
      
      /** */
      public void paint(Graphics g) {
         Dimension d=this.getSize();
         // System.out.println ("Size: "+d);

         //g.drawLine(0, 0, d.width, d.height);

         graphW=d.width-10;
         graphH=d.height-10;

         g.setColor(Color.lightGray);
         g.fillRect(0, 0, d.width, d.height);

         Graphics g2=g.create(5, 5, d.width-10, d.height-10);
         g2.setColor(Color.white);
         g2.fillRect(0, 0, graphW, graphH);

         g2.setColor(Color.black);
         //g2.drawLine(graphW, 0, 0, graphH);
         
         //g2.drawRect(0, 0, graphW-1, graphH-1);

         g2.setColor(Color.lightGray);
         drawYGrid(g2, 4);
         drawXGrid(g2, 10);

         plotPoints(g2);
      }
      
      /** Draws the Y grid (horizontal lines) on the canvas. */
      void drawYGrid(Graphics g, int num) {
         // divide out graph height, increment
         int increment=Math.round((float)graphH/(float)num);
         //System.out.println ("increment="+increment);

         for (int i=0; i<num; i++) {
            g.drawLine(0, i*increment, graphW, i*increment);
         }
      }

      /** Draws the Y grid (vertical lines) on the canvas. */
      void drawXGrid(Graphics g, int num) {
         // divide out graph height, increment
         int increment=Math.round((float)graphW/(float)num);
         // System.out.println ("increment="+increment);

         for (int i=0; i<num; i++) {
            g.drawLine(i*increment, 0, i*increment, graphH);
         }
      }

      void plotPoints(Graphics g) {
         setScale();

         sweepPoints();

         lastUsed=null;
         lastTotal=null;

         int size=data.size();
         for (int i=0; i<size; i++) {
            MemDataPoint mdp=(MemDataPoint)data.get(i);
            // System.out.println ("Plotting "+mdp);
            plotPoint(g, mdp);
         }
      }

      void setScale() {
         long totMem=runtime.totalMemory();
         double tmScale=(double)totMem*1.05;

         // x=30 seconds=30000 ms
         // y=total mem
         xScale=(double)graphW/(double)msScale;
         yScale=(double)graphH/tmScale;
      }
      
      void sweepPoints() {
         int size=data.size();
         for (int i=size-1; i>0; i--) {
            MemDataPoint mdp=(MemDataPoint)data.get(i);
            int age=mdp.getAge();
            // System.out.println ("limit: "+msScale+" age: "+age);
            if (age > msScale){
               //System.out.println ("removing point "+mdp);
               data.remove(mdp);
            }
         }
      }

      double xScale=0;
      double yScale=0;

      /** */
      void plotPoint(Graphics g, MemDataPoint mdp) {
         int age=mdp.getAge();

         lastTotal=drawPoint(g, age, mdp.totalMem, Color.red, lastTotal);
         lastUsed=drawPoint(g, age, mdp.usedMem, Color.blue, lastUsed);
      }

      Point lastUsed=null;
      Point lastTotal=null;
      
      /** */
      Point drawPoint(Graphics g, long x, long y, Color c, Point last) {
         // first, convert coordinate systems and scale.

         int xcoord=(int)Math.round(xScale * x);
         int ycoord=(int)Math.round(yScale * y);

         //System.out.println ("X("+x+") * xScale("+xScale+") = "+xcoord);
         //System.out.println ("Y("+y+") * yScale("+yScale+") = "+ycoord);

         xcoord=graphW-xcoord-3;
         ycoord=graphH-ycoord-1;

         g.setColor(c);
         g.drawOval(xcoord, ycoord, 3, 3);

         if (last != null)
            g.drawLine(last.x+1, last.y+1, xcoord+1, ycoord+1);

         return new Point(xcoord, ycoord);
      }
   }

   static Runtime runtime=Runtime.getRuntime();

   /** */
   public class MemDataPoint {
      long time=0;
      long totalMem=0;
      long usedMem=0;

      public MemDataPoint() {
         time=System.currentTimeMillis();
         totalMem=runtime.totalMemory();
         usedMem=totalMem-runtime.freeMemory();
      }
      
      public int getAge() {
         return (int)(System.currentTimeMillis() - time);
      }
      
      public String toString() {return ""+time+" "+totalMem+" "+usedMem;}
   }

   
   /** */
   class MemTextPanel extends JPanel {
      JLabel total=null;
      JLabel avail=null;
      JLabel peak=null;

      /** */
      public MemTextPanel() {
         setLayout(new BorderLayout());
         
         JPanel left=new JPanel(new GridLayout(2, 1));
         left.setBorder(new TitledBorder("Memory Stats"));

         JLabel totalLabel=new JLabel("Total");
         total=new JLabel("0");
         
         LRPanel lrp=new LRPanel(totalLabel, total);
         left.add(lrp);

         JLabel availLabel=new JLabel("Available");
         avail=new JLabel("0");
         lrp=new LRPanel(availLabel, avail);
         left.add(lrp);

         
         JPanel right=new JPanel(new GridLayout(2, 1));
         right.setBorder(new TitledBorder("Legend"));

         JLabel tlabel=new JLabel("Total Memory");
         lrp=new LRPanel(tlabel, new SolidLabel("foo", Color.red));
         right.add(lrp);

         JLabel used=new JLabel("Used Memory");
         lrp=new LRPanel(used, new SolidLabel("foo", Color.blue));

         right.add(lrp);

         this.add(left, BorderLayout.WEST);
         this.add(right, BorderLayout.EAST);
      }
      
      public void refresh() {
         DecimalFormat df=new DecimalFormat("#,###");
         total.setText(df.format(runtime.totalMemory())+" b");
         avail.setText(df.format(runtime.freeMemory())+" b");
      }
   }

   class LRPanel extends JPanel {
      public LRPanel(JComponent c1, JComponent c2) {
         super(new BorderLayout());
         JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
         p1.add(c1);
         this.add(p1, BorderLayout.WEST);
         
         JPanel p2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
         p2.add(c2);
         this.add(p2);
      }
   }

   class SolidLabel extends JLabel {
      Color color=null;
      public SolidLabel(String s, Color c) {
         super(s);
         color=c;
      }

      public void paint(Graphics g) {
         Dimension d=this.getSize();
         g.setColor(color);
         g.fillRect(0, 0, d.width, d.height);
      }
   }

   /** */
   class Toolbar extends JPanel implements ActionListener {
      public Toolbar() {
         super(new FlowLayout(FlowLayout.LEFT));
         JButton gc=new JButton("Run Garbage Collector");
         gc.setActionCommand("gc");
         gc.addActionListener(this);
         add(gc);
      }

      public void actionPerformed(ActionEvent ae) {
         String command=ae.getActionCommand(); 
         if (command.equals("gc")) {
            System.gc();
         }
      }
   }

   /** */
   class RefreshThread extends Thread {
      public RefreshThread() {
         setName("MMPanel.refresh");
      }
      
      public void run() {
         while(true) {
            MemDataPoint mdp=new MemDataPoint();
            graphPanel.addDataPoint(mdp);

            // System.out.println ("foo");

            graphPanel.invalidate();
            graphPanel.repaint();

            textPanel.refresh();

            try {sleep(refreshInterval);}
            catch (InterruptedException ex) {}
         }
      }
   }

   public static void main(String args[]) {
      JFrame f=new JFrame();
      f.setSize(600, 300);
      f.getContentPane().add(new MemoryMonitorPanel());
      f.show();
   }
}