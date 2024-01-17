package com.agusarifsapplication.app.modules.halamanbarcode.ui

import androidx.activity.viewModels
import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.base.BaseActivity
import com.agusarifsapplication.app.databinding.ActivityHalamanBarcodeBinding
import com.agusarifsapplication.app.modules.halamanbarcode.`data`.viewmodel.HalamanBarcodeVM
import kotlin.String
import kotlin.Unit

class HalamanBarcodeActivity :
    BaseActivity<ActivityHalamanBarcodeBinding>(R.layout.activity_halaman_barcode) {
  private val viewModel: HalamanBarcodeVM by viewModels<HalamanBarcodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanBarcodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HALAMAN_BARCODE_ACTIVITY"

  }
}
