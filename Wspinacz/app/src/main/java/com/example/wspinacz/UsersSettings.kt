package com.example.wspinacz

class UsersSettings(timerTime: Long, phoneNumber: String, textMessage: String) {
    var timerTime: Long? = timerTime  // countdown time
    var phone_number: String? = phoneNumber  // number to which the phone will send the given message
    var text_message: String? = textMessage  // text message send for given number
}