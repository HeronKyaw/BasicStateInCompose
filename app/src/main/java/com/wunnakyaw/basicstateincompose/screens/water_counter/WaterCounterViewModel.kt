package com.wunnakyaw.basicstateincompose.screens.water_counter

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class WaterCounterViewModel: ViewModel() {
    private var _count = mutableIntStateOf(0)

    val count: MutableIntState
        get() = _count

    fun increment() {
        _count.intValue++
    }
}