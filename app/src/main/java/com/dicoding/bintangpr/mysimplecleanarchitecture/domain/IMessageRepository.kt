package com.dicoding.bintangpr.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String):MessageEntity
}