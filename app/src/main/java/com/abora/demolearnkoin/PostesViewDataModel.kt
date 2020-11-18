package com.abora.demolearnkoin

import com.google.gson.annotations.SerializedName


data class PostsViewModelItem(
    @SerializedName("userId") val userId : Int,
    @SerializedName("id") val id : Int,
    @SerializedName("title") val title : String,
    @SerializedName("body") val body : String
)