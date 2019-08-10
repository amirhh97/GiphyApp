package com.example.aebrahimi.firstmvp.Dagger;

import com.example.aebrahimi.firstmvp.ShowContract.ShowContract;
import com.example.aebrahimi.firstmvp.ShowContract.ShowPresenterImp;
import com.example.aebrahimi.firstmvp.ShowContract.ShowView;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ShowViewActivityModule {
   @Binds
   abstract ShowContract.Presenter bindPresenter(ShowPresenterImp presenter);
   @Binds
   abstract ShowContract.View bindShowView(ShowView showView);
}
