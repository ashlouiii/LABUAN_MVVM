package com.example.list2go.repository

import com.example.list2go.R
import com.example.list2go.model.Food

class FoodRepository {

    fun getFoods(): List<Food> {
        return listOf(

            Food("Mango Shake", "₱80", R.drawable.mangoshake),
            Food("Durian Shake", "₱90", R.drawable.durianshake),
            Food("Avocado Shake", "₱90", R.drawable.avocadoshake),
            Food("Banana Shake", "₱60", R.drawable.bananashake),
            Food("Dragon Fruit Shake", "₱90", R.drawable.dragonfruitshake),
            Food("Apple", "₱80", R.drawable.appleshake),
            Food("Guyabano Shake", "₱80", R.drawable.guyabanoshake),
            Food("Cookies and Cream Shake", "₱80", R.drawable.cookiesandcreamshake)

        )
    }
}