package com.nepplus.pizzaorderapp_20210825

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20210825.data.PizzaStore
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : BaseActivity() {

    lateinit var mStoreData: PizzaStore

    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        dialBtn.setOnClickListener {

            val uri = Uri.parse("tel:${mStoreData.phoneNum}")
            val intent = Intent(Intent.ACTION_CALL, uri)
            startActivity(intent)

        }

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext)
            .load(mStoreData.imgURL)
            .into(detailLogoImg)

        storeNameTxt.text = mStoreData.name
        phoneNumTxt.text = mStoreData.phoneNum

    }
}