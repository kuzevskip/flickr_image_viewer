package com.example.search.presentation

sealed class SearchEvent {
    data class OnQueryChange(val query: String) : SearchEvent()
    data object OnSearch : SearchEvent()
    data class OnSearchFocusChange(val isFocused: Boolean): SearchEvent()
}