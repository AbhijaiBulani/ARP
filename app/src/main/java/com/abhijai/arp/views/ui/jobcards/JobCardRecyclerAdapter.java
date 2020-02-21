package com.abhijai.arp.views.ui.jobcards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.models.JobCardModel;

import java.util.ArrayList;

public class JobCardRecyclerAdapter extends RecyclerView.Adapter<JobCardRecyclerAdapter.MyJobCardViews> {

    private ArrayList<JobCardModel> jobCardModelArrayList = new ArrayList<>();
    private Context context;
    private Activity activity;

    public JobCardRecyclerAdapter(ArrayList<JobCardModel> jobCardModelArrayList,Activity activity)
    {
        this.jobCardModelArrayList = jobCardModelArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyJobCardViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_card_row,null);
        context = parent.getContext();
        return new MyJobCardViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyJobCardViews holder, int position) {
        holder.populateJobCardData(jobCardModelArrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,JobCardCandidate.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobCardModelArrayList.size();
    }

    class MyJobCardViews extends RecyclerView.ViewHolder
    {
        private TextView textViewJobDescription;
        private TextView textViewClientName;
        private TextView textViewJobId;
        private View itemView;
        public MyJobCardViews(@NonNull View itemView) {
            super(itemView);
            textViewJobDescription = itemView.findViewById(R.id.tv_jobdescription);
            textViewClientName = itemView.findViewById(R.id.tv_clientNameInJobDescription);
            textViewJobId = itemView.findViewById(R.id.tv_jobId);
            this.itemView = itemView;
        }

        private void populateJobCardData(JobCardModel model){
            textViewJobDescription.setText(model.getJobDescription());
            textViewClientName.setText(model.getClientName());
            textViewJobId.setText(model.getJobId());
        }
    }
}
