package com.juliobro.crudlocalstorage;

import android.app.Application;

import io.realm.Realm;

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
