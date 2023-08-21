package com.ff.fff.game.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.fff.game.BuildConfig;
import com.ff.fff.game.R;
import com.pesonal.adsdk.AppManage;
import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

public class RefreyActivity extends AppCompatActivity {
    ImageView imageView;
    TextView activate_btn;
    RelativeLayout back_btn;
    LinearLayout native_ads1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrey);
        imageView=findViewById(R.id.image_view);
        activate_btn=findViewById(R.id.activate_btn);
        back_btn=findViewById(R.id.back_btn);
        native_ads1=findViewById(R.id.native_ads1);
        AppManage.getInstance(RefreyActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[0], FACEBOOK_N[0]);

        activate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(RefreyActivity.this).showInterstitialAd(RefreyActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });

    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(RefreyActivity.this).showInterstitialAd(RefreyActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                RefreyActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}