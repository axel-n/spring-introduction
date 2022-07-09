package com.example.demo.service.sender

import com.example.demo.model.NotificationType
import org.springframework.stereotype.Service

@Service
class TelegramSender : Sender {

    override fun send(client: Long, text: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getNotificationType(): NotificationType = NotificationType.TELEGRAM
}
