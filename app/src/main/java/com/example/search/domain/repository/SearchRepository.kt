package com.example.search.domain.repository

import com.example.search.domain.model.Image

interface SearchRepository {
    suspend fun search(query: String = "porcupine") : List<Image>
}