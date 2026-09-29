package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ASmallButton(
    text: String,
    action: () -> Unit,
    modifier: Modifier
) {
    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = modifier
            .height(67.dp)
            .width(180.dp)
            .padding(15.dp)
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(12.dp))
            .background(colorResource(R.color.purple_200), shape = RoundedCornerShape(12.dp))
            .clickable(
                interactionSource = interactionSource,
                indication = ripple()
            ) {
                action
            },
        contentAlignment = Alignment.Center
    ) {
        Text(text, color = Color.White)
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    ASmallButton(text = "Privet", action = {print("")}, modifier = Modifier)
}
