package com.ulvijabbarli.daggerexample.di;

import com.ulvijabbarli.daggerexample.di.auth.AuthModule;
import com.ulvijabbarli.daggerexample.di.auth.AuthViewModelsModule;
import com.ulvijabbarli.daggerexample.di.main.MainFragmentBuildersModule;
import com.ulvijabbarli.daggerexample.di.main.MainModule;
import com.ulvijabbarli.daggerexample.di.main.MainViewModelsModule;
import com.ulvijabbarli.daggerexample.ui.auth.AuthActivity;
import com.ulvijabbarli.daggerexample.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class})
    abstract MainActivity contributeMainActivity();
}
