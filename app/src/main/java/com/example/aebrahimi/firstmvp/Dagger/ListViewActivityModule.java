package com.example.aebrahimi.firstmvp.Dagger;

import com.example.aebrahimi.firstmvp.ListContract.ListContract;
import com.example.aebrahimi.firstmvp.ListContract.ListPresenterImp;
import com.example.aebrahimi.firstmvp.ListContract.ListView;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ListViewActivityModule {
   @Binds
   abstract ListContract.Presenter bindPresenter(ListPresenterImp presenter);
   @Binds
   abstract ListContract.View bindListView(ListView listView);
}
