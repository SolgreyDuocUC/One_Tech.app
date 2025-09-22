package com.example.onetech_grupo2.ui.theme.utils

import android.os.Build
import android.window.BackEvent
import androidx.annotation.RequiresApi
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.Posture
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalAccessibilityManager

class WindowSizeUtils {

    @OptIn(ExperimentalMaterial3AdaptiveApi::class)

    enum class WindowStateUtils {
        LIST_ONLY,
        LIST_AND_DETAIL
    }

    @Composable
    @OptIn(ExperimentalMaterial3AdaptiveApi::class)
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    fun obtenerWindowSizeClass(): Posture {
        return calculatePosture(LocalAccessibilityManager.current as BackEvent)
    }

    @OptIn(ExperimentalMaterial3AdaptiveApi::class)
    private fun calculatePosture(foldingFeatures: BackEvent): Posture {
        TODO("Not yet implemented")
    }

}