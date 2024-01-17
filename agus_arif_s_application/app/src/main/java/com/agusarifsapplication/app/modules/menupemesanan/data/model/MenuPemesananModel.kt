package com.agusarifsapplication.app.modules.menupemesanan.`data`.model

import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuPemesananModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMenuPemesanan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_menu_pemesanan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPertalite: String? = MyApp.getInstance().resources.getString(R.string.lbl_pertalite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJumlahLiter: String? = MyApp.getInstance().resources.getString(R.string.lbl_jumlah_liter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetodePembayar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_metode_pembayar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSilhkanIsiKol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_silhkan_isi_kol)

)
