package com.example.mvp1.m;

import com.example.mvp1.contract.IContract;
import com.example.mvp1.utils.INetCallBack;
import com.example.mvp1.utils.RetrofitUtils;

public class ModleImpl implements IContract.IModle {

    @Override
    public <T> void getData(String url, INetCallBack<T> iNetCallBack) {
        RetrofitUtils.getRetrofitUtils().getBanner(url,iNetCallBack);
    }
}
