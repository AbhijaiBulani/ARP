package com.abhijai.arp.views.ui.jobcards;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.models.CandidateModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobCardCandidate extends AppCompatActivity {

    private RecyclerView recyclerViewCandidate;
    private ArrayList<CandidateModel> candidateModelArrayList = new ArrayList<>();
    public JobCardCandidate() {
        // Required empty public constructor
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_job_card_credentials);
        populateCandidates();
    }

    private ArrayList<CandidateModel> populateCandidates()
    {
        CandidateModel candidateModel1 = new CandidateModel("Abhishek","86%");
        CandidateModel candidateModel2 = new CandidateModel("Arun","72%");
        CandidateModel candidateModel3 = new CandidateModel("Shiv","61%");
        candidateModelArrayList.add(candidateModel1);
        candidateModelArrayList.add(candidateModel2);
        candidateModelArrayList.add(candidateModel3);
        return candidateModelArrayList;
    }
}
