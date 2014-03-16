package com.gopawpaw.droidcore.utils;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.gopawpaw.droidcore.log.AppLog;


public class LocationUtils {

	private LocationManager mLocationManager;
	private Location mLocation;
	private Context ctx;
	private String mServiceName = Context.LOCATION_SERVICE;
	
	public LocationUtils(Context ctx){
		this.ctx = ctx;
	}
	
	/**
	 * 判断是否开启GPS
	 */
	public boolean openGPSSettings() {
		boolean isGPSOpened = true;
		LocationManager alm = (LocationManager) ctx.getSystemService(mServiceName);
		if (alm.isProviderEnabled(android.location.LocationManager.GPS_PROVIDER)) {
			isGPSOpened = false;
		}
		return isGPSOpened;
	}

	/**
	 * 获取位置信息
	 */
	public void getLocation() {
		
		// 获取位置管理服务
		mServiceName = Context.LOCATION_SERVICE;
		mLocationManager = (LocationManager) ctx.getSystemService(mServiceName);
		// 查找到服务信息
		Criteria mCriteria = new Criteria();
		mCriteria.setAccuracy(Criteria.ACCURACY_FINE); // 高精度
		mCriteria.setAltitudeRequired(false); // 不要求海拔信息
		mCriteria.setBearingRequired(false); // 不要求方位信息
		mCriteria.setCostAllowed(false); // 是否允许付费
		mCriteria.setPowerRequirement(Criteria.POWER_HIGH); // 低功耗
		
		String provider = mLocationManager.getBestProvider(mCriteria, true); // 获取GPS信息
		if(provider == null || provider.equals("")){
			provider = LocationManager.NETWORK_PROVIDER;
		}
		AppLog.e("provider", "-----provider-----"+provider);
//		mLocation = mLocationManager.getLastKnownLocation(provider); // 通过GPS获取位置

		mLocationManager.requestLocationUpdates(provider, 3000, 0, mLocationListener);
		
	}

	/**
	 * 从location获取地理位置信息
	 * @return 地理位置信息
	 */
//	public List<String> getAddressFromLocation() {
//		List<String> locationInfo = new ArrayList<String>();
//		// 获取location对应的地理位置信息
//		if (mLocation != null) {
//			mLocationManager.removeUpdates(mLocationListener);
//			PABankLog.e("getAddressFromLocation", "----inner----"+mLocation.toString());
//			double latitude = mLocation.getLatitude();
//			double longitude = mLocation.getLongitude();
//			Geocoder g = new Geocoder(ctx, Locale.getDefault());
//			try {
//				PABankLog.e("getAddressFromLocation", "----inner try----");
//				List<Address> list = g.getFromLocation(latitude, longitude, 1);
//				PABankLog.e("","地址全部信息："+list.toString());
//				if (list.size() > 0) {
//					Address addr = list.get(0);
//					locationInfo.add(addr.getAddressLine(1));
//					locationInfo.add(addr.getAddressLine(2));
//					locationInfo.add(addr.getLocality());
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return locationInfo;
//	}
	/**
	 * 从location获取当前位置的经纬度
	 * @return 当前位置的经纬度
	 */
	public List<Double> getLaAndLoFromLocation(){
		List<Double> laloList = new ArrayList<Double>();
		// 获取当前位置的经纬度
		if (mLocation != null) {
			double latitude = mLocation.getLatitude();
			double longitude = mLocation.getLongitude();
			laloList.add(latitude);
			laloList.add(longitude);
			AppLog.e("latitude", "latitude == "+latitude);
			AppLog.e("longitude", "longitude == "+longitude);
		}	
		return laloList;
	}
	
	private LocationListener mLocationListener = new LocationListener() {

		@Override
		public void onLocationChanged(Location location) {
			mLocation = location;
			AppLog.e("onLocationChanged", mLocation.toString());
//			if(location != null){
//				mLocationManager.removeUpdates(mLocationListener);
//			}
		}

		@Override
		public void onProviderDisabled(String provider) {

		}

		@Override
		public void onProviderEnabled(String provider) {

		}

		@Override
		public void onStatusChanged(String provider, int status,
				Bundle extras) {

		}

	};
}
