package com.kanishk.pricelinehack;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by kanishk on 11/7/15.
 */
public class PriceLineApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration imageLoader = new ImageLoaderConfiguration.Builder(this)
                .diskCacheSize(Constant.MAX_MEMORY_SIZE)
                .memoryCacheSizePercentage(
                        Constant.IMAGE_CACHE_PERCENT)
                .threadPoolSize(Constant.IMAGE_THREAD_POOL).build();
        ImageLoader.getInstance().init(imageLoader);
    }
}
