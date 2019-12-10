package com.ulvijabbarli.daggerexample.di.main;

import com.ulvijabbarli.daggerexample.ui.main.posts.PostsFragment;
import com.ulvijabbarli.daggerexample.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}
