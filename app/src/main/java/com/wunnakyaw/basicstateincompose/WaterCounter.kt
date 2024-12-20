package com.wunnakyaw.basicstateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wunnakyaw.basicstateincompose.ui.theme.BasicStateInComposeTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.padding(16.dp)
    ) {
        var count by remember { mutableIntStateOf(0) }
        Text(
            text = "You've had $count glasses.",
        )
        Button(
            onClick = { count++ },
            modifier = modifier.padding(8.dp)
        ) {
            Text("Add One")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicStateInComposeTheme {
        WaterCounter()
    }
}