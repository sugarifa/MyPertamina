package com.agusarifsapplication.app.modules.menupemesanan.ui

import androidx.activity.viewModels
import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.base.BaseActivity
import com.agusarifsapplication.app.databinding.ActivityMenuPemesananBinding
import com.agusarifsapplication.app.modules.menupemesanan.`data`.viewmodel.MenuPemesananVM
import kotlin.String
import kotlin.Unit

class MenuPemesananActivity :
    BaseActivity<ActivityMenuPemesananBinding>(R.layout.activity_menu_pemesanan) {
  private val viewModel: MenuPemesananVM by viewModels<MenuPemesananVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuPemesananVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_PEMESANAN_ACTIVITY"

  }
}
