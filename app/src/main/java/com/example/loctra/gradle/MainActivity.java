package com.example.loctra.gradle;

import android.support.v7.app.AppCompatActivity;

import com.example.loctra.gradle.databinding.ActivityMainBinding;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.BindingObject;
import org.androidannotations.annotations.DataBound;
import org.androidannotations.annotations.EActivity;

@DataBound
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @BindingObject
    ActivityMainBinding binding;

    @AfterViews
    void afterViews(){
        // todo something
    }

}
