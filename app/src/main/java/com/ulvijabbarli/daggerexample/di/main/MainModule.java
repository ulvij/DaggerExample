package com.ulvijabbarli.daggerexample.di.main;

import com.ulvijabbarli.daggerexample.network.main.MainApi;
import com.ulvijabbarli.daggerexample.ui.main.posts.PostsRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter providePostsAdapter() {
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit) {
        return retrofit.create(MainApi.class);
    }

}
