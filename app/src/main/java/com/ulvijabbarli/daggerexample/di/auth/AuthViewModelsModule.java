package com.ulvijabbarli.daggerexample.di.auth;

import androidx.lifecycle.ViewModel;

import com.ulvijabbarli.daggerexample.di.ViewModelKey;
import com.ulvijabbarli.daggerexample.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);

}
