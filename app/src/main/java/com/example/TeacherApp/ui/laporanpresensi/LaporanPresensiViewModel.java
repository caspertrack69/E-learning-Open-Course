package com.example.TeacherApp.ui.laporanpresensi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LaporanPresensiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LaporanPresensiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Laporan Presensi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}