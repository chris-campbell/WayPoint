package tech.hoppr

import android.app.Application

class App : Application() {
    companion object {
        var addressKey: String? = null
        var mainLat: Double = 0.0
        var mainLong: Double = 0.0
    }
}