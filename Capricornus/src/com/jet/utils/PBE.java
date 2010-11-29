package com.jet.utils;

// import com.counterpane.Twofish; // moved to current package.
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

/**
 * The PBE class is used for Password Based Encryption/Decryption of
 * cleartext.  The initial use of this code is for the purpose of 
 * encrypting passwords that are stored in properties files. <b>
 *
 * This code makes used of a java implementation of the TwoFish encription
 * algorithm.  For more information visit http://www.counterpane.com/twofish.html.
 *
 * @author Paul Bemowski.
 */
public class PBE {
   private static final BASE64Encoder b64encoder=new BASE64Encoder();
   private static final BASE64Decoder b64decoder=new BASE64Decoder();
   /** The twofish key. */
   private Object key=null;
   /** Twofish implementation. */
   private Twofish twofish=new Twofish();
   /** end key. */
   private static final String endcode="(<{-jet-}>)";
   /** */
   private String encryptedPass=null;

   /** 
    * The PBE class is constructed with the password used for 
    * encryption/decryption.
    * @param password The passsword.
    */
   public PBE(String pass) 
      throws java.security.InvalidKeyException {
      buildKey(pass);
      encryptedPass=encrypt(pass);
   }

   /** The TwoFish algorithm requires that the byte array used to form
    * a key is 8, 16, 24, or 32 bytes.  To limit restrictions on password, 
    * we're gonna pad and truncate to 32 bytes for all passwords. */
   private void buildKey(String pass) 
      throws java.security.InvalidKeyException {
      String newpass=null;
      if (pass.length() < 32) {
         newpass=pad(pass, 32, "p");
      }
      key=twofish.makeKey(newpass.getBytes());
   }

   /** */
   public boolean isPassword(String pass) {
      if (pass == null)
         return false;
      if(pass.equals(decrypt(encryptedPass)))
         return true;
      else
         return false;
   }

   /** A simple padding function. */
   private static final String pad(String input, int length, String padchar) {
      int ilen=input.length();
      int padchars=length-ilen;
      StringBuffer s=new StringBuffer(length);
      s.append(input);
      for (int i=0; i<padchars; i++)
         s.append(padchar);
      return s.toString();
   }

   /** pads the string to some integer multiple of 16 */
   private static final String pad16(String s) {
      int len=s.length();
      int newsize=(int)((Math.floor((double)len/16d))*16)+16;
      return pad(s, newsize, "p");
   }

   /** */
   private static final String removeCRLF(String s) {
      char c[]=s.toCharArray();
      StringBuffer sb=new StringBuffer(c.length);
      for (int i=0; i<c.length; i++) {
         if (c[i] != '\n' &&
             c[i] != '\r')
            sb.append(c[i]);
      }
      return sb.toString();
   }

   /** The encrypt method will encrypt cleartext into cipher text.  In
    * theory, the clear text would only be recoverable with the decrypt
    * method of PBE with the exact same password.
    *
    * @param cleartext The text to be encrypted.
    * @return The encrypted cipher text.
    */
   public String encrypt(String cleartext) {
      // pad to 16, and encode all 
      cleartext=cleartext+endcode;
      cleartext=pad16(cleartext);
      byte cleartextbytes[]=cleartext.getBytes();
      byte ciphertextbytes[]=new byte[cleartextbytes.length];
      int blocks=(int)(cleartextbytes.length/16);
      for (int i=0; i<blocks; i++) {
         byte cipherblock[]=twofish.blockEncrypt(cleartextbytes, i*16, key);
         System.arraycopy(cipherblock, 0, ciphertextbytes, i*16, 16);
      }
     
      // ok, now ciphertextbytes contains an encrypted byte array.
      // now we'll use base64 encoding to convert the byte array back into
      // a string suitable for writing to a text file.
      return removeCRLF(b64encoder.encode(ciphertextbytes));
   }

   /** The decrypt method is used to recover the original cleartext from
    * input ciphertext.
    *
    * @param ciphertext The text to be decrypted.
    * @return The original clear text.
    */
   public String decrypt(String ciphertext) {
      
      byte ciphertextbytes[]=null;

      try {
         ciphertextbytes=b64decoder.decodeBuffer(ciphertext);
      } catch (java.io.IOException ex) {
         throw new RuntimeException("base64Decoder unable to decode ciphertext: "+
                                    ex.toString());
      }
         
      byte cleartextbytes[]=new byte[ciphertextbytes.length];
      
      // these better be divisible by 16!!
      int blocks=ciphertextbytes.length/16;
      for (int i=0; i<blocks; i++) {
         byte clearblock[]=twofish.blockDecrypt(ciphertextbytes, i*16, key);
         System.arraycopy(clearblock, 0, cleartextbytes, i*16, 16);
      }
      String paddedtext=new String(cleartextbytes);
      // System.out.println ("ptext="+paddedtext);
      int endidx=paddedtext.lastIndexOf(endcode);
      if (endidx == -1) {
         // this most likely means that the decryption failed, but 
         // we'll just return the user the full pile of crap that fell out
         // of the decryption algorithm.
         return paddedtext;
      }
      else {
         // this most likely means the decryption succeeded.
         return paddedtext.substring(0, endidx);
      }
   }
   
   /** 
    */
   public static void main(String args[]) 
      throws Exception {
      
      PBE pbe=new PBE("testpassword");

      String test="draw putrid dirt upward now is the time now, NOW is the time to call all good men to the aide of their country.  NOW is the time.  superclaafragilisticexpealidocous";
      String encrypted=pbe.encrypt(test);
      System.out.println ("Encrypting '"+test+"'");
      System.out.println ("Results in \n"+encrypted+"\n");

      System.out.println ("Decrypted text '"+pbe.decrypt(encrypted)+"'");

      // pbe=new PBE("1zsax5lj@(~~");
      // System.out.println ("def enc: '"+pbe.encrypt("1zsax5lj@(~~")+"'");
   }
}


