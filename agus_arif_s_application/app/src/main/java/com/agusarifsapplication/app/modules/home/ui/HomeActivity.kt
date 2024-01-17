package com.agusarifsapplication.app.modules.home.ui

import android.net.Uri
import androidx.activity.viewModels
import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.base.BaseActivity
import com.agusarifsapplication.app.databinding.ActivityHomeBinding
import com.agusarifsapplication.app.modules.home.`data`.model.ImageSliderSlider8bc79ecdd9e8ddeightModel
import com.agusarifsapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.agusarifsapplication.app/drawable/img_8bc79ecdd9e8dd8")


  private val imageSliderSlider8bc79ecdd9e8ddeightItems:
      ArrayList<ImageSliderSlider8bc79ecdd9e8ddeightModel> =
      arrayListOf(ImageSliderSlider8bc79ecdd9e8ddeightModel(image8bc79ecdd9e8ddEight =
  imageUri.toString()),ImageSliderSlider8bc79ecdd9e8ddeightModel(image8bc79ecdd9e8ddEight
  = imageUri.toString()))


  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slider8bc79ecdd9e8ddeightAdapter =
    Slider8bc79ecdd9e8ddeightAdapter(imageSliderSlider8bc79ecdd9e8ddeightItems,true)
    binding.imageSliderSlider8bc79ecdd9e8ddeight.adapter = slider8bc79ecdd9e8ddeightAdapter
    binding.imageSliderSlider8bc79ecdd9e8ddeight.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorSettingsOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettingsOne.updateIndicatorCounts(binding.imageSliderSlider8bc79ecdd9e8ddeight.indicatorCount)
    binding.homeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlider8bc79ecdd9e8ddeight.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlider8bc79ecdd9e8ddeight.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"

  }
}
