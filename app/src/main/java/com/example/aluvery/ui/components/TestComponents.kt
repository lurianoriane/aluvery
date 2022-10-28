package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview(
    name = "TextPreview",
    showBackground = true
)
@Composable
fun MyFirstComposablePreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 1")
    }
}

@Preview(
    name = "TextPreview",
    showBackground = true
)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 2")
        Text(text = "Texto 3")
    }
}

@Preview(
    name = "column and row",
    showBackground = true
)
@Composable
fun ColumnAndRow() {
    Row(
        Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
    ) {
        Text(text = "Texto 2")
        Text(text = "Texto 3")
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(Color.Cyan)
        ) {
            Text(text = "Texto 4")
            Text(text = "Texto 5")
        }
    }
}
