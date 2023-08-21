package com.ff.fff.game.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

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


public class Trending_activity extends AppCompatActivity {
    LinearLayout red_cri_btn,hiphop_btn,blue_crimanal,golden_btn,throen_btn,titan_btn;
    RelativeLayout back_btn;
    LinearLayout native_ads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);
        red_cri_btn=findViewById(R.id.red_cri_btn);
        hiphop_btn=findViewById(R.id.hiphop_btn);
        blue_crimanal=findViewById(R.id.blue_crimanal);
        golden_btn=findViewById(R.id.golden_btn);
        throen_btn=findViewById(R.id.throen_btn);
        titan_btn=findViewById(R.id.titan_btn);
        back_btn=findViewById(R.id.back_btn);
        native_ads = findViewById(R.id.native_ads);
        AppManage.getInstance(Trending_activity.this).loadInterstitialAd(this);
        AppManage.getInstance(Trending_activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        red_cri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.red_criminal);
                        intent.putExtra("name","RED CRIMINAL");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        hiphop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.hiphop_bundle1);
                        intent.putExtra("name","HIPHOP BUNDALE");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        blue_crimanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.blue_criminal);
                        intent.putExtra("name","BLUE CRIMINAL");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        golden_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.golden_mp40_);
                        intent.putExtra("name","GOLDEN MP40");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        throen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.throne_emote);
                        intent.putExtra("name","THERONE EMOTE");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        titan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                        intent.putExtra("img",R.drawable.titan_scar_);
                        intent.putExtra("name","TITAN SCAR");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(Trending_activity.this).showInterstitialAd(Trending_activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                Trending_activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}