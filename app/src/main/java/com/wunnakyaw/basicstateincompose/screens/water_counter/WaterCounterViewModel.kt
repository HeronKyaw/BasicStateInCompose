package com.wunnakyaw.basicstateincompose.screens.water_counter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WaterCounterViewModel: ViewModel() {
    private var _count by mutableIntStateOf(0)

    val count: Int
        get() = _count

    fun increment() {
        _count++
    }
}