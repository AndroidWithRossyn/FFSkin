package com.ff.fff.game.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ff.fff.game.R;
import com.pesonal.adsdk.AppManage;


public class Option_Activity extends AppCompatActivity {
    String type;
    LinearLayout native_ads;
    ImageView pro_dress,rare_emotes,gun_skin,trending_btn,refere_btn,how_to_use;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        type=getIntent().getStringExtra("pro");
        pro_dress=findViewById(R.id.pro_dress);
        rare_emotes=findViewById(R.id.rare_emotes);
        gun_skin=findViewById(R.id.gun_skin);
        trending_btn=findViewById(R.id.trending_btn);
        native_ads=findViewById(R.id.native_ads);
        refere_btn=findViewById(R.id.refere_btn);
        how_to_use=findViewById(R.id.how_to_use);
        AppManage.getInstance(Option_Activity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        if(type.equals("dress"))
        {
            pro_dress.setImageResource(R.drawable.season_1);
            rare_emotes.setImageResource(R.drawable.hiphop_bundle);
            gun_skin.setImageResource(R.drawable.season_3);
            trending_btn.setImageResource(R.drawable.season_4);
            refere_btn.setImageResource(R.drawable.season_5);
            how_to_use.setImageResource(R.drawable.season_6);
        }
        else if(type.equals("emotes"))
        {
            pro_dress.setImageResource(R.drawable.applause);
            rare_emotes.setImageResource(R.drawable.baby_shark);
            gun_skin.setImageResource(R.drawable.bhangra);
            trending_btn.setImageResource(R.drawable.lol);
            refere_btn.setImageResource(R.drawable.one_finger);
            how_to_use.setImageResource(R.drawable.provoke);
        }
        else if(type.equals("gun"))
        {
            pro_dress.setImageResource(R.drawable.golden_famas);
            rare_emotes.setImageResource(R.drawable.titan_scar);
            gun_skin.setImageResource(R.drawable.winterland_m);
            trending_btn.setImageResource(R.drawable.moon_famas);
            refere_btn.setImageResource(R.drawable.flame_m1014);
            how_to_use.setImageResource(R.drawable.golden_mp40);
        }
        else if(type.equals("trending"))
        {
            pro_dress.setImageResource(R.drawable.red_criminal);
            rare_emotes.setImageResource(R.drawable.hiphop_bundle1);
            gun_skin.setImageResource(R.drawable.blue_criminal);
            trending_btn.setImageResource(R.drawable.golden_mp40_);
            refere_btn.setImageResource(R.drawable.throne_emote);
            how_to_use.setImageResource(R.drawable.titan_scar_);
        }
        pro_dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.season_1);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.applause);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.golden_famas);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.red_criminal);
                            startActivity(intent);
                        }
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        rare_emotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.hiphop_bundle);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.baby_shark);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.titan_scar);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.hiphop_bundle1);
                            startActivity(intent);
                        }
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        gun_skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.season_3);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.bhangra);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.winterland_m);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.blue_criminal);
                            startActivity(intent);
                        }
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        trending_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.season_4);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.lol);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.moon_famas);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.golden_mp40_);
                            startActivity(intent);
                        }
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });

        refere_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.season_5);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.one_finger);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.flame_m1014);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.throne_emote);
                            startActivity(intent);
                        }
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        how_to_use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(Option_Activity.this).showInterstitialAd(Option_Activity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        if(type.equals("dress"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.season_6);
                            startActivity(intent);
                        }
                        else if(type.equals("emotes"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.provoke);
                            startActivity(intent);
                        }
                        else if(type.equals("gun"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.golden_mp40);
                            startActivity(intent);
                        }
                        else if(type.equals("trending"))
                        {
                            Intent intent=new Intent(getApplicationContext(),GameDetailsActivity.class);
                            intent.putExtra("img",R.drawable.titan_scar_);
                            startActivity(intent);
                        }
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
    }
}