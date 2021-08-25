package com.nepplus.pizzaorderapp_20210825.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.pizzaorderapp_20210825.R
import com.nepplus.pizzaorderapp_20210825.data.PizzaStore

class PizzaStoreAdapter(val mContext: Context, resId: Int, val mList: List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        //val name = row.findViewById<TextView>(R.id.)

        return row
    }

}