package com.sunking.swing;

import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.*;

import com.sun.java.swing.plaf.windows.*;

/**
 * <p>Title: OpenSwing</p>
 * <p>Description:弹出式菜单按钮 </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */

public class JPopupButton
    extends JComboBox
    implements Serializable {
    /**
     * 普通按钮
     */
    public static final int TYPE_NORMAL = 0;

    /**
     * 两个按钮组合成的弹出菜单按钮
     */
    public static final int TYPE_WITH_RIGHT_TOGGLE = 1;

    /**
     * 按钮类型
     */
    private int style = -1;

    /**
     * 合成按钮左按钮的事件
     */
    private int actionIndex = -1;

    /**
     * 弹出菜单
     */
    private JPopupMenu popup = null;

    /**
     * 是否需要更新
     */
    private boolean mustRefresh = false;

    /**
     * 左按钮
     */
    private JButton bttLeft;

    /**
     * 右按钮
     */
    private JButton bttRight;

    /**
     * 按钮事件
     */
    private PopupButtonListener listener = new PopupButtonListener();

//    javax.swing.plaf.BorderUIResource$EmptyBorderUIResource emptyBorder = new
//        javax.swing.plaf.BorderUIResource$EmptyBorderUIResource(new Insets(0, 0,
//        0, 0));

    /**
     * <p>Title: OpenSwing</p>
     * <p>Description: 鼠标移入时的边界</p>
     * <p>Copyright: Copyright (c) 2004</p>
     * <p>Company: </p>
     * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
     * @version 1.0
     */
    public class UpBorder
        extends AbstractBorder {
        int thickness = 1;
        public void paintBorder(Component c, Graphics g, int x, int y,
                                int width, int height) {
            g.setColor(Color.white);
            g.drawLine(0, 0, width - 1, 0);
            g.drawLine(0, 0, 0, height - 1);
            g.setColor(Color.gray);
            g.drawLine(width - 1, 0, width - 1, height);
            g.drawLine(0, height - 1, width, height - 1);
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(thickness, thickness, thickness, thickness);
        }
    }

    /**
     * <p>Title: OpenSwing</p>
     * <p>Description: 鼠标按下时的边界</p>
     * <p>Copyright: Copyright (c) 2004</p>
     * <p>Company: </p>
     * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
     * @version 1.0
     */
    public class DownBorder
        extends AbstractBorder {
        int thickness = 1;
        public void paintBorder(Component c, Graphics g, int x, int y,
                                int width, int height) {
            g.setColor(Color.gray);
            g.drawLine(0, 0, width - 1, 0);
            g.drawLine(0, 0, 0, height - 1);
            g.setColor(Color.white);
            g.drawLine(width - 1, 0, width - 1, height);
            g.drawLine(0, height - 1, width, height - 1);
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(thickness, thickness, thickness, thickness);
        }
    }

    /**
     * <p>Title: OpenSwing</p>
     * <p>Description: 按钮各种动作时边界变化以及事件处理</p>
     * <p>Copyright: Copyright (c) 2004</p>
     * <p>Company: </p>
     * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
     * @version 1.0
     */
    private class PopupButtonListener
        implements MouseListener, PopupMenuListener {
        UpBorder upBorder = new UpBorder();
        DownBorder downBorder = new DownBorder();
        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            if (!JPopupButton.this.isEnabled()) {
                return;
            }
            if (e.getSource() == bttLeft) {
                bttLeft.setBorder(downBorder);
                bttRight.setBorder(downBorder);
                if (getStyle() == TYPE_NORMAL) {
                    JPopupButton.this.showPopupMenu();
                }
                else if (actionIndex != -1
                         && actionIndex < popup.getSubElements().length) {
                    AbstractButton btt = (AbstractButton) (popup.getSubElements()
                        [actionIndex].getComponent());
                    btt.doClick();
                }
            }
            else {
                bttLeft.setBorder(upBorder);
                bttRight.setBorder(downBorder);
                bttRight.setSelected(true);
                JPopupButton.this.showPopupMenu();
            }
        }

        public void mouseReleased(MouseEvent e) {
            bttRight.setSelected(false);
        }

        public void mouseEntered(MouseEvent e) {
            if (!JPopupButton.this.isEnabled()) {
                return;
            }
            if (!JPopupButton.this.popup.isShowing()) {
                bttLeft.setBorder(upBorder);
                bttRight.setBorder(upBorder);
            }
        }

        public void mouseExited(MouseEvent e) {
            if (!JPopupButton.this.isEnabled()) {
                return;
            }

            if (!JPopupButton.this.popup.isShowing()) {
                bttLeft.setBorder(null);
                bttRight.setBorder(null);
            }
        }

        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        }

        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            if (!JPopupButton.this.isEnabled()) {
                return;
            }

            bttLeft.setBorder(null);
            bttRight.setBorder(null);
        }

        public void popupMenuCanceled(PopupMenuEvent e) {
        }
    }

    public JPopupButton() {
        this(TYPE_NORMAL);
    }

    public JPopupButton(int style) {
        this(style, null);
    }

    public JPopupButton(int style, String text) {
        this(style, text, null);
    }

    public JPopupButton(int style, String text, Icon icon) {
        this(style, text, icon,  new JPopupMenu());
    }

    /**
     * @param style int 按钮类型
     * @param text String 显示文字
     * @param icon Icon 显示图标
     * @param popup JPopupMenu 弹出菜单
     */
    public JPopupButton(int style, String text, Icon icon, JPopupMenu popup) {
        createButtons();
        setText(text);
        setIcon(icon);
        setPopup(popup);
        setStyle(style);
    }

    /**
     * 显示菜单
     */
    protected void showPopupMenu() {
        if (popup == null) {
            return;
        }
        popup.show(this, 0, this.getHeight());
    }

    protected void createButtons() {
        if (bttLeft == null) {
            bttLeft = new JButton(){
                public void setUI(ButtonUI ui) {
                    if(ui instanceof WindowsButtonUI){
                       ui = new BasicButtonUI();
                    }
                    super.setUI(ui);
                }
            };
            bttLeft.setMargin(new Insets(0, 0, 0, 0));
        }
        if (bttRight == null) {
            bttRight = new JButton() {
                public void setUI(ButtonUI ui) {
                    if(ui instanceof WindowsButtonUI){
                       ui = new BasicButtonUI();
                    }
                    super.setUI(ui);
                }
                public void paint(Graphics g) {
                    super.paint(g);
                    Polygon p = new Polygon();
                    int w = getWidth();
                    int y = (getHeight() - 4) / 2;
                    int x = (w - 6) / 2;
                    if (isSelected()) {
                        x += 1;
                    }
                    p.addPoint(x, y);
                    p.addPoint(x + 3, y + 3);
                    p.addPoint(x + 6, y);
                    g.fillPolygon(p);
                    g.drawPolygon(p);
                }
            };
            bttRight.setUI(new BasicButtonUI());
            bttLeft.setMargin(new Insets(0, 0, 0, 0));
        }
    }

    /**
     * 更新组件布局
     */
    protected void refreshUI() {
        if (!mustRefresh) {
            return;
        }
        super.removeAll();
        this.setBorder(null);
        this.setLayout(new BorderLayout());
        this.add(bttLeft, BorderLayout.CENTER);
        if (style == TYPE_WITH_RIGHT_TOGGLE) {
            this.add(bttRight, BorderLayout.EAST);
        }
        bttLeft.setFocusable(false);
        bttLeft.setBorder(null);
        bttLeft.addMouseListener(listener);
        bttRight.setFocusable(false);
        bttRight.setPreferredSize(new Dimension(13, 1));
        bttRight.setBorder(null);
        bttRight.addMouseListener(listener);
        this.doLayout();
    }

    /**
     * 设置按钮类型
     * @param style int
     */
    public void setStyle(int style) {
        if (this.style != style) {
            mustRefresh = true;
        }
        this.style = style;
        refreshUI();
    }

    /**
     * 取得按钮类型
     * @return int
     */
    public int getStyle() {
        return style;
    }

    /**
     * 设置显示文字
     * @param text String
     */
    public void setText(String text) {
        bttLeft.setText(text);
    }

    /**
     * 取得显示文字
     * @return String
     */
    public String getText() {
        return bttLeft.getText();
    }

    /**
     * 设置灰化状态
     * @param enabled boolean
     */
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        bttLeft.setEnabled(enabled);
        bttRight.setEnabled(enabled);
    }

    /**
     * 设置显示图标
     * @param icon Icon
     */
    public void setIcon(Icon icon) {
        bttLeft.setIcon(icon);
    }

    /**
     * 取得显示图标
     * @return Icon
     */
    public Icon getIcon() {
        return bttLeft.getIcon();
    }

    /**
     * 组合按钮时设置左按钮相当于菜单某项的动作
     * @param index int
     */
    public void setActionSameAsPopup(int index) {
        this.actionIndex = index;
    }

    /**
     * 取得组合按钮左按钮相当于菜单某项的动作
     * @return int
     */
    public int getActionSameAsPopup() {
        return actionIndex;
    }

    /**
     * 设置弹出式菜单
     * @param pop JPopupMenu
     */
    public void setPopup(JPopupMenu pop) {
        if (this.popup != null) {
            popup.removePopupMenuListener(listener);
        }
        this.popup = pop;
        popup.removePopupMenuListener(listener);
        popup.addPopupMenuListener(listener);
    }

    /**
     * 取得弹出式菜单
     * @return JPopupMenu
     */
    public JPopupMenu getPopup() {
        return popup;
    }

    /**
     * 测试代码
     * @param args String[]
     */
    public static void main(String[] args) {
        JFrame frame = OpenSwingUtil.createDemoFrame("JPopupButton Demo");
        class DemoAction
            extends AbstractAction {
            public DemoAction() {
                super.putValue(Action.NAME,
                               "Demo JPopupButton " +
                               new java.util.Random().nextInt());
            }

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog( (Component) e.getSource(),
                                              super.getValue(Action.NAME));
            }
        }

        JPopupMenu popup = new JPopupMenu("PopupMenu");
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        popup.add(new DemoAction());
        JPopupButton btt1 = new JPopupButton(
            JPopupButton.TYPE_NORMAL, "Button1", null,
            popup);
        JPopupButton btt2 = new JPopupButton(
            JPopupButton.TYPE_WITH_RIGHT_TOGGLE,
            "Button2", null, popup);
        btt2.setActionSameAsPopup(0);

        JPopupButton btt3 = new JPopupButton(
            JPopupButton.TYPE_WITH_RIGHT_TOGGLE,
            "", UIManager.getIcon("FileView.computerIcon"), popup);
        btt3.setActionSameAsPopup(0);

        btt1.setPreferredSize(new Dimension(60, 25));
        btt1.setSize(new Dimension(60, 25));
        btt1.setMaximumSize(new Dimension(60, 25));
        btt2.setPreferredSize(new Dimension(100, 25));
        btt2.setSize(new Dimension(100, 25));
        btt2.setMaximumSize(new Dimension(100, 25));
        btt3.setPreferredSize(new Dimension(40, 25));
        btt3.setSize(new Dimension(40, 25));
        btt3.setMaximumSize(new Dimension(40, 25));
        JToolBar bar = new JToolBar("Toolbar");
        bar.setRollover(true);
        bar.add(btt1);
        bar.add(btt2);
        bar.add(btt3);

        frame.getContentPane().add(bar, BorderLayout.NORTH);
        frame.setVisible(true);
    }

}
