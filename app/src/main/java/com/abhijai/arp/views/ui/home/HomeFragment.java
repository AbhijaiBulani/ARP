package com.abhijai.arp.views.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.abhijai.arp.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private PieChart pieChart;
    private ArrayList<PieEntry> pieEntryArrayList;

    PieDataSet pieDataSet;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    final int[] MY_COLORS = {Color.parseColor("#00C853"), Color.parseColor("#FF5733")};

    ArrayList<Integer> colors = new ArrayList<Integer>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pieChart = view.findViewById(R.id.pieChart);
        pieEntryArrayList = new ArrayList<>();
        pieEntryArrayList.add(new PieEntry(32.6f,"Achieved"));
        pieEntryArrayList.add(new PieEntry(67.4f,"Target"));
        pieDataSet = new PieDataSet(pieEntryArrayList,"");
        for (int c : MY_COLORS){
            colors.add(c);
        }
        pieDataSet.setColors(colors);
        pieDataSet.setValueTextSize(14f);
        PieData pieData = new PieData(pieDataSet);
        pieChart.setCenterText("Your Performance");
        pieChart.setData(pieData);
        pieChart.animateXY(1700,1700);
    }
}