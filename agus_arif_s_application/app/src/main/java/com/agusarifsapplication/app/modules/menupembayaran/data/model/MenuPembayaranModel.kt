package com.agusarifsapplication.app.modules.menupembayaran.`data`.model

import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuPembayaranModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPembayaran: String? = MyApp.getInstance().resources.getString(R.string.lbl_pembayaran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGanti: String? = MyApp.getInstance().resources.getString(R.string.lbl_ganti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNomorAkunVirt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nomor_akun_virt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt382717849023: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3827_1784_9023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaakunDIY: String? = MyApp.getInstance().resources.getString(R.string.msg_nama_akun_diy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIkutiIntruksi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ikuti_intruksi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtATMBCA: String? = MyApp.getInstance().resources.getString(R.string.lbl_atm_bca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKLIKBCA: String? = MyApp.getInstance().resources.getString(R.string.lbl_klik_bca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMBCABCAMOBI: String? = MyApp.getInstance().resources.getString(R.string.msg_m_bca_bca_mobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMBCASTKSI: String? = MyApp.getInstance().resources.getString(R.string.msg_m_bca_stk_si)

)
