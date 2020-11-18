package com.abora.demolearnkoin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_user_adapter.view.*

class PostsAdapter: RecyclerView.Adapter<UserViewHolder>()  {

    var userList = mutableListOf<PostsViewModelItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_user_adapter, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.title.text = user.title
        holder.body.text=user.body
    }

    fun setItems(it: List<PostsViewModelItem>) {
        this.userList = it.toMutableList()
        notifyDataSetChanged()
    }

}

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val title = view.user_item_title

    val body= view.user_item_body

}