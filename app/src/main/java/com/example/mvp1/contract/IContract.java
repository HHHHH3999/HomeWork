package com.example.mvp1.contract;

import com.example.mvp1.Base.BaseView;
import com.example.mvp1.Beans.BannerBean;
import com.example.mvp1.utils.INetCallBack;

public interface IContract {
    public interface IModle{
        <T> void getData(String url, INetCallBack<T> iNetCallBack);
    }
    public interface IPresenter{
        void getBanner();
    }
    interface IView extends BaseView {
        void getData(BannerBean bannerBean);
    }
}
