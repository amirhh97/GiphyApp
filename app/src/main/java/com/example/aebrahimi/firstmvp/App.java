package com.example.aebrahimi.firstmvp;

import android.app.Application;

import com.example.aebrahimi.firstmvp.Dagger.DaggerInjector;
import com.example.aebrahimi.firstmvp.Dagger.Injector;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 * Created by aebrahimi on 8/15/2018 AD.
 */

public class App extends DaggerApplication {
   private static Injector injector;
   private static Application context;

   @Override
   public void onCreate() {
      super.onCreate();

      //injector = DaggerInjector.builder().networkModule(new NetworkModule()).dataBaseModule(new DataBaseModule()).appModule(new AppModule())/*.presenterModule(new PresenterModule())*/.build();
      context = this;
   }

   public static Injector getInjector() {
      return injector;
   }

   public static Application getContext() {
      return context;
   }

   @Override
   protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
      return DaggerInjector.builder().create(this);
   }
}
