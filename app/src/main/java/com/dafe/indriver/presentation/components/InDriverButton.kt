package com.dafe.indriver.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InDriverButton(
    modifier: Modifier,
    text: String,
    color: Color = Color.White,
    height: Dp = 55.dp,
    width: Dp = 200.dp,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .width(width)
            .height(height),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.Black
        ),
        onClick = onClick
    ) {
        Text(text, fontWeight = FontWeight.Bold, fontSize = 20.sp)
    }

}