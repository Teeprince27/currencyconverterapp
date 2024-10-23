package org.currencyconverterapp.com

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform