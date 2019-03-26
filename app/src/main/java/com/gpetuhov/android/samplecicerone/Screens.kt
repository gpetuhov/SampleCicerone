package com.gpetuhov.android.samplecicerone

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

// Here the app's screens are defined.
// Screens instantiate fragments
// (screens tell Navigator which fragment to create for each screen).

class Screens {

    class First : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return FirstFragment()
        }
    }

    class Second : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return SecondFragment()
        }
    }
}