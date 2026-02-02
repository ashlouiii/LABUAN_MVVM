package com.example.list2go.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.list2go.R
import com.example.list2go.model.Food

class FoodAdapter(private var list: List<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.txtName)
        val price: TextView = view.findViewById(R.id.txtPrice)
        val image: ImageView = view.findViewById(R.id.imgFood) // ✅ ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)

        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {

        val food = list[position]

        holder.name.text = food.name
        holder.price.text = food.price

        // ✅ Set image
        holder.image.setImageResource(food.image)
    }

    override fun getItemCount(): Int = list.size

    fun updateData(newList: List<Food>) {

        list = newList
        notifyDataSetChanged()
    }
}