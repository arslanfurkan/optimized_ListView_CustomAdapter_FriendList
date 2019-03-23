package com.example.furka.customadapter_friendlistsample;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    String[] friendNames;
    String [] durumlar;
    int [] resimler={R.drawable.friend1,R.drawable.friend2,R.drawable.friend3,
            R.drawable.friend4,R.drawable.friend5,R.drawable.friend6,R.drawable.friend7,R.drawable.friend8, R.drawable.friend9,
            R.drawable.friend10,R.drawable.friend11,R.drawable.friend12,R.drawable.friend13,R.drawable.friend14,R.drawable.friend15,
        R.drawable.friend16,R.drawable.friend17,R.drawable.friend18,R.drawable.friend19,R.drawable.friend20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res= getResources();
        friendNames=res.getStringArray(R.array.isimler);
        durumlar=res.getStringArray(R.array.durum);
        list=(ListView) findViewById(R.id.friendListView);

        FriendListAdapter adapter= new FriendListAdapter(this,friendNames,durumlar,resimler);

        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView isim= (TextView) view.findViewById(R.id.textView);
        TextView durum= (TextView) view.findViewById(R.id.textView2);
        String message= isim.getText()+" "+getString(R.string.şuan)+" "+durum.getText();
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
