package com.wunnakyaw.basicstateincompose.screens.wellness

import com.wunnakyaw.basicstateincompose.models.WellnessTask
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wunnakyaw.basicstateincompose.screens.components.WellnessTaskItem

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = WellnessViewModel(),
) {
    WellnessTasksList(
        list = viewModel.tasks,
        onCloseTask = { viewModel.remove(it) },
        modifier = modifier
    )
}

@Composable
fun WellnessTasksList(
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { task -> task.id }
        ) { task ->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
        }
    }
}