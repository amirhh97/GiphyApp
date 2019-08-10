package com.example.aebrahimi.firstmvp.Dagger;

import com.example.aebrahimi.firstmvp.ListContract.ListView;
import com.example.aebrahimi.firstmvp.ShowContract.ShowView;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = AndroidSupportInjectionModule.class)
public abstract class ActivityBuilder {

   @ContributesAndroidInjector(modules = ListViewActivityModule.class)
   abstract ListView bindListView();

   @ContributesAndroidInjector(modules = ShowViewActivityModule.class)
   abstract ShowView bindShowView();
}
