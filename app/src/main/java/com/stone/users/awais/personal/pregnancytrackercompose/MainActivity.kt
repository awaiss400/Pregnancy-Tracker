package com.stone.users.awais.personal.pregnancytrackercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.stone.users.awais.personal.pregnancytrackercompose.navigation.AppNavigation
import com.stone.users.awais.personal.pregnancytrackercompose.ui.theme.PregnancyTrackerComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PregnancyTrackerComposeTheme {
//                    val systemUiController = rememberSystemUiController()
//                    SideEffect {
//                        systemUiController.setStatusBarColor(
//                            color = Color.Transparent,
//                            darkIcons = false
//                        )
//                        systemUiController.setNavigationBarColor(
//                            color = Color.Transparent,
//                            darkIcons = false
//                        )
//                    }
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        AppNavigation()
                    }
            }
        }
    }
}

