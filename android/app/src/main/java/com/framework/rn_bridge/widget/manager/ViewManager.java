package com.framework.rn_bridge.widget.manager;

import android.support.annotation.Nullable;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.image.ReactImageView;

/**
 * package: com.framework.rn_bridge
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/12 下午5:03
 * desc:
 */

public class ViewManager extends SimpleViewManager<ReactImageView> {

    public static final String REACT_CLASS = "RCTImageView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactImageView createViewInstance(ThemedReactContext reactContext) {
        return new ReactImageView(reactContext, Fresco.newDraweeControllerBuilder(), "");
    }

    @ReactProp(name = "src")
    public void setSrc(ReactImageView view, @Nullable String src) {
        WritableArray array = new WritableNativeArray();
        WritableMap map = new WritableNativeMap();
        map.putString("uri", src);
        array.pushMap(map);
        view.setSource(array);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(ReactImageView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(ReactImageView view, @Nullable String resizeMode) {
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
    }

}
