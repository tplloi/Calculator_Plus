package com.roy.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.roy.calculator.navigation.CalculatorApp
import com.roy.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(
            /* window = */ window,
            /* decorFitsSystemWindows = */ false
        )
        setContent {
            val systemUiController = rememberSystemUiController()
            val darkTheme = !isSystemInDarkTheme()

            DisposableEffect(systemUiController, darkTheme) {
                systemUiController.setSystemBarsColor(
                    color = Color.Transparent,
                    darkIcons = darkTheme
                )

                onDispose {}
            }
            CalculatorTheme {
                CalculatorApp()
            }
        }
    }
}
