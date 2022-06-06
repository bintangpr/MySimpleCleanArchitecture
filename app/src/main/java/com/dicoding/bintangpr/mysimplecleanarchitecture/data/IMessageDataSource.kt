package com.dicoding.bintangpr.mysimplecleanarchitecture.data

import com.dicoding.bintangpr.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}