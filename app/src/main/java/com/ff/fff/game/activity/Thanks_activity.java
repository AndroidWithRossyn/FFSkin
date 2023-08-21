package com.ff.fff.game.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaMeduimAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

public class Thanks_activity extends AppCompatActivity {
    LinearLayout native_ads,native_ads1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        native_ads=findViewById(R.id.native_ads);
        native_ads1=findViewById(R.id.native_ads1);
        AppManage.getInstance(Thanks_activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(Thanks_activity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[0], FACEBOOK_N[0]);

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}