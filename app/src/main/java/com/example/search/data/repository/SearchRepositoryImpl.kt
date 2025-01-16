package com.example.search.data.repository

import com.example.search.data.mapper.toImage
import com.example.search.data.remote.FlickrApi
import com.example.search.domain.model.Image
import com.example.search.domain.repository.SearchRepository

class SearchRepositoryImpl(
    val api: FlickrApi
) : SearchRepository {
    override suspend fun search(query: String): List<Image> {
        val dto = api.search(query = query)

        return dto.items.map { it.toImage() }
    }
}