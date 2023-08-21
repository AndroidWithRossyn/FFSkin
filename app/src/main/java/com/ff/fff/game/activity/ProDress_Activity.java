package com.ff.fff.game.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ff.fff.game.R;
import com.pesonal.adsdk.AppManage;
import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

public class ProDress_Activity extends AppCompatActivity {
   RelativeLayout back_btn;
   LinearLayout native_ads,native_ads1;
   ImageView seation_one,seation_two,seation_three,seation_four,seation_five,seation_six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_dress);
        back_btn=findViewById(R.id.back_btn);
        seation_one=findViewById(R.id.seation_one);
        seation_two=findViewById(R.id.seation_two);
        seation_three=findViewById(R.id.seation_three);
        seation_four=findViewById(R.id.seation_four);
        seation_five=findViewById(R.id.seation_five);
        seation_six=findViewById(R.id.seation_six);
        native_ads=findViewById(R.id.native_ads);
        native_ads1=findViewById(R.id.native_ads1);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
        AppManage.getInstance(ProDress_Activity.this).loadInterstitialAd(this);
        AppManage.getInstance(ProDress_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(ProDress_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[0], FACEBOOK_N[0]);
        seation_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.season_6);
                        intent.putExtra("name","Season 1");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);


            }
        });
        seation_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.hiphop_bundle);
                        intent.putExtra("name","Hip Hope Bundle");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);


            }
        });
        seation_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.season_3);
                        intent.putExtra("name","Season 3");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        seation_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.season_4);
                        intent.putExtra("name","Season 4");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        seation_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.seasion_2);
                        intent.putExtra("name","Season 5");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        seation_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.season_5);
                        intent.putExtra("name","Season 6");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(ProDress_Activity.this).showInterstitialAd(ProDress_Activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                ProDress_Activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}