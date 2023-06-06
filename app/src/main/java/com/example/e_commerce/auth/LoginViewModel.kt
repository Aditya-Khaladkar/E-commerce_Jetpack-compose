package com.example.e_commerce.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val loginStatus = MutableLiveData<Boolean>()

    fun authUser(email: String, password: String) {
        loginStatus.value = email == "admin" && password == "admin"
    }
}