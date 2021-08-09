package com.example.TeacherApp.ui.presensi;

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

public class PresensiFragment extends Fragment {

    private PresensiViewModel presensiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        presensiViewModel =
                ViewModelProviders.of(this).get(PresensiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_presensi, container, false);
        final TextView textView = root.findViewById(R.id.text_Presensi);
        presensiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}