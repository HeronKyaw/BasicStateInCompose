package com.wunnakyaw.basicstateincompose.screens.wellness

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.wunnakyaw.basicstateincompose.models.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks


    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }