/**
 * 
 */
package com.gopawpaw.droidcore.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jason
 * @since: 2011-7-14
 */
public class CMDExecute {

	/**
	 * 
	 * @author Jason
	 * @since:2011-7-14
	 * @param cmd 命令行数组：netcfg
	 * @param workdirectory 路径：/system/bin/
	 * @return 命令行返回结果
	 * @throws IOException
	 */
	public synchronized String run(String[] cmd, String workdirectory)
			throws IOException {
		String result = "";

		try {
			ProcessBuilder builder = new ProcessBuilder(cmd);
			// 设置一个路径
			if (workdirectory != null) {
				builder.directory(new File(workdirectory));
				builder.redirectErrorStream(true);
				Process process = builder.start();
				InputStream in = process.getInputStream();
				byte[] re = new byte[1024];
				while(in.read(re)>0){
					result = result + new String(re).trim();
				}
				in.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
