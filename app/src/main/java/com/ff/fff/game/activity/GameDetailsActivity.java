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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaMeduimAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;

public class GameDetailsActivity extends AppCompatActivity {
    TextView activate_btn, one_txt, two_txt, three_txt, four_txt, five_txt;
    ImageView image_view;
    TextView title;
    LinearLayout native_ads;
    RelativeLayout back_btn;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);
        activate_btn = findViewById(R.id.activate_btn);
        image_view = findViewById(R.id.image_view);
        native_ads = findViewById(R.id.native_ads);
        one_txt = findViewById(R.id.one_txt);
        two_txt = findViewById(R.id.two_txt);
        three_txt = findViewById(R.id.three_txt);
        four_txt = findViewById(R.id.four_txt);
        five_txt = findViewById(R.id.five_txt);
        title = findViewById(R.id.title);
        back_btn = findViewById(R.id.back_btn);
        img = getIntent().getIntExtra("img", 0);
        image_view.setImageResource(img);
        one_txt.setText("Season 1 Elite Pass");
        two_txt.setText("Hiphop Bundle");
        three_txt.setText("SK Sabir Full Bundle");
        four_txt.setText("Throne Emote");
        five_txt.setText("Golden MP40");
        title.setText("" + getIntent().getStringExtra("name"));
        AppManage.getInstance(GameDetailsActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(GameDetailsActivity.this).loadInterstitialAd(this);
        activate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(GameDetailsActivity.this).showInterstitialAd(GameDetailsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        activate_btn.setText("Lounch FF");
                        Toast.makeText(getApplicationContext(), "Package Added", Toast.LENGTH_SHORT).show();
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(GameDetailsActivity.this).showInterstitialAd(GameDetailsActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        finish();
                    }
                }, "", AppManage.app_innerClickCntSwAd);
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(GameDetailsActivity.this).showInterstitialAd(GameDetailsActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                GameDetailsActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }

}