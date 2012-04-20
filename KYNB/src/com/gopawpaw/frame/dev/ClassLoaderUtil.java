/**
 * 
 */
package com.gopawpaw.frame.dev;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * @version 2010-4-7
 * @author Àî½õ»ª
 * 
 */
public class ClassLoaderUtil {
	private static Field classes;

	private static Method addURL;
	static {
		try {
			classes = ClassLoader.class.getDeclaredField("classes");
			addURL = URLClassLoader.class.getDeclaredMethod("addURL",
					new Class[] { URL.class });
		} catch (Exception e) {
			// won't happen ,but remain it
			// throw new RootException(e);
			e.printStackTrace();
		}
		classes.setAccessible(true);
		addURL.setAccessible(true);
	}

	private static URLClassLoader system = (URLClassLoader) getSystemClassLoader();

	private static URLClassLoader ext = (URLClassLoader) getExtClassLoader();

	public static ClassLoader getSystemClassLoader() {
		return ClassLoader.getSystemClassLoader();
	}

	public static ClassLoader getExtClassLoader() {
		return getSystemClassLoader().getParent();
	}

	public static List getClassesLoadedBySystemClassLoader() {
		return getClassesLoadedByClassLoader(getSystemClassLoader());
	}

	public static List getClassesLoadedByExtClassLoader() {
		return getClassesLoadedByClassLoader(getExtClassLoader());
	}

	public static List getClassesLoadedByClassLoader(ClassLoader cl) {
		try {
			return (List) classes.get(cl);
		} catch (Exception e) {
			// throw new RootException(e);
			e.printStackTrace();
			return null;
		}
	}

	public static URL[] getBootstrapURLs() {
//		return Launcher.getBootstrapClassPath().getURLs();
		return null;
	}

	public static URL[] getSystemURLs() {
		return system.getURLs();
	}

	public static URL[] getExtURLs() {
		return ext.getURLs();
	}

	private static void list(PrintStream ps, URL[] classPath) {
		for (int i = 0; i < classPath.length; i++) {
			ps.println(classPath[i]);
		}
	}

	public static void listBootstrapClassPath() {
		listBootstrapClassPath(System.out);
	}

	public static void listBootstrapClassPath(PrintStream ps) {
		ps.println("BootstrapClassPath:");
		list(ps, getBootstrapClassPath());
	}

	public static void listSystemClassPath() {
		listSystemClassPath(System.out);
	}

	public static void listSystemClassPath(PrintStream ps) {
		ps.println("SystemClassPath:");
		list(ps, getSystemClassPath());
	}

	public static void listExtClassPath() {
		listExtClassPath(System.out);
	}

	public static void listExtClassPath(PrintStream ps) {
		ps.println("ExtClassPath:");
		list(ps, getExtClassPath());
	}

	public static URL[] getBootstrapClassPath() {
		return getBootstrapURLs();
	}

	public static URL[] getSystemClassPath() {
		return getSystemURLs();
	}

	public static URL[] getExtClassPath() {
		return getExtURLs();
	}

	public static void addURL2SystemClassLoader(URL url) {
		try {
			addURL.invoke(system, new Object[] { url });
		} catch (Exception e) {
			// throw new RootException(e);
			e.printStackTrace();
		}
	}

	public static void addURL2ExtClassLoader(URL url) {
		try {
			addURL.invoke(ext, new Object[] { url });
		} catch (Exception e) {
			// throw new RootException(e);
			e.printStackTrace();
		}
	}

	public static void addClassPath(String path) {
		addClassPath(new File(path));
	}

	public static void addExtClassPath(String path) {
		addExtClassPath(new File(path));
	}

	public static void addClassPath(File dirOrJar) {
		try {
			addURL2SystemClassLoader(dirOrJar.toURL());
		} catch (MalformedURLException e) {
			// throw new RootException(e);
			e.printStackTrace();
		}
	}

	public static void addExtClassPath(File dirOrJar) {
		try {
			addURL2ExtClassLoader(dirOrJar.toURL());
		} catch (MalformedURLException e) {
			// throw new RootException(e);
			e.printStackTrace();
		}
	}

}
