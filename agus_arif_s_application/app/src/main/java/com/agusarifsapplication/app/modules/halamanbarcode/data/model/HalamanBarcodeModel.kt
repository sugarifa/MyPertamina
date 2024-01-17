package com.agusarifsapplication.app.modules.halamanbarcode.`data`.model

import com.agusarifsapplication.app.R
import com.agusarifsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanBarcodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBarcodePemesan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_barcode_pemesan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSilhkanMelakuk: String? =
      MyApp.getInstance().resources.getString(R.string.msg_silhkan_melakuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPesan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesan)

)
