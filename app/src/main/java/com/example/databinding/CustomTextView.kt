package com.example.databinding

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.CustomTextViewBinding

//@InverseBindingMethods(value = {
//    @InverseBindingMethod(type = CustomTextView.class, attribute = "bind:filterStringValue", method = "getFilterValue", event = "android:filterStringValuetAttrChanged")
//})
class CustomTextView(context: Context, attributeSet: AttributeSet) :
    LinearLayout(context, attributeSet) {
    var mBinding: CustomTextViewBinding
    var eventListen: CustomInterface? = null

    init {
        mBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_text_view,
            this,
            true
        )
        mBinding.xxx.setOnClickListener {
            eventListen?.onClick("ZIGOT!!!", it)
        }
//        inflate(context, R.layout.custom_text_view, this)
//        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        mBinding = CustomTextViewBinding.inflate(inflater)
//
//        val textView: TextView = findViewById(R.id.xxx)
//        val attributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomTextView)
//        val bool = attributes.getBoolean(R.styleable.CustomTextView_showText, false)
//        if (bool == true) {
//            textView.text = "CEXXXXXXXXXXXXXXXXXX"
//        } else {
//            textView.text = "QQQQQQQQQQQQQQQQQQQQQQQQ"
//        }
//        textView.text = attributes.getString(R.styleable.CustomTextView_setTextX) ?: "WERTY"
//        textView.text = mBinding.bind
//        mBinding.bind = attributes.getString(R.styleable.CustomTextView_setTextX) ?: "WERTY"
//        attributes.recycle()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        eventListen = null
    }

    companion object {
        @BindingAdapter("app:filterTitle")
        @JvmStatic
        fun filterTitle(view: CustomTextView, filter: String) {
            view.mBinding.bind = filter
            view.mBinding.xxx.setOnClickListener { }
        }
    }

    fun setTextnya(str: String) {
//        xxx?.text = str
        mBinding.bind = str
    }
}

interface CustomInterface {
    fun onClick(str: String, view: View?)
}