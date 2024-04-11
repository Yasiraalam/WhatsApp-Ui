package com.yasir.whatsapptalk.domain

import com.yasir.whatsapptalk.R

data class ChatsListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    val userImage: Int= R.drawable.ic_mood,
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timestamp: String,
    val unreadCount:Int?=null
)

enum class MessageType {
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}

enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

