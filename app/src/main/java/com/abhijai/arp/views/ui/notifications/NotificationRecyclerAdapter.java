package com.abhijai.arp.views.ui.notifications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abhijai.arp.R;
import com.abhijai.arp.models.NotificationModel;

import java.util.ArrayList;

public class NotificationRecyclerAdapter extends RecyclerView.Adapter<NotificationRecyclerAdapter.MyNotificationView>
{
    private ArrayList<NotificationModel> notificationModelArrayList = new ArrayList<>();
    public NotificationRecyclerAdapter(ArrayList<NotificationModel> arrayList){
        notificationModelArrayList = arrayList;
    }

    @NonNull
    @Override
    public MyNotificationView onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_row,null);
        return new MyNotificationView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyNotificationView holder, int position) {
        holder.populateNotificationViewRow(notificationModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return notificationModelArrayList.size();
    }

    class MyNotificationView extends RecyclerView.ViewHolder
    {
        private TextView textViewNotificationMessage;
        private TextView textViewDate;
        public MyNotificationView(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.tv_notificationDate);
            textViewNotificationMessage = itemView.findViewById(R.id.tv_notificationMessage);
        }

        private void populateNotificationViewRow(NotificationModel model){
            textViewDate.setText(model.getNotificationDate());
            textViewNotificationMessage.setText(model.getNotificationMessage());
        }
    }
}
