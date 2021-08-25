package com.nepplus.pizzaorderapp_20210825

import android.os.Bundle
import android.os.PersistableBundle
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20210825.data.PizzaStore
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_detail)
        setupEvents()
        setValues()

        val data = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext)
            .load(data.imgURL)
            .into(detailLogoImg)

        storeNameTxt.text = data.name
        phoneNumTxt.text = data.phoneNum

    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}