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

public class Rare_Emote_Activity extends AppCompatActivity {
   LinearLayout app_btn,baby_shark,bhangra_btn,lol_btn,one_finger_btn,provoke_btn;
   RelativeLayout back_btn;
   LinearLayout native_ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rare_emote);
        app_btn = findViewById(R.id.app_btn);
        baby_shark = findViewById(R.id.baby_shark);
        bhangra_btn = findViewById(R.id.bhangra_btn);
        lol_btn = findViewById(R.id.lol_btn);
        one_finger_btn = findViewById(R.id.one_finger_btn);
        provoke_btn = findViewById(R.id.provoke_btn);
        back_btn = findViewById(R.id.back_btn);
        native_ads = findViewById(R.id.native_ads);
        AppManage.getInstance(Rare_Emote_Activity.this).loadInterstitialAd(this);
        AppManage.getInstance(Rare_Emote_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);

        app_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.applause);
                        intent.putExtra("name", "APPLAUSE");
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);


            }
        });
        baby_shark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.baby_shark);
                        intent.putExtra("name", "BABY SHARK");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        bhangra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.bhangra);
                        intent.putExtra("name", "BHANGRA");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        lol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.lol);
                        intent.putExtra("name", "LOL");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        one_finger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.one_finger);
                        intent.putExtra("name", "ONE FINGER PUSHUP");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        provoke_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), GameDetailsActivity.class);
                        intent.putExtra("img", R.drawable.provoke);
                        intent.putExtra("name", "PROVOKE");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(Rare_Emote_Activity.this).showInterstitialAd(Rare_Emote_Activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                Rare_Emote_Activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}