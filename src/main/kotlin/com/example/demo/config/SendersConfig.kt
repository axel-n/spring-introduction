package com.example.demo.config

import com.example.demo.service.sender.EmailSender
import com.example.demo.service.sender.TelegramSender
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SendersConfig {

    @Bean
    fun emailSender(): EmailSender {
        return EmailSender(false, "something")
    }

    @Bean
    fun telegramSender(): TelegramSender {
        return TelegramSender()
    }
}
