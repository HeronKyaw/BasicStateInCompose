package com.wunnakyaw.basicstateincompose.screens.water_counter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wunnakyaw.basicstateincompose.ui.theme.BasicStateInComposeTheme

@Composable
fun WaterCounterStateful(
    modifier: Modifier = Modifier,
    viewModel: WaterCounterViewModel = WaterCounterViewModel(),
) {
    WaterCounter(
        modifier = modifier,
        count = viewModel.count,
        increment = { viewModel.increment() }
    )
}

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier,
    count: MutableIntState,
    increment: () -> Unit,
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count.intValue > 0) {
            Text("You've had ${count.intValue} glasses.")
        }
        Button(
            onClick =  { increment() },
            Modifier.padding(top = 8.dp),
            enabled = count.intValue < 10
        ) {
            Text("Add one")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicStateInComposeTheme {
        WaterCounterStateful()
    }
}