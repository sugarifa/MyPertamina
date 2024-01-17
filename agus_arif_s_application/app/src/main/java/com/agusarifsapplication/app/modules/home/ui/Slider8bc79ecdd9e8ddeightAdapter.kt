package com.agusarifsapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.agusarifsapplication.app.databinding.SlideritemHome1Binding
import com.agusarifsapplication.app.modules.home.`data`.model.ImageSliderSlider8bc79ecdd9e8ddeightModel
import com.asksira.loopingviewpager.LoopingPagerAdapter
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class Slider8bc79ecdd9e8ddeightAdapter(
  val dataList: ArrayList<ImageSliderSlider8bc79ecdd9e8ddeightModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlider8bc79ecdd9e8ddeightModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHome1Binding) {
      binding.imageSliderSlider8bc79ecdd9e8ddeightModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
