package com.example.TeacherApp.ui.laporanpresensi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.TeacherApp.R;

public class LaporanPresensiFragment extends Fragment {

    private LaporanPresensiViewModel laporanPresensiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        laporanPresensiViewModel =
                ViewModelProviders.of(this).get(LaporanPresensiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_laporanpresensi, container, false);
        final TextView textView = root.findViewById(R.id.text_laporanpresensi);
        laporanPresensiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}