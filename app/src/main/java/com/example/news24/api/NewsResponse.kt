package com.example.news24.api

import com.example.news24.presentation.list.News
data class NewsResponse{

        val count: Int,
        val next: String,
        val results: List<News>

}