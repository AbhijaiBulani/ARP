package com.abhijai.arp.views.ui.jobcards;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.helper.AppConstants;
import com.abhijai.arp.models.CandidateModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobCardCandidateActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCandidate;

    private ArrayList<CandidateModel> candidateModelArrayListJava = new ArrayList<>();
    private ArrayList<CandidateModel> candidateModelArrayListAndroid = new ArrayList<>();
    private ArrayList<CandidateModel> candidateModelArrayListAi = new ArrayList<>();
    private TextView textViewJobTitle;
    private JobCardCandidateAdapter jobCardCandidateAdapter;
    private static final String TAG = "JobCardCandidate";
    public JobCardCandidateActivity() {
        // Required empty public constructor
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_job_card_credentials);
        Intent intent = getIntent();
        int str = intent.getIntExtra(AppConstants.JOB_TITLE,0);
        textViewJobTitle = findViewById(R.id.tv_jobTitleInCandidateScreen);
        recyclerViewCandidate = findViewById(R.id.rv_jobCardCandidate);
        recyclerViewCandidate.setLayoutManager(new LinearLayoutManager(this));
        jobCardCandidateAdapter = new JobCardCandidateAdapter(populateCandidates(str),this);
        recyclerViewCandidate.setAdapter(jobCardCandidateAdapter);
        manageTitle(str);
    }

    private ArrayList<CandidateModel> populateCandidates(int pos)
    {
        switch (pos){
            case 0:{
                CandidateModel candidateModel1 = new CandidateModel("Abhishek","86");
                CandidateModel candidateModel2 = new CandidateModel("Arun","72");
                CandidateModel candidateModel3 = new CandidateModel("Shiv","61");
                CandidateModel candidateModel4 = new CandidateModel("Saurabh","77");
                candidateModelArrayListJava.add(candidateModel1);
                candidateModelArrayListJava.add(candidateModel2);
                candidateModelArrayListJava.add(candidateModel3);
                candidateModelArrayListJava.add(candidateModel4);
                return candidateModelArrayListJava;
            }
            case 1:{
                CandidateModel candidateModel4 = new CandidateModel("Himashu","73");
                CandidateModel candidateModel1 = new CandidateModel("Amit","88");
                CandidateModel candidateModel2 = new CandidateModel("Rohit","71");
                CandidateModel candidateModel3 = new CandidateModel("Abhijai","58");
                CandidateModel candidateModel5 = new CandidateModel("Arun","78");
                candidateModelArrayListAndroid.add(candidateModel3);
                candidateModelArrayListAndroid.add(candidateModel1);
                candidateModelArrayListAndroid.add(candidateModel2);
                candidateModelArrayListAndroid.add(candidateModel4);
                candidateModelArrayListAndroid.add(candidateModel5);
                return candidateModelArrayListAndroid;
            }
            case 2:{
                CandidateModel candidateModel1 = new CandidateModel("Saurabh","87");
                CandidateModel candidateModel2 = new CandidateModel("Bhusan","66");
                CandidateModel candidateModel3 = new CandidateModel("Ashutosh","73");
                CandidateModel candidateModel4 = new CandidateModel("Arun","27");
                CandidateModel candidateModel5 = new CandidateModel("Nitesh","57");
                candidateModelArrayListAi.add(candidateModel1);
                candidateModelArrayListAi.add(candidateModel2);
                candidateModelArrayListAi.add(candidateModel3);
                candidateModelArrayListAi.add(candidateModel4);
                candidateModelArrayListAi.add(candidateModel5);
                return candidateModelArrayListAi;
            }
            default:{
                return null;
            }
        }
    }

    private void manageTitle(int position){
        Log.d(TAG, "manageTitle: "+position);
        switch (position)
        {
            case 0:{
                textViewJobTitle.setText("JAVA");
                break;
            }
            case 1:{
                textViewJobTitle.setText("ANDROID");
                break;
            }
            case 2:{
                textViewJobTitle.setText("AI");
                break;
            }
        }
    }
}
