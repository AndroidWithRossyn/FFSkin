package com.ff.fff.game.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ff.fff.game.BuildConfig;
import com.ff.fff.game.R;
import com.ff.fff.game.adapter.QricaBannerAdapter;
import com.pesonal.adsdk.AppManage;

import java.util.Timer;
import java.util.TimerTask;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rare_emotes, gun_skin, trending_btn, refere_btn, how_to_use;
    ImageView pro_dress;
    RelativeLayout menu_btn, home_btn, rate_app, share_app, privacy_btn, setting_btn;
    DrawerLayout draw_lay;
    LinearLayout native_ads,native_ads4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        native_ads = findViewById(R.id.native_ads);
        native_ads4 = findViewById(R.id.native_ads4);
        AppManage.getInstance(MainActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(MainActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(MainActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads4), ADMOB_N[0], FACEBOOK_N[0]);
        init();
    }

    public void init() {
        pro_dress = (ImageView) findViewById(R.id.pro_dress);
        rare_emotes = findViewById(R.id.rare_emotes);
        gun_skin = findViewById(R.id.gun_skin);
        trending_btn = findViewById(R.id.trending_btn);
        refere_btn = findViewById(R.id.refere_btn);
        how_to_use = findViewById(R.id.how_to_use);
        menu_btn = findViewById(R.id.menu_btn);
        draw_lay = findViewById(R.id.draw_lay);
        home_btn = findViewById(R.id.home_btn);
        rate_app = findViewById(R.id.rate_app);
        share_app = findViewById(R.id.share_app);
        privacy_btn = findViewById(R.id.privacy_btn);
        setting_btn = findViewById(R.id.setting_btn);


        pro_dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {


                        Intent intent = new Intent(getApplicationContext(), ProDress_Activity.class);
                        intent.putExtra("pro", "dress");

                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        rare_emotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), Rare_Emote_Activity.class);
                        intent.putExtra("pro", "emotes");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        gun_skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), Gun_Activity.class);
                        intent.putExtra("pro", "gun");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        trending_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), Trending_activity.class);
                        intent.putExtra("pro", "trending");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        refere_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), RefreyActivity.class);
                        intent.putExtra("pro", "trending");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);
            }
        });
        how_to_use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), How_to_Use_Activity.class);
                        intent.putExtra("pro", "trending");
                        startActivity(intent);
                    }
                }, AppManage.app_mainClickCntSwAd);

            }
        });
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.openDrawer(Gravity.LEFT);
            }
        });
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.closeDrawers();
            }
        });
        rate_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.closeDrawers();
                launchMarket();
            }
        });
        share_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.closeDrawers();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out my app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
        privacy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.closeDrawers();
                try {
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(AppManage.app_privacyPolicyLink));
                    startActivity(myIntent);
                } catch (ActivityNotFoundException e) {

                    e.printStackTrace();
                }
            }
        });
        setting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(getApplicationContext(), Setting_Activity.class);
                        intent.putExtra("pro", "trending");
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
    }

    private void launchMarket() {
        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed () {
        AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                ExitApp();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
    public void ExitApp() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.exit_dailog, null);
        LinearLayout ad_native = view.findViewById(R.id.ad_native);
        TextView cancel_btn = view.findViewById(R.id.cancel_btn);
        TextView rate_btn = view.findViewById(R.id.rate_btn);
        TextView yes_btn = view.findViewById(R.id.yes_btn);
        dialog.setView(view);
        AlertDialog dialog1 = dialog.create();
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.show();
        AppManage.getInstance(MainActivity.this).showNative((ViewGroup) findViewById(R.id.ad_native), ADMOB_N[0], FACEBOOK_N[0]);

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });

        rate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            }
        });

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                startActivity(new Intent(getApplicationContext(), Thanks_activity.class));
                finish();
            }
        });


    }

}