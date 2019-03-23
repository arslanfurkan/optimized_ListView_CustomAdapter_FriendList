package com.example.furka.customadapter_friendlistsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by furka on 6.02.2019.
 */

public class FriendListAdapter extends ArrayAdapter<String> {

    Context context;
    String[] friendNames;
    String[] durumlar;
    int[] resimler;

    public FriendListAdapter(Context c,String[] friendNames,String [] durumlar,int [] resimler){
        super(c,R.layout.tek_satir,R.id.textView,friendNames);
        this.context=c;
        this.friendNames=friendNames;
        this.durumlar=durumlar;
        this.resimler=resimler;

    }


    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View tek_satir=convertView;//Listing optimizasyonu için convertView kullandık.(OBJECT RECYCLING)
        FriendListViewHolder viewHolder=null;
        if(tek_satir==null){
            LayoutInflater i= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            tek_satir= i.inflate(R.layout.tek_satir,parent,false);//false olmasının nedeni henüz bu tek_satir layoutu
            // parenta göre ayarla fakat henüz ekleme anlamına geliyor ekleme kısmı return kısmında zaten verilecek
            viewHolder=new FriendListViewHolder(tek_satir);//Her view çağrışında id ile widgetlara ulaşmak maliyetli olacağından
            //viewHolder mekanizmasını kullandım.
            tek_satir.setTag(viewHolder);
        }
        else {
            viewHolder=(FriendListViewHolder) tek_satir.getTag();
        }

        viewHolder.resim.setImageResource(resimler[position]);
        viewHolder.isim.setText(friendNames[position]);
        viewHolder.durum.setText(durumlar[position]);

        return tek_satir;
    }


}
