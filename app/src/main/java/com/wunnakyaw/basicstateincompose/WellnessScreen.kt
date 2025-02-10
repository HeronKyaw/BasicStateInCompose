package com.wunnakyaw.basicstateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wunnakyaw.basicstateincompose.screens.water_counter.WaterCounter
import com.wunnakyaw.basicstateincompose.screens.wellness.WellnessTasksList
import com.wunnakyaw.basicstateincompose.ui.theme.BasicStateInComposeTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        WaterCounter()
        WellnessTasksList()
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    BasicStateInComposeTheme {
        WellnessScreen()
    }
}