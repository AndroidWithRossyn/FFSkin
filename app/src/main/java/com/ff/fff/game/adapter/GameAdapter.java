package com.ff.fff.game.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ff.fff.game.R;
import com.ff.fff.game.activity.Utils;

public class GameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    String[] name;
    String[] count;
    int[] image;

    public GameAdapter(Context context, String[] name, String[] count, int[] image) {
        this.context = context;
        this.name = name;
        this.count = count;
        this.image = image;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.lay_game,parent,false);
       GameHolder holder=new GameHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {
     GameHolder holder1= (GameHolder) holder;
     holder1.game_name.setText(name[position]);
     holder1.count_txt.setText(count[position]);
     holder1.game_img.setImageResource(image[position]);
     holder1.next_act.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Utils.openChromeCustomTabUrl("https://864.win.qureka.com/",context);
         }
     });

    }

    @Override
    public int getItemCount() {
        return image.length;
    }
    public class GameHolder extends RecyclerView.ViewHolder {
        ImageView game_img;
        TextView game_name,count_txt;
        RelativeLayout next_act;
        public GameHolder(@NonNull  View itemView) {
            super(itemView);
            game_img=itemView.findViewById(R.id.game_img);
            game_name=itemView.findViewById(R.id.game_name);
            count_txt=itemView.findViewById(R.id.count_txt);
            next_act=itemView.findViewById(R.id.next_act);

        }
    }
}
