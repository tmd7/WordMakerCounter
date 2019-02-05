package com.mtlepberghenov.wordmakercounter.screens.main

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mtlepberghenov.wordmakercounter.screens.main.impl.DefaultMainPresenter
import com.mtlepberghenov.wordmakercounter.screens.main.impl.DefaultMainView
import com.mtlepberghenov.wordmakercounter.screens.main.impl.DefaultMainWireframe

class MainActivity : AppCompatActivity() {

    private val mainView: MainView = DefaultMainView()
    private val mainWireframe: MainWireframe = DefaultMainWireframe()
    private val mainPresenter: MainPresenter = DefaultMainPresenter(mainView, mainWireframe)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainView.getLayout())
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        mainView.initView()
        mainPresenter.viewInitialized()
    }

}
