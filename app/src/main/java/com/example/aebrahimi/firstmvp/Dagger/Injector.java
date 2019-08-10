package com.example.aebrahimi.firstmvp.Dagger;

import com.example.aebrahimi.firstmvp.App;
import com.example.aebrahimi.firstmvp.ListContract.ListView;
import com.example.aebrahimi.firstmvp.ShowContract.ShowView;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by aebrahimi on 8/15/2018 AD.
 */
@Singleton
@Component(modules = {NetworkModule.class, AppModule.class, DataBaseModule.class, AndroidSupportInjectionModule.class,ActivityBuilder.class})
public interface Injector extends AndroidInjector<App> {


   @Component.Builder
    abstract class InjectorBuilder extends AndroidInjector.Builder<App> {
   }
}
