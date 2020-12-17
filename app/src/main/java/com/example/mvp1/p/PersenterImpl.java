package com.example.mvp1.p;

import com.example.mvp1.Base.BasePresenter;
import com.example.mvp1.Beans.BannerBean;
import com.example.mvp1.contract.IContract;
import com.example.mvp1.m.ModleImpl;
import com.example.mvp1.utils.INetCallBack;
import com.example.mvp1.utils.URLConstant;

public class PersenterImpl extends BasePresenter<IContract.IView> implements IContract.IPresenter {


    private final ModleImpl modle;

    public PersenterImpl(IContract.IView iView) {

        modle = new ModleImpl();
    }

    @Override
    public void getBanner() {
modle.getData(URLConstant.BANNER, new INetCallBack<BannerBean>() {
    @Override
    public void onSuccess(BannerBean bannerBean) {
        ivew.getData(bannerBean);
    }

    @Override
    public void onFile(String string) {

    }
});
    }
}
