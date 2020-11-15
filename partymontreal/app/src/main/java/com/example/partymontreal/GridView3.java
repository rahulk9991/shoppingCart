package com.example.partymontreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class GridView3 extends AppCompatActivity {

    String TITLE[] = {"LED Cups","Frozen plate","Glasses","Blue Glasses","Pink Full set","Plain Dishes"};
    String DESCRIPTION[]={"LED Cups Description","Frozen plate Description","Glasses Description","Blue Glasses Description","Pink Full set Description","Plain Dishes Description"};
    int IMAGE[]={R.drawable.ledcups,R.drawable.frozenplate,R.drawable.glasses,R.drawable.glassesblue,R.drawable.pinkset,R.drawable.plaindishs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view3);

        ListView listView =(ListView)findViewById(R.id.listView_3);
        CustomAdaper customAdaper = new CustomAdaper();
        listView.setAdapter(customAdaper);
    }
    class CustomAdaper extends BaseAdapter{

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