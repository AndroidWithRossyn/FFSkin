package com.ff.fff.game.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaBannerAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;
import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

public class Gun_Activity extends AppCompatActivity {
  RelativeLayout back_btn;
  LinearLayout golden_btn,titan_btn,winter_btn,moon_btn,flam_btn,golden_mp_btn;
  LinearLayout native_ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun);
        back_btn=findViewById(R.id.back_btn);
        golden_btn=findViewById(R.id.golden_btn);
        titan_btn=findViewById(R.id.titan_btn);
        winter_btn=findViewById(R.id.winter_btn);
        moon_btn=findViewById(R.id.moon_btn);
        flam_btn=findViewById(R.id.flam_btn);
        golden_mp_btn=findViewById(R.id.golden_mp_btn);
        native_ads=findViewById(R.id.native_ads);

        AppManage.getInstance(Gun_Activity.this).loadInterstitialAd(this);
        AppManage.getInstance(Gun_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);

        golden_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.golden_famas);
                        intent.putExtra("name","GOLDEN FAMAS");
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        titan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.titan_scar);
                        intent.putExtra("name","TITAN SCAR");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        winter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.winterland_m);
                        intent.putExtra("name","WINTERLAND M1014");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        moon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.moon_famas);
                        intent.putExtra("name","MOON FAMAS");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        flam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.flame_m1014);
                        intent.putExtra("name","FLAME M1014");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        golden_mp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.golden_mp40);
                        intent.putExtra("name","GOLDEN MP40");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(Gun_Activity.this).showInterstitialAd(Gun_Activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                Gun_Activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}