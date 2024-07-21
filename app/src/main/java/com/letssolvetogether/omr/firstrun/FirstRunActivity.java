package com.letssolvetogether.omr.firstrun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.letssolvetogether.omr.tutorial.TutorialActivity;
import com.letssolvetogether.omr.home.ui.HomeActivity;

public class FirstRunActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();


    }
}
