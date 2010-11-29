package com.sunking.swing;

import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;

/**
 * <p>Title: OpenSwing</p>
 * <p>Description: OpenSwingUtil 工具类</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author <a href="mailto:sunkingxie@hotmail.com">SunKing</a>
 * @version 1.0
 */
public final class OpenSwingUtil
    implements Serializable {
    private static ResourceBundle rb;
    public static ImageIcon getOpenSwingImage(String name) {
        return getOpenSwingImage(name, null);
    }
    /**
     * 取得图象资源
     * @param name String 图像名
     * @param defaultIcon ImageIcon 未取到时赋予的默认图像
     * @return ImageIcon
     */
    public static ImageIcon getOpenSwingImage(String name,
                                              ImageIcon defaultIcon) {
        ImageIcon icon = null;
        try {
            java.net.URL url = ClassLoader.getSystemResource(
                "com/sunking/swing/images/" + name);
            icon = new ImageIcon(url);
        }
        catch (Exception ex) {
        }
        if (icon == null
            || icon.getImageLoadStatus() != MediaTracker.COMPLETE
            || icon.getIconHeight() <= 0) {
            icon = defaultIcon;
        }
        return icon;
    }
    /**
     * 取得国际化文字资源
     * @param key String  关键字
     * @return String
     */
    public static String getOpenResource(String key) {
        if (rb == null) {
            try{
                rb = ResourceBundle.getBundle(
                    "com.sunking.swing.properties.OpenSwing",
                    Locale.getDefault(),
                    ClassLoader.getSystemClassLoader());
            }
            catch (Exception ex) {
                throw new NullPointerException(
                    "ERROR:CAN NOT FOUND RESOURCE FILE!  " +
                    new File("OpenSwing_" + Locale.getDefault().toString() +
                             ".properties").getAbsolutePath());
            }
        }
        return rb.getString(key);
    }

    public static JFrame createDemoFrame(String title){
        JFrame frame = new JFrame(title);
        frame.setSize(400, 320);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((d.width - frame.getSize().width) / 2,
                          (d.height - frame.getSize().height) / 2);
        return frame;
    }
}
