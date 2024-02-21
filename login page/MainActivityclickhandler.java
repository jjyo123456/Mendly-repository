package com.example.dtb;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MainActivityclickhandler {

    Context context;

    public MainActivityclickhandler(Context context) {
        this.context = context;
    }

    public void onFABclicked(View view){
        Intent intent = new Intent(view.getContext(),AddnewContactactivity.class);
        context.startActivity(intent);
    }

}
