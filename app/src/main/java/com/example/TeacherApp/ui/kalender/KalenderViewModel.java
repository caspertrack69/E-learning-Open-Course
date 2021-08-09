package com.example.TeacherApp.ui.kalender;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KalenderViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public KalenderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Show Calender");
    }

    public LiveData<String> getText() {
        return mText;
    }
}