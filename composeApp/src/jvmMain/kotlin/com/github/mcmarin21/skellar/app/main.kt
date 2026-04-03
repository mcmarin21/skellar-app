package com.github.mcmarin21.skellar.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "skellar-app",
    ) {
        App()
    }
}