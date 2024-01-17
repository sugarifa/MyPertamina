package com.agusarifsapplication.app.modules.login.`data`.model

import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_62)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt82349389102: String? = MyApp.getInstance().resources.getString(R.string.lbl_823_4938_9102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoTelepon: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_telepon)
  ,
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)

)
