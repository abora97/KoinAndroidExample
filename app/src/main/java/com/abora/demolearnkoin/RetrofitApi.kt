package com.abora.demolearnkoin

import io.reactivex.Single
import retrofit2.http.GET

interface RetrofitApi {

    @GET("posts")
    fun getAllPosts() : Single<List<PostsViewModelItem>>

}