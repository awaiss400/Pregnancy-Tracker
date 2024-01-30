package com.stone.users.awais.personal.pregnancytrackercompose.presentation.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.time.Duration.Companion.seconds

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    val moveToNextScreen = mutableStateOf(false)
    fun startTimer(seconds: Int) {
        viewModelScope.launch {
            delay(seconds.seconds)
            moveToNextScreen.value = true
        }
    }
}