package com.example.furka.customadapter_friendlistsample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;

/**
 * Created by furka on 9.02.2019.
 */

public class FriendListViewHolder {
    public ImageView resim;
    public TextView isim;
    public TextView durum;
    public FriendListViewHolder(View tek_satir){
        resim=(ImageView) tek_satir.findViewById(R.id.imageView);
        resim.setMaxHeight(64);
        resim.setMaxWidth(64);
        isim=(TextView) tek_satir.findViewById(R.id.textView);
        durum=(TextView)tek_satir.findViewById(R.id.textView2);
    }

}
