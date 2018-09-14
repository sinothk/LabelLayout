package com.sinothk.widget.labelView.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioGroup;

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
        mFlowLayout.setRowNumbers(3);// 行
        mFlowLayout.setColumnNumbers(3); // 列
        mFlowLayout.setAdapter(new FlowAdapter(Arrays.asList(mData)) {
            @Override
            public View getView(int position) {
//                WindowManager wm = SpecialGridActivity.this.getWindowManager();
//                int width = wm.getDefaultDisplay().getWidth();
//                int height = wm.getDefaultDisplay().getHeight();

                View item = LayoutInflater.from(SpecialGridActivity.this).inflate(R.layout.special_grid_item, null);
//                item.setLayoutParams(new RadioGroup.LayoutParams(width/3,width/3));

                return item;
            }
        });
    }
}
