package com.example.appdio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter : RecyclerView.Adapter<MenuItemAdapter.AdapterViewHolder>() {

    private val list = mutableListOf<MenuItemModel>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return AdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.initViews(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }

    fun setItensList(list: List<MenuItemModel>){
        this.list.clear()
        this.list.addAll(list)
    }

    class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val tvTittle by lazy {
            itemView.findViewById<TextView>(R.id.tv_tittle)
        }

        fun initViews(item: MenuItemModel){
            tvTittle.text = item.titulo
        }
    }
}