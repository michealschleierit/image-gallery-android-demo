package com.kjs566.imagegallerydemo;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kjs566.imagegallery.ui.IGDetailActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final @IdRes int[] buttons = {R.id.btn_from_resources, R.id.btn_from_uris};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int id : buttons){
            findViewById(id).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_from_resources:
                IGDetailActivity.startActivity(this, R.drawable.borek00, R.drawable.borek01, R.drawable.borek02, R.drawable.borek03);
                break;
            case R.id.btn_from_uris:
                IGDetailActivity.startActivity(this, getResources().getStringArray(R.array.image_urls));
                break;
        }
    }
}
