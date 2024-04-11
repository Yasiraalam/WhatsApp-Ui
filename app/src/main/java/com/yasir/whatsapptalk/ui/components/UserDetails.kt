package com.yasir.whatsapptalk.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasir.whatsapptalk.domain.ChatsListDataObject
import com.yasir.whatsapptalk.domain.Message
import com.yasir.whatsapptalk.domain.MessageDeliveryStatus
import com.yasir.whatsapptalk.domain.MessageType
import com.yasir.whatsapptalk.ui.theme.HighLightGreen

@Composable
fun UserDetails(chatData:ChatsListDataObject) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ){
        MessageHeader(chatData)
        MessageSubSection(chatData)

    }
}

@Composable
fun MessageSubSection(chatData: ChatsListDataObject) {
    Row (
        verticalAlignment = Alignment.CenterVertically,

        ){
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.message.content,
            fontSize =14.sp,
            color = Color.Gray,
            fontWeight = FontWeight.SemiBold
        )
        chatData.message.unreadCount?.also {
            CircularCount(
                unreadCount = it.toString(),
                backgroundColor = HighLightGreen,
                textColor = Color.White
            )
        }

    }
}

@Composable
fun MessageHeader(chatData: ChatsListDataObject) {
     Row (
         verticalAlignment = Alignment.CenterVertically,

     ){
         TextComponent(
             value = chatData.userName,
             fontSize =18.sp,
             color = Color.Black,
             modifier = Modifier.weight(1f)
         )
         TextComponent(
             value = chatData.message.timestamp,
             fontSize =14.sp,
             color = if((chatData.message.unreadCount?:0) > 0) HighLightGreen else  Color.Gray,
             modifier = null,
             fontWeight = null
         )
     }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview() {
    UserDetails(
        chatData = ChatsListDataObject(
            chatId = 1,
            message = Message(
                content = "Good Morining",
                timestamp = "09/04/2024",
                type = MessageType.TEXT,
                deliveryStatus = MessageDeliveryStatus.DELIVERED
            ),
            userName = "Yasir Alam"
        )
    )
}