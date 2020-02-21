package com.abhijai.arp.views.ui.jobcards;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhijai.arp.R;
import com.abhijai.arp.models.JobCardModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobCardFragment extends Fragment {


    private ArrayList<JobCardModel> jobCardModelArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private JobCardRecyclerAdapter jobCardRecyclerAdapter;
    public JobCardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_job_card, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_jobCardDescription);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        jobCardRecyclerAdapter = new JobCardRecyclerAdapter(jobCardModelArrayList,getActivity());
        prepareJobModels();
    }

    private ArrayList<JobCardModel> prepareJobModels()
    {
        JobCardModel jobCardModel1 = new JobCardModel("Designing and developing high-volume, low-latency applications for mission-critical systems and delivering high-availability and performance.","112233","TCS");
        JobCardModel jobCardModel2 = new JobCardModel("Designing and developing advanced applications for the Android platform.","445566","Genpacts");
        JobCardModel jobCardModel3 = new JobCardModel("AI Engineers build, test, and deploy AI models, as well as maintain the underlying AI infrastructure.","778899","Accenture");
        jobCardModelArrayList.add(jobCardModel1);
        jobCardModelArrayList.add(jobCardModel2);
        jobCardModelArrayList.add(jobCardModel3);
        recyclerView.setAdapter(jobCardRecyclerAdapter);
        return jobCardModelArrayList;
    }

}
