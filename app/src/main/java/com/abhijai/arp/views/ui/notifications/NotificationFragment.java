package com.abhijai.arp.views.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.models.NotificationModel;

import java.util.ArrayList;

public class NotificationFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<NotificationModel> notificationModelArrayList = new ArrayList<>();
    private NotificationRecyclerAdapter notificationRecyclerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_notification, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_notification);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        populateNotificationModel();
    }

    private void populateNotificationModel(){
        NotificationModel model1 = new NotificationModel("Chirag has shown interest in java job.","1/2/2020");
        NotificationModel model2 = new NotificationModel("Arun is selected for Android in V5/Global.","7/2/2020");
        NotificationModel model3 = new NotificationModel("Rohit is not interested for the Gurgaon Location.","13/1/2020");
        NotificationModel model4 = new NotificationModel("Nirbhay is coming for the Machine Learning interview.","22/2/2020");
        notificationModelArrayList.add(model1);
        notificationModelArrayList.add(model2);
        notificationModelArrayList.add(model3);
        notificationModelArrayList.add(model4);
        notificationRecyclerAdapter = new NotificationRecyclerAdapter(notificationModelArrayList);
        recyclerView.setAdapter(notificationRecyclerAdapter);
    }
}
