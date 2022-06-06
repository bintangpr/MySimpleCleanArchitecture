package com.dicoding.bintangpr.mysimplecleanarchitecture.data

import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.IMessageRepository
import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}