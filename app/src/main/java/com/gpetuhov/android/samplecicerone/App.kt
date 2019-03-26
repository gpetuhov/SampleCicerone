package com.gpetuhov.android.samplecicerone

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.NavigatorHolder

// In this example the application class provides NavigationHolder and Router.
// In production it is better to use Dagger for this.

class App : Application() {

    companion object {
        lateinit var application: App
    }

    private lateinit var cicerone: Cicerone<Router>

    override fun onCreate() {
        super.onCreate()
        application = this

        initCicerone()
    }

    private fun initCicerone() {
        cicerone = Cicerone.create()
    }

    fun getNavigatorHolder(): NavigatorHolder {
        return cicerone.navigatorHolder
    }

    fun getRouter(): Router {
        return cicerone.router
    }
}