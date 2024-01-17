package com.agusarifsapplication.app.modules.halamanbarcode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agusarifsapplication.app.modules.halamanbarcode.`data`.model.HalamanBarcodeModel
import org.koin.core.KoinComponent

class HalamanBarcodeVM : ViewModel(), KoinComponent {
  val halamanBarcodeModel: MutableLiveData<HalamanBarcodeModel> =
      MutableLiveData(HalamanBarcodeModel())

  var navArguments: Bundle? = null
}
