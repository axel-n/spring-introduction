package com.example.demo


import com.example.demo.service.NotificationService
import com.example.demo.service.sender.EmailSender
import com.example.demo.service.sender.TelegramSender

class DemoApplication

fun main() {
	val emailSender = EmailSender(false, "something")
    val telegramSender = TelegramSender()

    NotificationService(HashSet(setOf(emailSender, telegramSender)))
}
