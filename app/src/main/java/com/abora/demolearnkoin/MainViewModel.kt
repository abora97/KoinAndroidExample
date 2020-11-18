package com.abora.demolearnkoin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.schedulers.Schedulers

class MainViewModel(val apiService: RetrofitApi, val schedulers: RxSingleSchedulers) : ViewModel() {

    val userList = MutableLiveData<List<PostsViewModelItem>>()
    fun fetchPosts() {
        apiService.getAllPosts().subscribeOn(Schedulers.io())
            .compose(schedulers.applySchedulers())
            .subscribe({ result -> userList.postValue(result) },
                { throwable ->

                })

    }

}