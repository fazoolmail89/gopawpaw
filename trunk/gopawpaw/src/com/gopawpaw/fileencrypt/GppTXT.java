/**
 * 
 */
package com.gopawpaw.fileencrypt;

/**
 * @version 2010-1-1
 * @author 李锦华
 */
import java.io.*;

public class GppTXT {
    public static BufferedReader bufread;
    //指定文件路径和名称
    private static String path = "F:/AllUserInfo.txt";
    private static  File filename = new File(path);
    private static String readStr ="";
    
    /**
     * 创建文本文件.
     * @throws IOException 
     * 
     */
    public static void creatTxtFile() throws IOException{
        if (!filename.exists()) {
            filename.createNewFile();
        }
    }
    /**
	 * 
	 */
	public GppTXT(String path) {
		super();
		GppTXT.path = path;
	}
	/**
     * 删除文本文件.
     * @throws IOException 
     * 
     */
    public static void deleteTxtFile() throws IOException{
        if (filename.exists()) {
            filename.delete();
        }
    }
    /**
     * 读取文本文件.
     * 
     */
    public static String readTxtFile(){
        String read;
        FileReader fileread;
        try {
            fileread = new FileReader(filename);
            bufread = new BufferedReader(fileread);
            try {
                while ((read = bufread.readLine()) != null) {
                    readStr = readStr + read+ "\r\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readStr;
    }
    public static String readTxtInfo(){
        String read;
        FileReader fileread;
        File filename = new File("F:/info.txt");
        try {
            fileread = new FileReader(filename);
            bufread = new BufferedReader(fileread);
            try {
                while ((read = bufread.readLine()) != null) {
                    readStr = readStr + read+ "\r\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return readStr;
    }    
    /**
     * 写文件.
     * 
     */
    public static void writeTxtFile(String newStr) throws IOException{
        //先读取原有文件内容，然后进行写入操作
        String filein = newStr + "\r\n";
        RandomAccessFile mm = null;
        try {
            mm = new RandomAccessFile(filename, "rw");
            mm.writeBytes(filein);
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (mm != null) {
                try {
                    mm.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
     /**
     * main方法测试
     * @param s
     * @throws IOException
     */
    public static void main(String[] s) throws IOException {
      
    }
}

