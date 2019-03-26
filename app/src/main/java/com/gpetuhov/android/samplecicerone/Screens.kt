package com.gpetuhov.android.samplecicerone

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

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