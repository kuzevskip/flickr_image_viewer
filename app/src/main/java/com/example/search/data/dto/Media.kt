package com.example.search.data.dto

import com.squareup.moshi.Json

data class Media(
    @field:Json(name = "m")
    var imageUrl : String?
)
