package com.ritrageproductions.app.abhishekcookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer[] imgId = {
            R.drawable.item1,
            R.drawable.item2,
            R.drawable.item3,
            R.drawable.item4,
            R.drawable.item5,
            R.drawable.item6,
            R.drawable.item7,
            R.drawable.item8
    };

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.restaurant_menu);
        gridView.setAdapter(new ImageAdapter(this));
    }

    public class ImageAdapter extends BaseAdapter {

        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        public int getCount() {
            return imgId.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            if(view==null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams(new GridView.LayoutParams(520,525));
                imageView.setScaleType(
                        ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(5,5,5,5);
            }
            else {
                imageView = (ImageView)view;
            }
            imageView.setImageResource(imgId[i]);
            return imageView;
        }
    }

}