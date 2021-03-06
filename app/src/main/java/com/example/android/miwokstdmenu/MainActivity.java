/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwokstdmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

     /*   TextView numbersView = (TextView) findViewById(R.id.numbers);
        if (numbersView != null) {
            NumbersClickListener clickListener = new NumbersClickListener();
            numbersView.setOnClickListener(clickListener);
        } */
        // Find the Views that show the categories
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        if (numbers != null) {
            numbers.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                   // Toast.makeText(MainActivity.this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

        TextView family = (TextView) findViewById(R.id.family);

        if (family != null) {
            // Set a click listener on that View
            family.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                    // Start the new activity
                    startActivity(familyIntent);
                }
            });
        }

        TextView colors = (TextView) findViewById(R.id.colors);

        if (colors != null) {
            // Set a click listener on that View
            colors.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);

                    // Start the new activity
                    startActivity(colorsIntent);
                }
            });
        }

        TextView phrases = (TextView) findViewById(R.id.phrases);

        if (phrases != null) {
            // Set a click listener on that View
            phrases.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link PhrasesActivity}
                    Intent phrasesIntent = new Intent(MainActivity.this, PhraseActivity.class);

                    // Start the new activity
                    startActivity(phrasesIntent);
                }
            });
        }
    }








    /*public void openNumbersList(View view) {

        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyList(View view) {

        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {

        Intent i = new Intent(this, ColorActivity.class);
        startActivity(i);
    }
    public void openPhraseList(View view) {

        Intent i = new Intent(this, PhraseActivity.class);
        startActivity(i);
    }*/

}

