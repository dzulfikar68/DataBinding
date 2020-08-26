package com.example.databinding

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter

abstract class ExActivity : AppCompatActivity() {
    companion object {
        @BindingAdapter("app:hideIfZero")
        @JvmStatic
        fun hideIfZero(view: TextView, text: String) {
            if (text == "XOXO") {
                view.text = "CUCU"
                view.setTextColor(view.resources.getColor(R.color.colorAccent))
                Toast.makeText(view.context, "YOYO", Toast.LENGTH_LONG).show()
            }
        }
    }

    abstract fun zuzu(view: View)
}