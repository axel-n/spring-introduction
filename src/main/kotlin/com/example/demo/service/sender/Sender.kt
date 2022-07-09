package com.example.demo.service.sender

import com.example.demo.model.NotificationType

interface Sender {

   fun send(client: Long, text: String): Boolean
   fun getNotificationType(): NotificationType
}
