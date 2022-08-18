package com.xtremedevx.bottomnavbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.xtremedevx.bottomnavbar.screen.MainScreen
import com.xtremedevx.bottomnavbar.ui.theme.BottomNavBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarTheme {
               MainScreen()
            }
        }
    }
}
