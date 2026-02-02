package com.example.list2go

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.list2go.adapter.FoodAdapter
import com.example.list2go.viewmodel.FoodViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: FoodViewModel by viewModels()
    private lateinit var adapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        adapter = FoodAdapter(emptyList())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        viewModel.foodList.observe(this, Observer {
            adapter.updateData(it)
        })

        viewModel.loadFoods()
    }
}