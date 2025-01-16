package com.example.search.data.dto

import com.squareup.moshi.Json

data class ImageItem(
    var title: String?,
    var link: String?,
    var media: Media,
    @field:Json(name = "date_taken")
    var dateTaken: String?,
    var description: String?,
    var published: String?,
    var author: String?,
    @field:Json(name = "author_id")
    var authorId: String?,
    var tags: String?
)
