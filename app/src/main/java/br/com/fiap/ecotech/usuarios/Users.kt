package br.com.fiap.ecotech.usuarios

import androidx.compose.runtime.MutableState

data class Users (
    val username: MutableState<String>,
    val password: MutableState<String>,
)