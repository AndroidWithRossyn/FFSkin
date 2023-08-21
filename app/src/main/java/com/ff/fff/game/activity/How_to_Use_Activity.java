package com.ff.fff.game.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaMeduimAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;

public class How_to_Use_Activity extends AppCompatActivity {
    RelativeLayout back_btn;
    LinearLayout native_ads;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        back_btn=findViewById(R.id.back_btn);
        native_ads=findViewById(R.id.native_ads);
        AppManage.getInstance(How_to_Use_Activity.this).loadInterstitialAd(this);
        AppManage.getInstance(How_to_Use_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(How_to_Use_Activity.this).showInterstitialAd(How_to_Use_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(How_to_Use_Activity.this).showInterstitialAd(How_to_Use_Activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                How_to_Use_Activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}