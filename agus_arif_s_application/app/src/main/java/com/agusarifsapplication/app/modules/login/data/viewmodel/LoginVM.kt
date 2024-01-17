package com.agusarifsapplication.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agusarifsapplication.app.modules.login.`data`.model.LoginModel
import com.agusarifsapplication.app.modules.login.`data`.model.LoginRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())

  var navArguments: Bundle? = null

  val loginList: MutableLiveData<MutableList<LoginRowModel>> = MutableLiveData(mutableListOf())

}
