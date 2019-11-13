package com.ulvijabbarli.daggerexample.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString(){
        return "string one";
    }

    @Provides
    static boolean getApp(Application application){
        return application==null;
    }
}
