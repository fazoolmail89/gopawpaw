/*
 * 文件名: EncrypUtil.java
 * 版    权：  Copyright PingAn Technology All Rights Reserved.
 * 描    述: [3DES 加密]
 * 创建人: EX-HOUWANJI001
 * 创建时间: 2011-12-27
 * 
 * 修改人：
 * 修改时间:
 * 修改内容：[修改内容]
 */
/*
 * 文件名: EncrypUtil.java
 * 版    权： Copyright PingAn Technology All Rights Reserved.
 * 描    述: [该类的简要描述]
 * 创建人: EX-HOUWANJI001
 * 创建时间:2011-12-27
 * 
 * 修改人：
 * 修改时间:
 * 修改内容：[修改内容]
 */
package com.gopawpaw.droidcore.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author EX-HOUWANJI001
 * @date 2011-12-27
 * @version [Android PABank C01, @2011-12-27]
 * @description
 */
/**
 * [网银 3DES算法加密]<BR>
 * [功能详细描述]
 * @author EX-HOUWANJI001
 * @version [Android PABank C01, 2011-12-27] 
 */
public class EncrypUtil
{
    /**
     * 3DES 加密算法
     */
    private static final String EncodeAlgorithm = "DESede";//3DES算法加密
    
    private static final String EncodePriKey="PA-BCES-IBP-IBANK-IBP-3DES"; //密匙 最小24位
  /**
    * 实例
    */
    private static EncrypUtil instance = null;
  /**
   * 加密类
   */
    private Cipher cipher=null; 
    /**
     * 密钥
     */
    private SecretKey secretKey=null;
    /**
     * 
     * [构造方法]
     */
    private EncrypUtil()
    {
        try{
            cipher=Cipher.getInstance(EncodeAlgorithm);
            
            //如果使用文件密匙
            /**
            FileInputStream f=new FileInputStream("prikey.data");
            int num=f.available();
            byte[] prikey=new byte[num];
            f.read(prikey);
            */
            byte[] prikey=EncodePriKey.getBytes();
            DESedeKeySpec desKeySpec = new DESedeKeySpec(prikey);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(EncodeAlgorithm);
            secretKey = keyFactory.generateSecret(desKeySpec);
            
        }catch(Exception e)
        {
            
            AppLog.e("Exception", "Exception:"+e);
        }
        
    }
    
    private static EncrypUtil getInstance()
    {
        if (instance == null)
        {
            instance = new EncrypUtil();
        }
        return instance;
    }
    
    /**
     * DESede加密
     * @param str 16进制表示的字符串
     * @return
     */
    
    public static String DESedeEncode(String str)
    {
        if(str == null) return "";
        EncrypUtil enUtil=EncrypUtil.getInstance();
        try{
            enUtil.cipher.init(Cipher.ENCRYPT_MODE, enUtil.secretKey);
            byte[] byteEncode=enUtil.cipher.doFinal(str.getBytes("UTF-8"));
            String result="";
            for (int i = 0; i < byteEncode.length; i++) {
                result+=Integer.toHexString((0x000000fff & byteEncode[i]) | 0xffffff00).substring(6);
            }
            return result;

        }catch(Exception e)
        {
           AppLog.e("Exception", "Exception:"+e);
        }

        return null;
    }
    
    /**
     * DESede解密
     * @param str 16进制表示的字符串
     * @return
     * 错误联系 xudongming mingstone.xu@gmail.com
     */
    public static String DESedeDecode(String str)
    {
        if(str == null) return "";
        EncrypUtil enUtil=EncrypUtil.getInstance();
        try{
            enUtil.cipher.init(Cipher.DECRYPT_MODE, enUtil.secretKey);
            byte[] byteEncode=hexStr2Byte(str);
            return new String(enUtil.cipher.doFinal(byteEncode),"UTF-8");
        }catch(Exception e)
        {
            AppLog.e("Exception", "Exception:"+e);
        }
        return "";
    }

    /**
     * 16进制字符串转byte数组
     * 错误联系 xudongming mingstone.xu@gmail.com
     * @param str
     * @return
     * @throws Exception
     */
    private static byte[] hexStr2Byte(String str) throws Exception
    {
        byte[] byteTemp=new byte[str.length()/2];
        for(int i=0;i<byteTemp.length;i++)
        {
            byteTemp[i]=(byte)(0xff & Integer.parseInt(str.substring(i*2, i*2+2),16));
        }
        return byteTemp;
    }
    
//    // 使用示例
//    public static void main(String[] args)
//    {
//        String str="asssddfghjkuioklopioklopl测试字符串"; //测试字符串
//        String hexStr="cf2535becef08cac6213fa5a8f5073215bcc425dc197b9961e59eeb12f80b8fc";
//        String byteStr="-49,37,53,-66,-50,-16,-116,-84,98,19,-6,90,-113,80,115,33,91,-52,66,93,-63,-105,-71,-106,30,89,-18,-79,47,-128,-72,-4";
//        
//        try
//        {
//            
//            //加密
//            String enHexStr=EncrypUtil.DESedeEncode("asssddfghjkuioklopioklopl测试字符串");
//            System.out.println("DESede加密后转16进制结果:"+enHexStr);
//            //解密
//            System.out.println("解密结果:"+EncrypUtil.DESedeDecode(enHexStr));
//            
//            //c 结果测试
//            System.out.println("c解密结果:"+EncrypUtil.DESedeDecode("CF2535BECEF08CAC6213FA5A8F5073215BCC425DC197B996067581F66A874B499EC5503D55CC7E4E83A7F1B26396139F"));
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        
//    }
}

