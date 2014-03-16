/**
 * @author EX-LIJINHUA001
 * @date 2013-2-20
 */
package com.gopawpaw.droidcore.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * AES 加密解密工具类
 * @author EX-LIJINHUA001
 * @date 2013-2-20
 */
public class AESUtils {
	
	/**
	 * AES加密成String
	 * @author EX-LIJINHUA001
	 * @date 2013-2-25
	 * @param content
	 * @param password
	 * @return
	 */
	public static String encryptToString(String content, String password) {
		byte[] encryptResult = encrypt(content, password);

		String encryptResultStr = parseByte2HexStr(encryptResult);
		
		return encryptResultStr;
	}
	
	/**
	 * 加密
	 * @author EX-LIJINHUA001
	 * @date 2013-2-20
	 * @param content	需要加密的内容
	 * @param password	加密密码
	 * @return
	 */
	public static byte[] encrypt(String content, String password) {

		try {

			KeyGenerator kgen = KeyGenerator.getInstance("AES");

			kgen.init(128, new SecureRandom(password.getBytes()));

			SecretKey secretKey = kgen.generateKey();

			byte[] enCodeFormat = secretKey.getEncoded();

			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");

			Cipher cipher = Cipher.getInstance("AES");// 创建密码器

			byte[] byteContent = content.getBytes("utf-8");

			cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化

			byte[] result = cipher.doFinal(byteContent);

			return result; // 加密

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();

		} catch (NoSuchPaddingException e) {

			e.printStackTrace();

		} catch (InvalidKeyException e) {

			e.printStackTrace();

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		} catch (IllegalBlockSizeException e) {

			e.printStackTrace();

		} catch (BadPaddingException e) {

			e.printStackTrace();

		}

		return null;
	}
	
	
	/**
	 * AES解密成String
	 * @author EX-LIJINHUA001
	 * @date 2013-2-25
	 * @param content
	 * @param password
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String decryptToString(String content, String password) throws UnsupportedEncodingException {
		byte[] decryptFrom = parseHexStr2Byte(content);

		byte[] decryptResult = decrypt(decryptFrom, password);
		
		return new String(decryptResult,"utf-8");
	}
	
	/**
	 * 解密
	 * @author EX-LIJINHUA001
	 * @date 2013-2-20
	 * @param content	待解密内容
	 * @param password	解密密钥
	 * @return
	 */
	public static byte[] decrypt(byte[] content, String password) {

		try {

			KeyGenerator kgen = KeyGenerator.getInstance("AES");

			kgen.init(128, new SecureRandom(password.getBytes()));

			SecretKey secretKey = kgen.generateKey();

			byte[] enCodeFormat = secretKey.getEncoded();

			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");

			Cipher cipher = Cipher.getInstance("AES");// 创建密码器

			cipher.init(Cipher.DECRYPT_MODE, key);// 初始化

			byte[] result = cipher.doFinal(content);

			return result; // 加密

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();

		} catch (NoSuchPaddingException e) {

			e.printStackTrace();

		} catch (InvalidKeyException e) {

			e.printStackTrace();

		} catch (IllegalBlockSizeException e) {

			e.printStackTrace();

		} catch (BadPaddingException e) {
			e.printStackTrace();

		}

		return null;
	}

	/**
	 * 将二进制转换成16进制
	 * @author EX-LIJINHUA001
	 * @date 2013-2-20
	 * @param buf
	 * @return
	 */
	public static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 将16进制转换为二进制
	 * @author EX-LIJINHUA001
	 * @date 2013-2-20
	 * @param hexStr
	 * @return
	 */
	public static byte[] parseHexStr2Byte(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length() / 2];
		for (int i = 0; i < hexStr.length() / 2; i++) {

			int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);

			int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
					16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}
    
	public static void main(String[] args) throws UnsupportedEncodingException {

		String content = "{\"source\": \"来源\",\"certificate_type\": \"证件类型\",\"certificate_no\": \"证件号码\",\"phone\": \"手机号码\",\"car_mark\": \"车牌号\"}";
		
		String password = "12345678";

		// 加密
		System.out.println("加密前：" + content);

		String encryptResultStr = encryptToString(content, password);
		System.out.println("加密后：" + encryptResultStr);

		// 解密
		String decryptResult = decryptToString(encryptResultStr, password);
		System.out.println("解密后：" + decryptResult);

	}
}
