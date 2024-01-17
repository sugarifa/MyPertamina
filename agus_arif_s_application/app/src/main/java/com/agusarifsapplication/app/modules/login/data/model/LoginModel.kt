package com.agusarifsapplication.app.modules.login.`data`.model

import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatangOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelumpunyaaku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)

)
