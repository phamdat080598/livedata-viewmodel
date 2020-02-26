package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmode.DataViewMode;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListene
    private DataViewMode dataMode;
    private Handler handler;
//    private TextView textView;
//    private Button btnTang,btnGiam;
    private Lifecycle lifecycle;
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        dataMode = ViewModelProviders.of(this).get(DataViewMode.class);
        handler = new Handler();

        mainBinding.setDataviewmode(dataMode);
//        mainBinding.setLifecycleOwner(this);

//        textView = findViewById(R.id.data);
//        btnTang = findViewById(R.id.btnTang);
////        btnGiam = findViewById(R.id.btnGiam);
////
////        btnTang.setOnClickListener(this);
////        btnGiam.setOnClickListener(this);

        initData();
        mainBinding.setHandler(handler);

    }

    private void initData() {
//        textView.setText(String.valueOf(dataMode.getDiem()));
        dataMode.getDiem().setValue(dataMode.getDiem().getValue());

        dataMode.getDiem().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
//                textView.setText(String.valueOf(integer));
                mainBinding.data.setText(String.valueOf(integer));
            }
        });
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.btnTang:
//                dataMode.getDiem().setValue(dataMode.getDiem().getValue()+1);
////                textView.setText(String.valueOf(dataMode.getDiem()));
//                break;
//            case R.id.btnGiam:
//                dataMode.getDiem().setValue(dataMode.getDiem().getValue()-1);
////                textView.setText(String.valueOf(dataMode.getDiem()));
//                break;
//        }
//    }
}
