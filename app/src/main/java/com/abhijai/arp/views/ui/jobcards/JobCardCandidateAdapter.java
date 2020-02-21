package com.abhijai.arp.views.ui.jobcards;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;

public class JobCardCandidateAdapter {

    class MyJobCardCandidateViews extends RecyclerView.ViewHolder{
        private TextView textViewCandidateName;
        private TextView textViewMatchingPercentage;
        private View view;
        public MyJobCardCandidateViews(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            textViewCandidateName = itemView.findViewById(R.id.tv_)
        }
    }
}
