package com.example.demo.service

import com.example.demo.model.NotificationType
import com.example.demo.service.sender.Sender

class NotificationService(
    private val senders: HashSet<Sender>
) {

    fun send(clientId: Long, text: String, notificationType: NotificationType): Boolean {
        val sender: Sender = senders.firstOrNull { it.getNotificationType() == notificationType }
            ?: TODO("Not implemented")

        return sender.send(clientId, text)
    }
}
