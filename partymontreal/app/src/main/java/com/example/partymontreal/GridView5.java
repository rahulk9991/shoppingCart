package com.example.partymontreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class GridView5 extends AppCompatActivity {

    String TITLE[] = {"Outdoor Decoration","Lilli Pot","Birthday Poster","Rose Pot"};
    String DESCRIPTION[]={"Outdoor Decoration Description","Lilli Pot Description","Birthday Poster Description","Rose Pot Description"};
    int IMAGE[]={R.drawable.doutdoor,R.drawable.dlilipot,R.drawable.dposter,R.drawable.drosepot};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view5);

        ListView listView =(ListView)findViewById(R.id.listView_5);
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