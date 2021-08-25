package com.nepplus.pizzaorderapp_20210825.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapp_20210825.R
import com.nepplus.pizzaorderapp_20210825.data.PizzaStore
import de.hdodenhof.circleimageview.CircleImageView

class PizzaStoreAdapter(val mContext: Context, resId: Int, val mList: List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val name = row.findViewById<TextView>(R.id.nameTxt)
        val logo = row.findViewById<CircleImageView>(R.id.logoImg)

        name.text = data.name
        Glide.with(mContext)
            .load(data.imgURL)
            .into(logo)

        return row
    }

}