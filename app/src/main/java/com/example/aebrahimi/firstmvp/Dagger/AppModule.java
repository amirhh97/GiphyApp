package com.example.aebrahimi.firstmvp.Dagger;

import android.app.Application;

import com.example.aebrahimi.firstmvp.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by SeyedAmirhoseinHoseini on 8/21/18.
 */
@Module
public class AppModule {
    @Provides
    @Singleton
    Application provideContext()
    {
        return App.getContext();
    }
    @Provides
    CompositeDisposable provideCompositDisposable()
    {
        return  new CompositeDisposable();
    }
}
