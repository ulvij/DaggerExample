package com.ulvijabbarli.daggerexample.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.ulvijabbarli.daggerexample.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: view model is working");

        if (this.authApi == null) {
            Log.d(TAG, "AuthViewModel: Auth Api is null");
        } else {
            Log.d(TAG, "AuthViewModel: Auth Api is Not null");
        }
    }
}
