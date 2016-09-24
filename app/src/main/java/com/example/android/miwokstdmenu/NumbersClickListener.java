package com.example.android.miwokstdmenu;

import android.view.View;
import android.widget.Toast;

/**
 * Created by David on 9/21/2016.
 */

public class NumbersClickListener implements View.OnClickListener{

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
    }

}
