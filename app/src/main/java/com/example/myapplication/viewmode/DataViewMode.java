package com.example.myapplication.viewmode;

import android.app.Application;
import android.database.Observable;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataViewMode extends AndroidViewModel {
    private MutableLiveData<Integer> diem= new MutableLiveData<>();
//    public ObservableField<Integer> diem1 = new ObservableField<>();//cập nhật realtime khi diem1 đổi dữ liệu
    public DataViewMode(@NonNull Application application) {
        super(application);
//        diem.setValue(0);
//        diem1.set(0);
    }


    public MutableLiveData<Integer> getDiem() {
        return diem;
    }

//    public ObservableField<Integer> getDiem1() {
//        return diem1;
//    }

    public void setDiem(MutableLiveData<Integer> diem) {
        this.diem = diem;
    }


}
