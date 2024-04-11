package com.yasir.whatsapptalk.data

import com.yasir.whatsapptalk.domain.ChatsListDataObject
import com.yasir.whatsapptalk.domain.Message
import com.yasir.whatsapptalk.domain.MessageDeliveryStatus
import com.yasir.whatsapptalk.domain.MessageType

val chatsList = listOf<ChatsListDataObject>(
    ChatsListDataObject(
        chatId = 1,
        message = Message(
            content = "Good Morining",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 12
        ),
        userName = "Yasir Alam"
    ),
    ChatsListDataObject(
        chatId = 2,
        message = Message(
            content = "hii! kaya haal hai",
            timestamp = "02/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Huzaif iust"
    ),
    ChatsListDataObject(
        chatId = 3,
        message = Message(
            content = "hello kahan hoo?",
            timestamp = "01/01/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Bhat Aasim"
    ),
    ChatsListDataObject(
        chatId = 4,
        message = Message(
            content = "assalamualikum",
            timestamp = "05/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING,
            unreadCount = 12
        ),
        userName = "Faisal iust"
    ),
    ChatsListDataObject(
        chatId = 5,
        message = Message(
            content = "chalo thek hai.",
            timestamp = "12/02/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Rehan iust"
    ),
    ChatsListDataObject(
        chatId = 6,
        message = Message(
            content = "Hi!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Alice Johnson"
    ),

    ChatsListDataObject(
        chatId = 7,
        message = Message(
            content = "How are you?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Michael Smith"
    ),

    ChatsListDataObject(
        chatId = 8,
        message = Message(
            content = "Good evening!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = 5
        ),
        userName = "Sophia Martinez"
    ),

    ChatsListDataObject(
        chatId = 9,
        message = Message(
            content = "What's up?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.ERROR
        ),
        userName = "Ethan Brown"
    ),

    ChatsListDataObject(
        chatId = 10,
        message = Message(
            content = "Hello!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Olivia Wilson"
    ),

    ChatsListDataObject(
        chatId = 11,
        message = Message(
            content = "Nice to meet you!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Liam Taylor"
    ),

    ChatsListDataObject(
        chatId = 12,
        message = Message(
            content = "Hey!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.PENDING
        ),
        userName = "Emma Garcia"
    ),

    ChatsListDataObject(
        chatId = 13,
        message = Message(
            content = "How's it going?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Noah Rodriguez"
    ),

    ChatsListDataObject(
        chatId = 14,
        message = Message(
            content = "Good day!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Ava Martinez"
    ),

    ChatsListDataObject(
        chatId = 15,
        message = Message(
            content = "Hi there!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "William Brown"
    ),

    ChatsListDataObject(
        chatId = 16,
        message = Message(
            content = "Hello, how are you?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 9
        ),
        userName = "Isabella Johnson"
    ),

    ChatsListDataObject(
        chatId = 17,
        message = Message(
            content = "Hey, what's up?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 8
        ),
        userName = "James Wilson"
    ),

    ChatsListDataObject(
        chatId = 18,
        message = Message(
            content = "Good afternoon!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Sophia Smith"
    ),

    ChatsListDataObject(
        chatId = 19,
        message = Message(
            content = "Hi, how have you been?",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ
        ),
        userName = "Logan Martinez"
    ),

    ChatsListDataObject(
        chatId = 20,
        message = Message(
            content = "Hey, good to see you!",
            timestamp = "09/04/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Amelia Taylor"
    )

)