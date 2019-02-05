package com.mtlepberghenov.wordmakercounter.screens.main

import androidx.annotation.LayoutRes

interface MainView {

    @LayoutRes fun getLayout() : Int

    fun initView()
}