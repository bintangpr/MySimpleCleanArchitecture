package com.dicoding.bintangpr.mysimplecleanarchitecture.di

import com.dicoding.bintangpr.mysimplecleanarchitecture.data.IMessageDataSource
import com.dicoding.bintangpr.mysimplecleanarchitecture.data.MessageDataSource
import com.dicoding.bintangpr.mysimplecleanarchitecture.data.MessageRepository
import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.IMessageRepository
import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageEntity
import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageInteractor
import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }

}