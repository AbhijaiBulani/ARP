package com.abhijai.arp.views.ui.timeline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.abhijai.arp.R;
import com.abhijai.arp.helper.AppConstants;
import com.abhijai.arp.views.BaseActivity;

public class TimeLineActivity extends BaseActivity {

    private TextView textViewCandidateName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);
        Intent intent = getIntent();
        String name = intent.getStringExtra(AppConstants.CANDIDATE_NAME);
        textViewCandidateName = findViewById(R.id.tv_candidateNameInTimeLine);
        textViewCandidateName.setText(name);
    }
}
