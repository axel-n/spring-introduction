package com.example.demo.service.sender

import com.example.demo.model.NotificationType
import org.springframework.stereotype.Service

@Service
class EmailSender(
   private val isNeedRetry: Boolean,
   private val mailConfig: String // for example
) : Sender {

    override fun send(client: Long, text: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getNotificationType(): NotificationType = NotificationType.EMAIL
}
