package com.bt.whide.driver.ui.home.offlineScreen.menu.menuNavigation.todayPreference

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

import com.example.recylerviewasviewpager.R
import com.example.recylerviewasviewpager.databinding.ItemRecyclerviewBinding

class MyRecyclerviewAdapter() :
    RecyclerView.Adapter<MyRecyclerviewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = DataBindingUtil.inflate<ItemRecyclerviewBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_recyclerview,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    inner class MyViewHolder(val binding: ItemRecyclerviewBinding) :
        ViewHolder(binding.root) {

    }
}