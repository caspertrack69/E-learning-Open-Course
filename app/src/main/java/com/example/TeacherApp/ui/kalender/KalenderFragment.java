package com.example.TeacherApp.ui.kalender;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.TeacherApp.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class KalenderFragment extends Fragment  {
    private static final String TAG = "DatePickerFragment";
    final Calendar c = Calendar.getInstance();
    private DatePickerDialog datePickerDialog2;
    private SimpleDateFormat dateFormatter2;
    Button btn;
    TextView txt1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kalender, container, false);

        btn = view.findViewById(R.id.btncal);
        txt1 = view.findViewById(R.id.textView);
        dateFormatter2 = new SimpleDateFormat("dd - MM - yyyy", Locale.US);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog2();
            }
        });

        return view;
    }

    private void showDateDialog2(){
        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog2 = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                txt1.setText(""+dateFormatter2.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog2.show();
    }
}