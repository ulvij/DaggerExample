package com.ulvijabbarli.daggerexample.di;

import com.ulvijabbarli.daggerexample.di.auth.AuthModule;
import com.ulvijabbarli.daggerexample.di.auth.AuthViewModelsModule;
import com.ulvijabbarli.daggerexample.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();
}
