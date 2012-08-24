package com.gopawpaw.frame.utils;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;


/**
 * 
 * @version 2012-8-22
 * @author Jason
 */
public class ExtClasspathLoader {/** *//** URLClassLoader��addURL���� */
    private static Method addURL = initAddMethod();

    private static URLClassLoader classloader = (URLClassLoader) ClassLoader.getSystemClassLoader();

    /** *//**
     * ��ʼ��addUrl ����.
     * @return �ɷ���addUrl������Method����
     */
    private static Method initAddMethod() {
        try {
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[] { URL.class });
            add.setAccessible(true);
            return add;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** *//**
     * ����jar classpath��
     */
    public static void loadClasspath() {
        List<String> files = getJarFiles();
        for (String f : files) {
            loadClasspath(f);
        }

        List<String> resFiles = getResFiles();

        for (String r : resFiles) {
            loadResourceDir(r);
        }
    }

    private static void loadClasspath(String filepath) {
        File file = new File(filepath);
        loopFiles(file);
    }

    private static void loadResourceDir(String filepath) {
        File file = new File(filepath);
        loopDirs(file);
    }

    /** *//**    
     * ѭ������Ŀ¼���ҳ����е���Դ·����
     * @param file ��ǰ�����ļ�
     */
    private static void loopDirs(File file) {
        // ��Դ�ļ�ֻ����·��
        if (file.isDirectory()) {
            addURL(file);
            File[] tmps = file.listFiles();
            for (File tmp : tmps) {
                loopDirs(tmp);
            }
        }
    }

    /** *//**    
     * ѭ������Ŀ¼���ҳ����е�jar����
     * @param file ��ǰ�����ļ�
     */
    private static void loopFiles(File file) {
        if (file.isDirectory()) {
            File[] tmps = file.listFiles();
            for (File tmp : tmps) {
                loopFiles(tmp);
            }
        }
        else {
            if (file.getAbsolutePath().endsWith(".jar") || file.getAbsolutePath().endsWith(".zip")) {
                addURL(file);
            }
        }
    }

    /** *//**
     * ͨ��filepath�����ļ���classpath��
     * @param filePath �ļ�·��
     * @return URL
     * @throws Exception �쳣
     */
    private static void addURL(File file) {
        try {
            addURL.invoke(classloader, new Object[] { file.toURI().toURL() });
        }
        catch (Exception e) {
        }
    }

    /** *//**
     * �������ļ��еõ����õ���Ҫ���ص�classpath���·�����ϡ�
     * @return
     */
    private static List<String> getJarFiles() {
        // TODO ��properties�ļ��ж�ȡ������Ϣ��
        return null;
    }

    /** *//**
     * �������ļ��еõ����õ���Ҫ����classpath�����Դ·������
     * @return
     */
    private static List<String> getResFiles() {
        //TODO ��properties�ļ��ж�ȡ������Ϣ��
        return null;
    }

    public static void main(String[] args) {
        ExtClasspathLoader.loadClasspath();
    }
}
