/**
 * 
 */
package im.device.smartdining.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;

import com.gopawpaw.droidcore.log.AppLog;

/**
 * @author jinhua
 * 
 */
public class ExpandAnimation extends Animation {
	
	/**
	 * Log标签
	 */
	private static final String TAG = ExpandAnimation.class.getSimpleName();
	
	private View mAnimatedView;
	private LayoutParams mViewLayoutParams;
	private int mMarginStart, mMarginEnd;
	private boolean mIsVisibleAfter = false;
	private boolean mWasEndedAlready = false;

	/**
	 * Initialize the animation
	 * 
	 * @param duration
	 *            The duration of the animation, in ms
	 */
	public ExpandAnimation(int duration) {

		setDuration(duration);

	}
	
	/**
	 * Initialize the animation
	 * 
	 * @param view
	 *            The layout we want to animate
	 * @param duration
	 *            The duration of the animation, in ms
	 */
	public ExpandAnimation(View view, int duration) {

		setDuration(duration);
		mAnimatedView = view;
		mViewLayoutParams = (LayoutParams) view.getLayoutParams();

		// if the bottom margin is 0,
		// then after the animation will end it'll be negative, and invisible.
		mIsVisibleAfter = (mViewLayoutParams.bottomMargin == 0);

		mMarginStart = mViewLayoutParams.bottomMargin;
		mMarginEnd = (mMarginStart == 0 ? (0 - view.getHeight()) : 0);

		view.setVisibility(View.VISIBLE);
	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		
		super.applyTransformation(interpolatedTime, t);
		if(interpolatedTime == 0.0f){
			return;
		}
		if (interpolatedTime < 1.0f) {
			for(int i=1;i<4;i++){
				float tempTime = interpolatedTime*i/3;
				// Calculating the new bottom margin, and setting it
				mViewLayoutParams.bottomMargin = mMarginStart
				+ (int) ((mMarginEnd - mMarginStart) * tempTime);
				
				AppLog.v(TAG, i+"interpolatedTime:"+tempTime+" mMarginStart="+mMarginStart+" mMarginEnd="+mMarginEnd+" bottomMargin="+mViewLayoutParams.bottomMargin);
				
				// Invalidating the layout, making us seeing the changes we made
				mAnimatedView.requestLayout();
				
				// Making sure we didn't run the ending before (it happens!)
			}
		} else if (!mWasEndedAlready) {
			AppLog.d(TAG, "bottomMargin="+mViewLayoutParams.bottomMargin+" mMarginEnd="+mMarginEnd+" mIsVisibleAfter="+mIsVisibleAfter);
			mViewLayoutParams.bottomMargin = mMarginEnd;
			mAnimatedView.requestLayout();

			if (mIsVisibleAfter) {
				mAnimatedView.setVisibility(View.GONE);
			}
			mWasEndedAlready = true;
		}
	}

	public void setAnimatedView(View view) {
		this.mAnimatedView = view;
		mWasEndedAlready = false;
		mViewLayoutParams = (LayoutParams) view.getLayoutParams();

		// if the bottom margin is 0,
		// then after the animation will end it'll be negative, and invisible.
		mIsVisibleAfter = (mViewLayoutParams.bottomMargin == 0);

		mMarginStart = mViewLayoutParams.bottomMargin;
		mMarginEnd = (mMarginStart == 0 ? (0 - view.getHeight()) : 0);

		view.setVisibility(View.VISIBLE);
	}
}