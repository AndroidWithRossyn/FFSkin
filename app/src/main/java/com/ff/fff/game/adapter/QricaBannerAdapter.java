package com.ff.fff.game.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.ff.fff.game.R;
import com.ff.fff.game.activity.Utils;

public class QricaBannerAdapter extends PagerAdapter {
    int[] image;
    Context context;

    public QricaBannerAdapter(int[] image, Context context) {
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }


    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(context).inflate(R.layout.banner_small_lay,container,false);
        ImageView image_view=view.findViewById(R.id.image_view);
        image_view.setImageResource(image[position]);
        ViewPager pager= (ViewPager) container;
        pager.addView(view,0);

        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openChromeCustomTabUrl("https://864.win.qureka.com/",context);
            }
        });
        return view;
    }

    @Override
    public void destroyItem(@NonNull  ViewGroup container, int position, @NonNull  Object object) {
        ViewPager viewPager= (ViewPager) container;
        View view= (View) object;
        viewPager.removeView(view);
    }

    @Override
    public boolean isViewFromObject(@NonNull  View view, @NonNull  Object object) {
        return view==object;
    }
}
