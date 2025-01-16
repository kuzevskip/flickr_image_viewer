package com.example.search.data.mapper

import com.example.search.data.dto.ImageItem
import com.example.search.domain.model.Image

fun ImageItem.toImage() : Image {
    return Image(
        name = title,
        imageUrl = media.imageUrl,
        author = author
    )
}