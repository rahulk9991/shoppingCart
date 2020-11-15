package com.example.partymontreal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    String TITLE[] = {"White balloon","Blue balloon","Yellow balloon","Green balloon","Black balloon"};
    String DESCRIPTION[]={"White Description","Blue Description","Yellow Description","Green Description","Black Description"};
    int IMAGE[]={R.drawable.white,R.drawable.blueballon,R.drawable.yellowballon,R.drawable.greenballon,R.drawable.blackballon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);




        ListView listView =(ListView)findViewById(R.id.listView_1);
        CustomAdaper customAdaper = new CustomAdaper();
        listView.setAdapter(customAdaper);
    }
    class CustomAdaper extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGE.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.row,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.image_row);
            TextView textView1 = (TextView)view.findViewById(R.id.text_view1);
            TextView textView2 = (TextView)view.findViewById(R.id.text_view2);

            imageView.setImageResource(IMAGE[i]);
            textView1.setText(TITLE[i]);
            textView2.setText(DESCRIPTION[i]);
            return view;
        }
    }

}