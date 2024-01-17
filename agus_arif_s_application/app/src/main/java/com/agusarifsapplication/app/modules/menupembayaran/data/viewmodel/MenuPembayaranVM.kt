package com.agusarifsapplication.app.modules.menupembayaran.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agusarifsapplication.app.modules.menupembayaran.`data`.model.MenuPembayaranModel
import org.koin.core.KoinComponent

class MenuPembayaranVM : ViewModel(), KoinComponent {
  val menuPembayaranModel: MutableLiveData<MenuPembayaranModel> =
      MutableLiveData(MenuPembayaranModel())

  var navArguments: Bundle? = null
}
