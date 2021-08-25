package com.nepplus.pizzaorderapp_20210825.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nepplus.pizzaorderapp_20210825.EditNicknameActivity
import com.nepplus.pizzaorderapp_20210825.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        nicknameChangeBtn.setOnClickListener {

            val intent = Intent(requireContext(), EditNicknameActivity::class.java)

            startActivityForResult(intent, REQ_NICKNAME)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_NICKNAME && resultCode == Activity.RESULT_OK) {
            nicknameTxt.text = data?.getStringExtra("nickname")
        } else {
            Toast.makeText(requireContext(), "변경 실패", Toast.LENGTH_SHORT).show()
        }

    }

}