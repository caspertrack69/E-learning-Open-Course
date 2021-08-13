package com.example.TeacherApp.ui.logout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.TeacherApp.DatabaseHelper;
import com.example.TeacherApp.LoginActivity;
import com.example.TeacherApp.R;

public class LogoutFragment extends Fragment {
    DatabaseHelper db;
    Button logout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_logout);
        View view = inflater.inflate(R.layout.fragment_logout, container, false);
        db = new DatabaseHelper(getActivity());

        logout = (Button) view.findViewById(R.id.btn_logout);


        Boolean checkSession = db.checkSession("ada");
        if (checkSession == false) {
            Intent loginIntent = new Intent(getActivity(), LoginActivity.class);
            startActivity(loginIntent);
            onStop();
        }

        // logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean updtSession = db.upgradeSession("kosong", 1);
                if (updtSession == true) {
                    Toast.makeText(getActivity().getApplicationContext(), "Berhasil Keluar", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(loginIntent);
                    onStop();
                }
            }
        });
        return view;
    }
}
