package com.example.TeacherApp.ui.cadangkandata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CadangkanDataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CadangkanDataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Cadangkan Data fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}