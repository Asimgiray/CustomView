package com.example.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.CompoundButton
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import com.example.customview.databinding.CustomViewBinding

class CustomView : CardView {

    lateinit var binding: CustomViewBinding

    constructor(context: Context) : super(context) { init() }

    constructor(context: Context, attributeSet: AttributeSet) : super(context , attributeSet) { init() }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(context , attributeSet , defStyleAttr) { init() }

    private fun init() {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_view,
            this,
            true)
    }

    fun bindData(customData: CustomData, onCheckedChangeListener: CompoundButton.OnCheckedChangeListener) {
        binding.txtTitle.text = customData.title
        binding.txtDescription.text = customData.desc
        binding.img.setImageResource(customData.resId)
        binding.chbox.setOnCheckedChangeListener(onCheckedChangeListener)
    }


}