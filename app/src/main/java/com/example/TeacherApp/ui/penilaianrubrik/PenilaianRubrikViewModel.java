package com.example.TeacherApp.ui.penilaianrubrik;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PenilaianRubrikViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PenilaianRubrikViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Penilaian Rubrik fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}