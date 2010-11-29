package com.gopawpaw.erp.test.qqmenu;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ExpandingPanels extends MouseAdapter {
    ActionPanel[] aps;
    JPanel[] panels;

    public ExpandingPanels() {
        assembleActionPanels();
        assemblePanels();
    }

    public void mousePressed(MouseEvent e) {
        ActionPanel ap = (ActionPanel) e.getSource();
        if (ap.target.contains(e.getPoint())) {
            ap.toggleSelection();
            togglePanelVisibility(ap);
        }
    }

    private void togglePanelVisibility(ActionPanel ap) {
        int index = getPanelIndex(ap);
        if (panels[index].isShowing())
            panels[index].setVisible(false);
        else
            panels[index].setVisible(true);
        ap.getParent().validate();
    }

    private int getPanelIndex(ActionPanel ap) {
        for (int j = 0; j < aps.length; j++)
            if (ap == aps[j])
                return j;
        return -1;
    }

    private void assembleActionPanels() {
        String[] ids = { "level 1", "level 2", "level 3", "level 4" };
        aps = new ActionPanel[ids.length];
        for (int j = 0; j < aps.length; j++)
            aps[j] = new ActionPanel(ids[j], this);
    }

    private void assemblePanels() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 1, 2, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        JPanel p1 = new JPanel(new GridBagLayout());
        gbc.gridwidth = gbc.RELATIVE;
        p1.add(new JButton("button 1"), gbc);
        gbc.gridwidth = gbc.REMAINDER;
        p1.add(new JButton("button 2"), gbc);
        gbc.gridwidth = gbc.RELATIVE;
        p1.add(new JButton("button 3"), gbc);
        gbc.gridwidth = gbc.REMAINDER;
        p1.add(new JButton("button 4"), gbc);
        JPanel p2 = new JPanel(new GridBagLayout());
        gbc.gridwidth = 1;
        gbc.anchor = gbc.EAST;
        p2.add(new JLabel("enter"), gbc);
        gbc.anchor = gbc.WEST;
        p2.add(new JTextField(8), gbc);
        gbc.anchor = gbc.CENTER;
        p2.add(new JButton("button 1"), gbc);
        gbc.gridwidth = gbc.REMAINDER;
        p2.add(new JButton("button 2"), gbc);
        JPanel p3 = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea(8, 12);
        textArea.setLineWrap(true);
        p3.add(new JScrollPane(textArea));
        JPanel p4 = new JPanel(new GridBagLayout());
        addComponents(new JLabel("label 1"), new JTextField(12), p4, gbc);
        addComponents(new JLabel("label 2"), new JTextField(16), p4, gbc);
        gbc.gridwidth = 2;
        gbc.gridy = 2;
        p4.add(new JSlider(), gbc);
        gbc.gridy++;
        JPanel p5 = new JPanel(new GridBagLayout());
        p5.add(new JButton("button 1"), gbc);
        p5.add(new JButton("button 2"), gbc);
        p5.add(new JButton("button 3"), gbc);
        p5.add(new JButton("button 4"), gbc);
        gbc.weighty = 1.0;
        gbc.fill = gbc.BOTH;
        p4.add(p5, gbc);
        panels = new JPanel[] { p1, p2, p3, p4 };
    }

    private void addComponents(Component c1, Component c2, Container c,
            GridBagConstraints gbc) {
        gbc.anchor = gbc.EAST;
        gbc.gridwidth = gbc.RELATIVE;
        c.add(c1, gbc);
        gbc.anchor = gbc.WEST;
        gbc.gridwidth = gbc.REMAINDER;
        c.add(c2, gbc);
        gbc.anchor = gbc.CENTER;
    }

    private JPanel getComponent() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 3, 0, 3);
        gbc.weightx = 1.0;
        gbc.fill = gbc.HORIZONTAL;
        gbc.gridwidth = gbc.REMAINDER;
        for (int j = 0; j < aps.length; j++) {
            panel.add(aps[j], gbc);
            panel.add(panels[j], gbc);
            panels[j].setVisible(false);
        }
        JLabel padding = new JLabel();
        gbc.weighty = 1.0;
        panel.add(padding, gbc);
        return panel;
    }

    public static void main(String[] args) {
        ExpandingPanels test = new ExpandingPanels();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new JScrollPane(test.getComponent()));
        f.setSize(360, 500);
        f.setLocation(200, 100);
        f.setVisible(true);
    }
}
//测试通过
//非常感谢 sweet moon 及大家的帮忙
