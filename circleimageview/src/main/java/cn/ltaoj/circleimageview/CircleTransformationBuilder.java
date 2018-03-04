package cn.ltaoj.circleimageview;

import android.content.res.ColorStateList;
import android.util.DisplayMetrics;
import android.view.animation.Transformation;
import android.widget.ImageView;

/**
 * Created by ltaoj on 2018/3/3 17:08.
 */

public class CircleTransformationBuilder {

    private DisplayMetrics mDisplayMetrics;
    private float[] mCornerRadius = new float[] {0, 0, 0, 0};
    private boolean mOval = false;
    private float mBorderWidth = 0;
    private ColorStateList mBorderColor = ColorStateList.valueOf(CircleDrawable.DEFAULT_BORDER_COLOR);
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;

    public CircleTransformationBuilder() {

    }

    public CircleTransformationBuilder scaleType(ImageView.ScaleType scaleType) {
        return null;
    }

    public CircleTransformationBuilder cornerRadius(float radius) {
        return null;
    }

    public CircleTransformationBuilder cornerRadius(int corner, float radius) {
        return null;
    }

    public CircleTransformationBuilder cornerRadiusDp(float radius) {
        return null;
    }

    public CircleTransformationBuilder cornerRadiusDp(int corner, float radius) {
        return null;
    }

    public CircleTransformationBuilder borderWidth(float width) {
        return null;
    }

    public CircleTransformationBuilder borderWidthDp(float width) {
        return null;
    }

    public CircleTransformationBuilder borderColor(int color) {
        return null;
    }

    public CircleTransformationBuilder borderColor(ColorStateList colors) {
        return null;
    }

    public CircleTransformationBuilder oval(boolean oval) {
        return null;
    }

    public Transformation build() {
        return null;
    }
}
