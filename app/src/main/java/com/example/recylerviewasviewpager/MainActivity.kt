package com.example.recylerviewasviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import com.bt.whide.driver.ui.home.offlineScreen.menu.menuNavigation.todayPreference.MyRecyclerviewAdapter
import com.example.recylerviewasviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setAdapter()
    }

    private fun setAdapter() {
        var adapter = MyRecyclerviewAdapter()
        PagerSnapHelper().attachToRecyclerView(binding.rvOfflineReason)
        binding.adapter = adapter
        binding.rvOfflineReason.addItemDecoration(LinePagerIndicatorDecoration())

    }
}