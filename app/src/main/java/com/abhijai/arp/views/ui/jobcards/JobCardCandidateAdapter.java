package com.abhijai.arp.views.ui.jobcards;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.helper.AppConstants;
import com.abhijai.arp.models.CandidateModel;
import com.abhijai.arp.views.ui.timeline.TimeLineActivity;

import java.util.ArrayList;

public class JobCardCandidateAdapter extends RecyclerView.Adapter<JobCardCandidateAdapter.MyJobCardCandidateViews> {

    private ArrayList<CandidateModel> candidateModelArrayList = new ArrayList<>();
    Context activityContext;
    public JobCardCandidateAdapter(ArrayList<CandidateModel> candidateModelArrayList, Context context){
        this.candidateModelArrayList = candidateModelArrayList;
        activityContext = context;
    }

    @NonNull
    @Override
    public MyJobCardCandidateViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_card_candidate_row,null);
        return new MyJobCardCandidateViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyJobCardCandidateViews holder, final int position) {
        holder.populateJobCardCandidate(candidateModelArrayList.get(position));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityContext, TimeLineActivity.class);
                intent.putExtra(AppConstants.CANDIDATE_NAME,candidateModelArrayList.get(position).getCandidateName());
                activityContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return candidateModelArrayList.size();
    }

    class MyJobCardCandidateViews extends RecyclerView.ViewHolder{
        private TextView textViewCandidateName;
        private TextView textViewMatchingPercentage;
        private View view;
        public MyJobCardCandidateViews(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            textViewCandidateName = itemView.findViewById(R.id.tv_jobCardCandidateName);
            textViewMatchingPercentage = itemView.findViewById(R.id.tv_jobCardCandidatePercentage);
        }
        private void populateJobCardCandidate(CandidateModel model){
            int per = Integer.parseInt(model.getCandidateMatchingPercentage());
            String str = model.getCandidateMatchingPercentage();
            textViewCandidateName.setText(model.getCandidateName());
            textViewMatchingPercentage.setText(model.getCandidateMatchingPercentage()+"%");
            if (per>80){
                textViewMatchingPercentage.setTextColor(Color.parseColor(AppConstants.GREEN));
            }
            else if (per>70){
                textViewMatchingPercentage.setTextColor(Color.parseColor(AppConstants.BLUE));
            }
            else {
                textViewMatchingPercentage.setTextColor(Color.parseColor(AppConstants.RED));
            }

        }
    }
}
