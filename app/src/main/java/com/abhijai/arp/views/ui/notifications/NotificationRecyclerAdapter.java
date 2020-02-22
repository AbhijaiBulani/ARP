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

import de.hdodenhof.circleimageview.CircleImageView;

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
        if (position==0){
            holder.circleImageView0.setVisibility(View.VISIBLE);
            holder.circleImageView1.setVisibility(View.GONE);
            holder.circleImageView2.setVisibility(View.GONE);
            holder.circleImageView3.setVisibility(View.GONE);
        }
        else if (position==1){
            holder.circleImageView0.setVisibility(View.GONE);
            holder.circleImageView1.setVisibility(View.VISIBLE);
            holder.circleImageView2.setVisibility(View.GONE);
            holder.circleImageView3.setVisibility(View.GONE);
        }
        else if (position==2){
            holder.circleImageView0.setVisibility(View.GONE);
            holder.circleImageView1.setVisibility(View.GONE);
            holder.circleImageView2.setVisibility(View.VISIBLE);
            holder.circleImageView3.setVisibility(View.GONE);
        }
        else if (position==3){
            holder.circleImageView0.setVisibility(View.GONE);
            holder.circleImageView1.setVisibility(View.GONE);
            holder.circleImageView2.setVisibility(View.GONE);
            holder.circleImageView3.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return notificationModelArrayList.size();
    }

    class MyNotificationView extends RecyclerView.ViewHolder
    {
        private TextView textViewNotificationMessage;
        private TextView textViewDate;
        private CircleImageView circleImageView0;
        private CircleImageView circleImageView1;
        private CircleImageView circleImageView2;
        private CircleImageView circleImageView3;
        public MyNotificationView(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.tv_notificationDate);
            textViewNotificationMessage = itemView.findViewById(R.id.tv_notificationMessage);
            circleImageView0 = itemView.findViewById(R.id.profile_image_notification0);
            circleImageView1 = itemView.findViewById(R.id.profile_image_notification1);
            circleImageView2 = itemView.findViewById(R.id.profile_image_notification2);
            circleImageView3 = itemView.findViewById(R.id.profile_image_notification3);
        }

        private void populateNotificationViewRow(NotificationModel model){
            textViewDate.setText(model.getNotificationDate());
            textViewNotificationMessage.setText(model.getNotificationMessage());
        }
    }
}
