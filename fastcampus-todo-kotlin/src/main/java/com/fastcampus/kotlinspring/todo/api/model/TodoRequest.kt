package com.fastcampus.kotlinspring.todo.api.model

import com.fasterxml.jackson.databind.BeanDescription

data class TodoRequest (
    val title: String,
    val description: String,
    val done: Boolean = false
) {



}