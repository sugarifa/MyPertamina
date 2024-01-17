package com.agusarifsapplication.app.modules.menupemesanan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agusarifsapplication.app.modules.menupemesanan.`data`.model.MenuPemesananModel
import org.koin.core.KoinComponent

class MenuPemesananVM : ViewModel(), KoinComponent {
  val menuPemesananModel: MutableLiveData<MenuPemesananModel> =
      MutableLiveData(MenuPemesananModel())

  var navArguments: Bundle? = null
}
