package com.example.search.data.repository

import com.example.search.data.remote.FlickrApi
import com.example.search.domain.repository.SearchRepository

class SearchRepositoryImpl(
    val api: FlickrApi
) : SearchRepository {
    override suspend fun search(query: String) {
        api.search(query = query)
    }
}