package com.example.TeacherApp.ui.cadangkandata;

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

public class CadangkanDataFragment extends Fragment {

    private CadangkanDataViewModel cadangkanDataViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cadangkanDataViewModel =
                ViewModelProviders.of(this).get(CadangkanDataViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cadangkandata, container, false);
        final TextView textView = root.findViewById(R.id.text_CadangkanData);
        cadangkanDataViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}