package com.techtitan.yesdriver.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class GlideImage {
    public static void glide_img(Context mcontext, final String url, ImageView imageView){

        Glide.with(mcontext)
                .load(url)
                .thumbnail(0.1f)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                      Logger.w("load fail="+e);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        Logger.w("load ready="+resource.getMinimumHeight()+"::"+resource.getMinimumWidth());
                        return false;
                    }
                })
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
    public static void glide_img_load(Context mcontext, final String url, final ImageView imageView, int loader){
        GlideApp.with(mcontext).asBitmap()
                .load(url)
                .dontAnimate()
                .placeholder(loader)
                .thumbnail(0.1f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
//

               /* .transition(withCrossFade().crossFade(1000))
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Logger.w("on load failed reason="+e);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {

                        return false;
                    }
                })*/

    }
//    public static void loadgif(Activity activity, final ImageView imageView){
//        Glide.with(activity).asGif().load(R.raw.animateloading).into(imageView);
//    }
}
