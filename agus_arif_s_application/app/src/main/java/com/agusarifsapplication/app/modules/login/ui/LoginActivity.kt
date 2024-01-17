package com.agusarifsapplication.app.modules.login.ui

import android.view.View
import androidx.activity.viewModels
import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.base.BaseActivity
import com.agusarifsapplication.app.databinding.ActivityLoginBinding
import com.agusarifsapplication.app.modules.login.`data`.model.LoginRowModel
import com.agusarifsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val loginAdapter = LoginAdapter(viewModel.loginList.value?:mutableListOf())
    binding.recyclerLogin.adapter = loginAdapter
    loginAdapter.setOnItemClickListener(
    object : LoginAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LoginRowModel) {
        onClickRecyclerLogin(view, position, item)
      }
    }
    )
    viewModel.loginList.observe(this) {
      loginAdapter.updateData(it)
    }
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLogin(
    view: View,
    position: Int,
    item: LoginRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"

  }

}
