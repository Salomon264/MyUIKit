package com.example.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp

@Composable
fun ACard(
    title: String,
    description: String,
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .width(350.dp)
            .height(250.dp)
            .background(colorResource(R.color.wheat), shape = RoundedCornerShape(12.dp))
    ) {
        Column {
            Text(title)
            Text(description)
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewCard(){
    ACard(title = "Title", description = "eskjbvajkhrbvkjbilrvhanljv", modifier = Modifier)
}