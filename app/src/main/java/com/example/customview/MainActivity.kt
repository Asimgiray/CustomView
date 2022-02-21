package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {

    lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityBinding = DataBindingUtil.setContentView(this , R.layout.activity_main)

        val data = CustomData(
            "Oslo Norway",
            "Oslo is the capital and most populous city of Norway. It constitutes both a county and a municipality.",
                R.drawable.norway)



        mainActivityBinding.customView.bindData(data) { compoundButton, isChecked ->
            if (isChecked) {
                mainActivityBinding.customView.binding.chbox.text = getString(R.string.added_list)
            } else {
                mainActivityBinding.customView.binding.chbox.text = getString(R.string.add_to_list)
            }
        }


    }
}