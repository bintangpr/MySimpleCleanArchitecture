package com.dicoding.bintangpr.mysimplecleanarchitecture.data

import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity ("Hello $name! Welcome to Clean Architecture")
}