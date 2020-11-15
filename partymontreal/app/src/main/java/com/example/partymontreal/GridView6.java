package com.example.partymontreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class GridView6 extends AppCompatActivity {

    String TITLE[] = {"Birthday Banner","Birthday Caps","Full set Decor","Lights 2214","Full set with balloon","Lights 10021"};
    String DESCRIPTION[]={"Birthday Banner Description","Birthday Caps Description","Full set Decor Description","Lights 2214 Description","Full set with balloon","Lights 10021"};
    int IMAGE[]={R.drawable.mbanner,R.drawable.mcap,R.drawable.mfullset,R.drawable.mlight,R.drawable.mwithballoon,R.drawable.mlighttwo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view6);
        ListView listView =(ListView)findViewById(R.id.listView_6);
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