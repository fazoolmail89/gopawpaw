/**
 * 
 */
package com.gopawpaw.fileencrypt;

/**
 * @version 2010-1-1
 * @author �����
 */
import java.io.*;

public class GppTXT {
    public static BufferedReader bufread;
    //ָ���ļ�·��������
    private static String path = "F:/AllUserInfo.txt";
    private static  File filename = new File(path);
    private static String readStr ="";
    
    /**
     * �����ı��ļ�.
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
     * ɾ���ı��ļ�.
     * @throws IOException 
     * 
     */
    public static void deleteTxtFile() throws IOException{
        if (filename.exists()) {
            filename.delete();
        }
    }
    /**
     * ��ȡ�ı��ļ�.
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
     * д�ļ�.
     * 
     */
    public static void writeTxtFile(String newStr) throws IOException{
        //�ȶ�ȡԭ���ļ����ݣ�Ȼ�����д�����
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
     * main��������
     * @param s
     * @throws IOException
     */
    public static void main(String[] s) throws IOException {
      
    }
}

