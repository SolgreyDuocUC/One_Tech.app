package com.example.onetech_grupo2.ui.theme.utils

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo

class Enum {

    enum class WindowStateUtils {
        LIST_ONLY, // Para pantallas pequeñas
        LIST_AND_DETAIL // Para pantallas grandes
    }

}