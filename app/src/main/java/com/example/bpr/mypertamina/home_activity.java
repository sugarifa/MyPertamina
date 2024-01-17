package com.example.bpr.mypertamina;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class home_activity extends Activity {


    private View _bg__home;
    private View rectangle_157;
    private View rectangle_158;
    private View rectangle_159;
    private TextView subsidi_tepat;
    private TextView voucher;
    private TextView kios_matic;
    private TextView asuransi;
    private TextView lainnya;
    private TextView delivery_service;
    private TextView pemesanan;
    private TextView pembayaran;
    private TextView event___promo;
    private ImageView group_51;
    private View ellipse_1;
    private View ellipse_3;
    private View ellipse_5;
    private View rectangle_152;
    private ImageView vector;
    private ImageView vector_ek1;
    private View rectangle_153;
    private ImageView ticket_1;
    private View rectangle_154;
    private ImageView automobile_with_wrench_1;
    private View rectangle_155;
    private ImageView charging_station_1;
    private View rectangle_156;
    private ImageView ballot_box_1;
    private ImageView shop_1;
    private ImageView medical_insurance_1;
    private View rectangle_172;
    private ImageView rectangle_173;
    private View rectangle_174;
    private View rectangle_175;
    private ImageView rectangle_147;
    private ImageView rectangle_171;
    private TextView saldo;
    private TextView rp__42_000;
    private View rectangle_149;
    private ImageView asf_1;
    private TextView _201_points;
    private TextView my_point;
    private TextView _2_9_liter;
    private TextView total_pengisian;
    private ImageView gas_station_1;
    private ImageView vector_ek2;
    private TextView diyas_frans_adhira;
    private ImageView top_up_1;
    private TextView top_up;
    private ImageView vector_159;
    private ImageView subtract__traced_;
    private ImageView group_56;
    private ImageView vector_ek3;
    private TextView home;
    private TextView kartu;
    private ImageView vector_ek4;
    private TextView map;
    private ImageView vector_ek5;
    private TextView points;
    private ImageView vector_ek6;
    private ImageView vector_ek7;
    private TextView profile;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        _bg__home = (View) findViewById(R.id._bg__home);
        rectangle_157 = (View) findViewById(R.id.rectangle_157);
        rectangle_158 = (View) findViewById(R.id.rectangle_158);
        rectangle_159 = (View) findViewById(R.id.rectangle_159);
        subsidi_tepat = (TextView) findViewById(R.id.subsidi_tepat);
        voucher = (TextView) findViewById(R.id.voucher);
        kios_matic = (TextView) findViewById(R.id.kios_matic);
        asuransi = (TextView) findViewById(R.id.asuransi);
        lainnya = (TextView) findViewById(R.id.lainnya);
        delivery_service = (TextView) findViewById(R.id.delivery_service);
        pemesanan = (TextView) findViewById(R.id.pemesanan);
        pembayaran = (TextView) findViewById(R.id.pembayaran);
        event___promo = (TextView) findViewById(R.id.event___promo);
        group_51 = (ImageView) findViewById(R.id.group_51);
        ellipse_1 = (View) findViewById(R.id.ellipse_1);
        ellipse_3 = (View) findViewById(R.id.ellipse_3);
        ellipse_5 = (View) findViewById(R.id.ellipse_5);
        rectangle_152 = (View) findViewById(R.id.rectangle_152);
        vector = (ImageView) findViewById(R.id.vector);
        vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
        rectangle_153 = (View) findViewById(R.id.rectangle_153);
        ticket_1 = (ImageView) findViewById(R.id.ticket_1);
        rectangle_154 = (View) findViewById(R.id.rectangle_154);
        automobile_with_wrench_1 = (ImageView) findViewById(R.id.automobile_with_wrench_1);
        rectangle_155 = (View) findViewById(R.id.rectangle_155);
        charging_station_1 = (ImageView) findViewById(R.id.charging_station_1);
        rectangle_156 = (View) findViewById(R.id.rectangle_156);
        ballot_box_1 = (ImageView) findViewById(R.id.ballot_box_1);
        shop_1 = (ImageView) findViewById(R.id.shop_1);
        medical_insurance_1 = (ImageView) findViewById(R.id.medical_insurance_1);
        rectangle_172 = (View) findViewById(R.id.rectangle_172);
        rectangle_173 = (ImageView) findViewById(R.id.rectangle_173);
        rectangle_174 = (View) findViewById(R.id.rectangle_174);
        rectangle_175 = (View) findViewById(R.id.rectangle_175);
        rectangle_147 = (ImageView) findViewById(R.id.rectangle_147);
        rectangle_171 = (ImageView) findViewById(R.id.rectangle_171);
        saldo = (TextView) findViewById(R.id.saldo);
        rp__42_000 = (TextView) findViewById(R.id.rp__42_000);
        rectangle_149 = (View) findViewById(R.id.rectangle_149);
        asf_1 = (ImageView) findViewById(R.id.asf_1);
        _201_points = (TextView) findViewById(R.id._201_points);
        my_point = (TextView) findViewById(R.id.my_point);
        _2_9_liter = (TextView) findViewById(R.id._2_9_liter);
        total_pengisian = (TextView) findViewById(R.id.total_pengisian);
        gas_station_1 = (ImageView) findViewById(R.id.gas_station_1);
        vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
        diyas_frans_adhira = (TextView) findViewById(R.id.diyas_frans_adhira);
        top_up_1 = (ImageView) findViewById(R.id.top_up_1);
        top_up = (TextView) findViewById(R.id.top_up);
        vector_159 = (ImageView) findViewById(R.id.vector_159);
        subtract__traced_ = (ImageView) findViewById(R.id.subtract__traced_);
        group_56 = (ImageView) findViewById(R.id.group_56);
        vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
        home = (TextView) findViewById(R.id.home);
        kartu = (TextView) findViewById(R.id.kartu);
        vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
        map = (TextView) findViewById(R.id.map);
        vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
        points = (TextView) findViewById(R.id.points);
        vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
        vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
        profile = (TextView) findViewById(R.id.profile);


        //custom code goes here

        rectangle_155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_activity.this,MenuActivity.class);
                startActivity(intent);
            }
        });

    }
}

