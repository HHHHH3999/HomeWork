package com.example.mvp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mvp1.Base.BaseActivity;
import com.example.mvp1.Beans.BannerBean;
import com.example.mvp1.contract.IContract;
import com.example.mvp1.p.PersenterImpl;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

public class MainActivity extends BaseActivity<PersenterImpl> implements IContract.IView {

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.banner);
        initData();
    }

    private void initData() {
        persenter.getBanner();
    }

    @Override
    protected PersenterImpl getPersenter() {

        return new PersenterImpl(this);
    }

    @Override
    public void getData(BannerBean bannerBean) {
banner.setImages(bannerBean.getBannerlist())
        .setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                BannerBean.BannerlistBean bannerlistBean= (BannerBean.BannerlistBean) path;
                Glide.with(MainActivity.this).load(bannerlistBean.getImageurl()).into(imageView);
            }
        }).start();
    }
}