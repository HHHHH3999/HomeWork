package com.example.mvp1.Base;

public class BasePresenter<T extends BaseView> {
    private T ivew;
    public void attachView(T t){
        ivew=t;
    }
}
