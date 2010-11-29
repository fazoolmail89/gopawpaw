/**
 * 
 */
package com.gopawpaw.erp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


/**
 * @version 2010-4-8
 * @author 李锦华
 * 
 */
public class JarFileTest {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GppManifestReaderT gmr = new GppManifestReaderT("D:\\Eclipse_Workspace\\GERP\\program\\rdp2.jar");
		
		Iterator it = gmr.getKeySet().iterator();
		
		while (it.hasNext()) {
			String tem = (String) it.next();
			System.out.println(tem+"="+gmr.get(tem));
		}
	}

	public void test(){
		JarFile jarFile = null;
		try {
			jarFile = new JarFile(
					"D:\\Eclipse_Workspace\\GERP\\program\\rdp2.jar");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JarEntry entry = jarFile.getJarEntry("META-INF/MANIFEST.MF");

		InputStream in = null;
		try {
			in = jarFile.getInputStream(jarFile
					.getEntry("META-INF/MANIFEST.MF"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		try {
			line = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      // 读取第一行 
        while (line!=null) {           // 如果 line 为空说明读完了 
           System.out.println(line);            // 将读到的内容添加到 buffer 中 
            System.out.println("\\n");            // 添加换行符 
            try {
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   // 读取下一行  **
        }
	}
}
