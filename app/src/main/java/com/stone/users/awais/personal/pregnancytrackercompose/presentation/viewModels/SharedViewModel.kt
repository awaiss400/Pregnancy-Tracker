package com.stone.users.awais.personal.pregnancytrackercompose.presentation.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor( ) : ViewModel() {
    var isServiceRunning = MutableStateFlow(false)
        private set


    }