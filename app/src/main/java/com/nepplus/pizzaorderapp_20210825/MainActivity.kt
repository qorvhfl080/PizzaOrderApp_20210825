package com.nepplus.pizzaorderapp_20210825

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.pizzaorderapp_20210825.adapter.FragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var fragmentAdapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        fragmentAdapter = FragmentAdapter(supportFragmentManager)
        mainViewPager.adapter = fragmentAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }

    override fun setValues() {

    }
}