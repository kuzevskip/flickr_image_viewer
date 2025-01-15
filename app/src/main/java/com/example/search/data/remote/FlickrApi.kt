package com.example.search.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FlickrApi {

    @GET("photos_public.gne?")
    suspend fun search(
        @Query("format") format: String = "json",
        @Query("nojsoncallback") nojsoncallback: String = "1",
        @Query("tags") query: String,
    )

    companion object {
        const val BASE_URL = "https://api.flickr.com/services/feeds/"
    }
}