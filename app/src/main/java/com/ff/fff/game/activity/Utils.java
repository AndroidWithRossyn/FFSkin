package com.ff.fff.game.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;

import androidx.browser.customtabs.CustomTabsIntent;

import com.ff.fff.game.R;

public class Utils {
    public static String url="https://864.win.qureka.com/";
    public static int[] imagelist={R.drawable.banner_one,R.drawable.banner_two,R.drawable.banner_three,R.drawable.banner_four,R.drawable.banner_five};
    public static int[] banner_list={R.drawable.sd_1,R.drawable.sd_2,R.drawable.sd_3,R.drawable.sd_4,R.drawable.sd_5,R.drawable.sd_6,R.drawable.sd_7};
    public static void openChromeCustomTabUrl(String webUrl,Context context) {
        try {
            if (isAppInstalled("com.android.chrome", context)) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                int coolorInt = Color.parseColor("#083A3E");
                builder.setToolbarColor(coolorInt);

                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.intent.setPackage("com.android.chrome");
                customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                customTabsIntent.launchUrl(context, Uri.parse(webUrl));
            } else {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                int coolorInt = Color.parseColor("#083A3E");
                builder.setToolbarColor(coolorInt);
                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                customTabsIntent.launchUrl(context, Uri.parse(webUrl));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static boolean isAppInstalled(String uri, Context context) {
        PackageManager pm = context.getPackageManager();
        boolean installed = false;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            installed = false;
        }
        return installed;
    }

    public static int[] images = {
            R.drawable.catch_pult,
            R.drawable.colorchase,
            R.drawable.dodgy,
            R.drawable.escape_run,
            R.drawable.ic_alienkindergarten,

            R.drawable.ic_basketballmaster,
            R.drawable.ic_bouncy,
            R.drawable.ic_brickplunge,
            R.drawable.ic_claypigeon,
            R.drawable.ic_crunchingninja,

            R.drawable.ic_evilwyrm,
            R.drawable.ic_exoplanetexpress,
            R.drawable.ic_fizzfuss,
            R.drawable.ic_flexisnake,
            R.drawable.ic_greedygnomes,

            R.drawable.ic_groovyski,
            R.drawable.ic_mousejump,
            R.drawable.ic_qureka1,
            R.drawable.ic_qureka2,
            R.drawable.ic_qureka3,

            R.drawable.ic_qureka4,
            R.drawable.ic_qureka5,
            R.drawable.ic_qureka6,
            R.drawable.ic_qureka7,
            R.drawable.ic_ropeninja,

            R.drawable.ic_sirbottomtight,
            R.drawable.ic_spacecowboy,
            R.drawable.ic_thesealionact,
            R.drawable.ic_tinytripper,
            R.drawable.ic_towertwist,

            R.drawable.ic_trollboxing,
            R.drawable.jellyslice,
            R.drawable.jomjomjump,
            R.drawable.pandalove,
            R.drawable.salazer,
            R.drawable.shititup
    };

    public static String[] values = {
            "Catch Pult",
            "Win Coins",
            "Salazar",
            "Win Coins",
            "Jelly Slice",

            "Win Coins",
            "Ship it Up!",
            "Win Coins",
            "Panda Love",
            "Win Coins",


            "Color Chase",
            "Win Coins",
            "Dodgy",
            "Win Coins",
            "Escape Run",

            "Win Coins",
            "Jom jom jump",
            "Win Coins",
            "Tower Loot",
            "Win Coins",

            "Groovy ski",
            "Win Coins",
            "Flexi Snake",
            "Win Coins",
            "Greedy games",

            "Win Coins",
            "Evil Wyrm",
            "Win Coins",
            "Basketball",
            "Win Coins",

            "Rope Ninja",
            "Jellyslice",
            "Jomjomjump",
            "Pandalove",
            "Salazer",
            "Shititup"


    };

    public static String[] values2 = {
            "1.27M plays",
            "Win 6.7 lakh",
            "3.8M",
            "Win 8.7 lakh",
            "3.9k playes",

            "1.7M plays",
            "Win 3.7 lakh",
            "9.8M",
            "Win 8.7 lakh",
            "3.9k playes",

            "1.27M plays",
            "Win 6.7 lakh",
            "3.8M",
            "Win 8.7 lakh",
            "3.9k playes",

            "1.2M plays",
            "Win 9.7 lakh",
            "3.8M",
            "Win 7.7 lakh",
            "3.9k playes",

            "1M plays",
            "Win 6.9 lakh",
            "3.9M",
            "Win 8.7 lakh",
            "7.9k playes",

            "1.27M plays",
            "Win 6.7 lakh",
            "4.8M",
            "Win 8.7 lakh",
            "2.9k playes",

            "1.27M plays",
            "Win 6.7 lakh",
            "3.8M",
            "Win 8.7 lakh",
            "8.9k playes",
            "1.27M plays"


    };


}


