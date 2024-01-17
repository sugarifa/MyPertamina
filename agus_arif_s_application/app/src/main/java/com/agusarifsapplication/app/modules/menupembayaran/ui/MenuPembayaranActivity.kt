package com.agusarifsapplication.app.modules.menupembayaran.ui

import androidx.activity.viewModels
import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.base.BaseActivity
import com.agusarifsapplication.app.databinding.ActivityMenuPembayaranBinding
import com.agusarifsapplication.app.modules.menupembayaran.`data`.viewmodel.MenuPembayaranVM
import kotlin.String
import kotlin.Unit

class MenuPembayaranActivity :
    BaseActivity<ActivityMenuPembayaranBinding>(R.layout.activity_menu_pembayaran) {
  private val viewModel: MenuPembayaranVM by viewModels<MenuPembayaranVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuPembayaranVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MENU_PEMBAYARAN_ACTIVITY"

  }
}
