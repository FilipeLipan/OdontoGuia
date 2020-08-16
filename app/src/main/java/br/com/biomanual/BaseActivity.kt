package br.com.biomanual

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

abstract class BaseActivity: AppCompatActivity() {

    abstract val activityLayout: Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityLayout)
    }

    protected fun setupToolbar(toolbar: Toolbar, homeAsUpEnabled: Boolean){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(homeAsUpEnabled)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }





}