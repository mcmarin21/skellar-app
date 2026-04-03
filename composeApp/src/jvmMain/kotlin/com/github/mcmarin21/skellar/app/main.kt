package com.github.mcmarin21.skellar.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Skellar App",
        state = rememberWindowState(placement = WindowPlacement.Maximized)
    ) {
        App()
    }
}