package com.gopawpaw.droidcore.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;

/**
 * @author HUXINWU
 * @date 2011-12-14
 * @version
 * @description 图片处理类
 */
public class BitmapUtils {

	/**
	 * 计算相应需要的大小，存在问题
	 *
	 * @param options
	 * @param minSideLength
	 * @param maxNumOfPixels
	 * @return 
	 */
	public static int computeSampleSize(BitmapFactory.Options options, int minSideLength, int maxNumOfPixels) {
		
		int initialSize = 1;
		
		 double w = options.outWidth;
		    double h = options.outHeight;

		    int lowerBound = (maxNumOfPixels == -1) ? 1 :
		            (int) Math.ceil(Math.sqrt(w * h / maxNumOfPixels));

		    int upperBound = (minSideLength == -1) ? 128 :
		            (int) Math.min(Math.floor(w / minSideLength),
		            Math.floor(h / minSideLength));

		    if (upperBound < lowerBound) {
		        // return the larger one when there is no overlapping zone.
		    	initialSize = lowerBound;
		    }
		    if ((maxNumOfPixels == -1) &&
		            (minSideLength == -1)) {
		    	initialSize = 1;
		    } else if (minSideLength == -1) {
		    	initialSize = lowerBound;
		    } else {
		    	initialSize = upperBound;
		    }
		    
	    int roundedSize;

	    if (initialSize <= 8) {

	        roundedSize = 1;
	        while (roundedSize < initialSize) {
	            roundedSize <<= 1;
	        }
	    } else {
	        roundedSize = (initialSize + 7) / 8 * 8;
	    }

	    return roundedSize;
	}
	
	/**
	 * 创建带有影子的图片
	 *
	 * @param originalImage 原图片
	 * @param scale 缩放比例
	 * @return 
	 */
	public static Bitmap createReflectedImage(Bitmap originalImage, float reflectRatio, float scale) {

		int width = (int)(originalImage.getWidth() * scale);
		int height = (int)(originalImage.getHeight() * scale);
		
		final Rect srcRect = new Rect(0, 0, originalImage.getWidth(), originalImage.getHeight());
	    final Rect dstRect = new Rect(0, 0, width, height);
	    
		final int reflectionGap = 1;

		Bitmap bitmapWithReflection = Bitmap.createBitmap(width, (int)(height + height*reflectRatio), Config.ARGB_8888);   
        Canvas canvasRef = new Canvas(bitmapWithReflection);   

        canvasRef.drawBitmap(originalImage, srcRect, dstRect, null);   
        
        Matrix matrix = new Matrix();   
        matrix.setTranslate(0, height + height + reflectionGap);
        matrix.preScale(scale, -scale); 
        
        canvasRef.drawBitmap(originalImage, matrix, null);
        
        Paint paint = new Paint();
        LinearGradient shader = new LinearGradient(0,   
                height, 0, bitmapWithReflection.getHeight() + reflectionGap, 0x80ffffff, 0x00ffffff, TileMode.CLAMP);   
        paint.setShader(shader);   
        paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));   
        canvasRef.drawRect(0, height, width, bitmapWithReflection.getHeight()   
                + reflectionGap, paint);   

        originalImage.recycle();
		return bitmapWithReflection;
	}
	
	/**
	 * 得到缩小的图片，这里缩小的是图片质量
	 *
	 * @param dataBytes
	 * @param maxWidth
	 * @return 
	 */
	public static Bitmap getCorrectBmp(byte dataBytes[], int inSampleSize, Bitmap.Config config){
		BitmapFactory.Options opts = new BitmapFactory.Options();
		opts.inJustDecodeBounds = true;
		opts.inPreferredConfig = config;
		opts.inSampleSize = inSampleSize;
		opts.inJustDecodeBounds = false;
		Bitmap originalImage = BitmapFactory.decodeByteArray(dataBytes, 0, dataBytes.length, opts);
		return originalImage;
	}
	
	/**
	 * 得到圆角图片
	 *
	 * @param bitmap 原图像
	 * @param scale 缩放比例
	 * @param roundPx 圆角像素
	 * @return 
	 */
	public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, float scale, float roundPx, Bitmap.Config config) {
		
		int width = (int)(bitmap.getWidth() * scale);
		int height = (int)(bitmap.getHeight() * scale);
		
	    Bitmap output = Bitmap.createBitmap(width, height, config);
	    Canvas canvas = new Canvas(output);

	    final int color = 0xff000000;
	    final Paint paint = new Paint();
	    final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
	    final RectF rectF = new RectF(0, 0, width, height);

	    paint.setAntiAlias(true);
	    canvas.drawARGB(0, 0, 0, 0);
	    paint.setColor(color);
	    canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
	    
		paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
		
//	    draw的方式缩放
	    canvas.drawBitmap(bitmap, rect, rectF, paint);
	    
//	    Matrix的方式缩放
//	    Matrix matrix = new Matrix();
//	    matrix.postScale(scale, scale);
//	    canvas.drawBitmap(bitmap, matrix, paint);

	    
	    return output;
	}
	
	/**
	 * 得到缩放后的图片
	 *
	 * @param bitmap
	 * @param scale
	 * @return
	 */
	public static Bitmap getScaleBitmap(Bitmap bitmap, float scale){
		Matrix matrix=new Matrix();
		matrix.postScale(scale, scale);
		Bitmap dstbmp=Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),
				bitmap.getHeight(),matrix,true);
		return dstbmp;
	}
	
	/**
	 * 得到手机data目录下的图片
	 *
	 * @param context
	 * @param fileName
	 * @return 
	 */
	public static Bitmap getBmpFromFile(Context context, String fileName){
		try {
			FileInputStream imgInputStream = context.openFileInput(fileName);
			Bitmap bmp = BitmapFactory.decodeStream(imgInputStream);
			return bmp;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 保存图片到指定位置
	 *
	 * @param context
	 * @param bmp
	 * @param fileName
	 * @return 
	 */
	public static void saveBmpToPng(Context context, Bitmap bmp, String fileName)
	{
		try {
			fileName = fileName + ".png";
        	FileOutputStream fileOut = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        	bmp.compress(Bitmap.CompressFormat.PNG, 0, fileOut);
        	fileOut.flush();
        	fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
