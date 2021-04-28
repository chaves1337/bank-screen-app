package com.example.appdio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList : RecyclerView
    private lateinit var adapter : MenuItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setItens()
    }

    private fun initViews(){
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)

    }

    private fun setItens(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "comprovantes"
                ),
                MenuItemModel(
                    "investimentos"
                ),
                MenuItemModel(
                    "portabilidade de salario"
                )

            )
        )
    }
}