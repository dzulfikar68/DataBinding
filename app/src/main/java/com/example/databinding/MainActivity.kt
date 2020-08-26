package com.example.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CustomInterface {
    val changeTheWorld: Int by lazy {
        resources.getColor(R.color.colorAccent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //init activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel: MainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = "KOKO"
        binding.lifecycleOwner = this
        binding.vm = viewModel
        viewModel.name.value = "CICI"
        val xxx = zzz as CustomTextView
        xxx.eventListen = this
    }

    override fun onClick(str: String, view: View?) {
        TODO("Not yet implemented")
    }

//    fun onViewStateRestored(@Nullable savedInstanceState: Bundle) {
//        super.onViewStateRestored(savedInstanceState)
//        // Restore UI state from the savedInstanceState.
//        // This bundle has also been passed to onCreate.
//        val myBoolean = savedInstanceState.getBoolean("MyBoolean")
//        val myDouble = savedInstanceState.getDouble("myDouble")
//        val myInt = savedInstanceState.getInt("MyInt")
//        val myString = savedInstanceState.getString("MyString")
//    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        // Restore UI state from the savedInstanceState.
//        // This bundle has also been passed to onCreate.
//        val myBoolean = savedInstanceState.getBoolean("MyBoolean")
//        val myDouble = savedInstanceState.getDouble("myDouble")
//        val myInt = savedInstanceState.getInt("MyInt")
//        val myString = savedInstanceState.getString("MyString")
//    }

//    override fun zuzu(view: View) {
//        zzz?.setXXX("MOMO")
//    }
}