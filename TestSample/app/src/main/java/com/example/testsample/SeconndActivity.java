package com.example.testsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SeconndActivity extends AppCompatActivity {

    @BindView(R.id.tv_second_activity_name)
    TextView tvActivityName;
    @BindView(R.id.btn_back)
    Button btnBack;

    private static final String TAG = SeconndActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconnd);

        ButterKnife.bind(this);

        tvActivityName.setText(TAG);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
