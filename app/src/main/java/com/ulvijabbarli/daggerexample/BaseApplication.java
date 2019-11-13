package com.ulvijabbarli.daggerexample;



import com.ulvijabbarli.daggerexample.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BaseApplication extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return null;
        return DaggerAppComponent.builder().application(this).build();
    }
}
