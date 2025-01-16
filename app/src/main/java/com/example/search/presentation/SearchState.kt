package com.example.search.presentation

import com.example.search.domain.model.Image


data class SearchState(
    val query: String = "",
    val isHintVisible: Boolean = false,
    val isSearching: Boolean = false,
    val images: List<Image> = emptyList()
)