package com.sinothk.widget.labelView.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.sinothk.widget.labelView.style1.AutoFlowLayout;
import com.sinothk.widget.labelView.style1.FlowAdapter;

import java.util.Arrays;

/**
 * Created by lvruheng on 2017/8/4.
 */

public class SpecialGridActivity extends AppCompatActivity {
    private AutoFlowLayout mFlowLayout;
    private String[] mData = {"Java", "C++", "Python", "JavaScript", "Ruby", "Swift", "Swift", "MATLAB", "Scratch", "C++", "Python", "JavaScript", "Ruby", "Swift", "Swift", "MATLAB", "Scratch", "C++", "Python", "JavaScript", "Ruby", "Swift", "Swift", "MATLAB", "Scratch", "C++", "Python", "JavaScript", "Ruby", "Swift", "Swift", "MATLAB", "Scratch"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_grid);

        mFlowLayout = (AutoFlowLayout) findViewById(R.id.afl_cotent);
        mFlowLayout.setAdapter(new FlowAdapter(Arrays.asList(mData)) {
            @Override
            public View getView(int position) {
                View item = LayoutInflater.from(SpecialGridActivity.this).inflate(R.layout.special_grid_item, null);
                return item;
            }
        });
    }
}
