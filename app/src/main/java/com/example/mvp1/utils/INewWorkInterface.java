package com.example.mvp1.utils;

public interface INewWorkInterface {
    <T>void getBanner(String url,INetCallBack<T> iNetCallBack);
}
