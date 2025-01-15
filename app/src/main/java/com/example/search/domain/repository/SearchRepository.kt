package com.example.search.domain.repository

interface SearchRepository {
    suspend fun search(query: String = "porcupine")
}