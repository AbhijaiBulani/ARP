package com.abhijai.arp.views.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.abhijai.arp.R;
import com.abhijai.arp.models.NotificationModel;

public class NotificationFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_notification, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        return root;
    }

    private void populateNotificationModel(){
        NotificationModel model1 = new NotificationModel("Avinash has shown interest in java job.","1/2/2020");
    }
}
