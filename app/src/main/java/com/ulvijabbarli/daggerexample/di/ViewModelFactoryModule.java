package com.ulvijabbarli.daggerexample.di;

import androidx.lifecycle.ViewModelProvider;

import com.ulvijabbarli.daggerexample.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);

}
