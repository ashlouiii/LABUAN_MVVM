package com.example.list2go.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.list2go.model.Food
import com.example.list2go.repository.FoodRepository

class FoodViewModel : ViewModel() {

    private val repository = FoodRepository()

    private val _foodList = MutableLiveData<List<Food>>()
    val foodList: LiveData<List<Food>> = _foodList

    fun loadFoods() {
        _foodList.value = repository.getFoods()
    }
}