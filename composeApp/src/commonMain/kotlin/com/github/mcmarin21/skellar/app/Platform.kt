package com.github.mcmarin21.skellar.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform