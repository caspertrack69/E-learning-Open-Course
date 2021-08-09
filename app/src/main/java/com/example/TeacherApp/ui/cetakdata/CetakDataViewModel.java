package com.example.TeacherApp.ui.cetakdata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CetakDataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CetakDataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Kalender fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}