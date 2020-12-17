package com.example.mvp1.utils;

public interface INetCallBack<T> {
void onSuccess(T t);
void onFile(String string);
}
