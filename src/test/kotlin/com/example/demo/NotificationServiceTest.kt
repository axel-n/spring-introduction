package com.example.demo

import com.example.demo.model.NotificationType
import com.example.demo.service.NotificationService
import com.example.demo.service.sender.EmailSender
import com.example.demo.service.sender.TelegramSender
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NotificationServiceTest {

    private val emailSender = EmailSender(false, "")
    private val telegramSender = TelegramSender()
    private val notificationService: NotificationService =
        NotificationService(HashSet(setOf(emailSender, telegramSender)))

    @Test
    fun emailSendTest() {
        assertThrows<NotImplementedError> {
            notificationService.send(1, "abc", NotificationType.EMAIL)
        }
    }

    @Test
    fun telegramSendTest() {
        assertThrows<NotImplementedError> {
            notificationService.send(1, "abc", NotificationType.TELEGRAM)
        }
    }
}
