package com.yasir.whatsapptalk.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasir.whatsapptalk.R

@Composable
fun AppbarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = stringResource(id = R.string.whatsapp_title),
            style = TextStyle(
                fontSize = 21.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        IconComponent(drawableId = R.drawable.ic_camera)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(drawableId = R.drawable.ic_search)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(drawableId = R.drawable.ic_more)
    }

}

@Composable
fun IconComponent(drawableId:Int) {
    Icon(
        painter = painterResource(id = drawableId),
        contentDescription ="",
        tint = MaterialTheme.colorScheme.tertiary
    )
    
}

@Preview
@Composable
fun AppbarComponentPreview() {
    AppbarComponent()
}