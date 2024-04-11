package com.yasir.whatsapptalk.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yasir.whatsapptalk.data.chatsList
import com.yasir.whatsapptalk.domain.ChatsListDataObject
import com.yasir.whatsapptalk.ui.components.UserDetails
import com.yasir.whatsapptalk.ui.components.UserImage

@Composable
fun ChatsScreen() {
   LazyColumn(
       modifier = Modifier
           .fillMaxSize()
           .padding(horizontal = 16.dp),
       horizontalAlignment = Alignment.Start
   ){
       item {
           Spacer(modifier = Modifier.height(10.dp))
       }
       items(chatsList){chatdata->
           ChatListItem(chatdata)
           
       }

   }
}

@Composable
fun ChatListItem(chatdata: ChatsListDataObject) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ){
        UserImage(chatdata.userImage)
        UserDetails(chatdata)
    }
    
}
@Preview(showBackground = true)
@Composable
fun ChatsScreenPreview() {
    ChatsScreen()
}