package com.examle.homework64.ui.activities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val counter = MutableLiveData<Int>()
    val commands = MutableLiveData<String>()

    private var count = 0
    private var plus = "+"
    private var minus = "-"

    fun OnIncrementClick() {
        count++
        counter.value = count
        commands.value = plus
    }

    fun OnDecrementClick() {
        count--
        counter.value = count
        commands.value = minus
    }
}