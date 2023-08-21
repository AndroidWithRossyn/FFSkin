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
import android.widget.TextView;
import android.widget.Toast;

import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaBannerAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;


public class Setting_Activity extends AppCompatActivity {
    TextView remote_pack_btn;
    RelativeLayout back_btn;
    LinearLayout native_ads,native_ads1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        remote_pack_btn = findViewById(R.id.remote_pack_btn);
        back_btn = findViewById(R.id.back_btn);
        native_ads = findViewById(R.id.native_ads);
        native_ads1 = findViewById(R.id.native_ads1);
        AppManage.getInstance(Setting_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(Setting_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[0], FACEBOOK_N[0]);
        remote_pack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Package Added", Toast.LENGTH_SHORT).show();
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Setting_Activity.this).showInterstitialAd(Setting_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(Setting_Activity.this).showInterstitialAd(Setting_Activity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                Setting_Activity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }

}