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

public class StartActivity extends AppCompatActivity {
    RelativeLayout start_btn;
    LinearLayout native_ads1;
    LinearLayout native_ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        start_btn=findViewById(R.id.start_btn);
        native_ads1=findViewById(R.id.native_ads1);
        native_ads=findViewById(R.id.native_ads);
        AppManage.getInstance(StartActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(StartActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(StartActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[1], FACEBOOK_N[1]);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(StartActivity.this).showInterstitialAd(StartActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(StartActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                },"",AppManage.app_mainClickCntSwAd);
            }
        });

    }
}