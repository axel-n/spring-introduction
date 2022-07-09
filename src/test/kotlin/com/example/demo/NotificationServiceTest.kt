package com.example.demo

import com.example.demo.model.NotificationType
import com.example.demo.service.NotificationService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class NotificationServiceTest {

    @Autowired
    private lateinit var notificationService: NotificationService

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
