package com.valdesekamdem.library.mdtoastsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.valdesekamdem.library.mdtoast.MDToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//         test changesvcvbvbc zxcvxcvxcvxcvxcvxcvxcvc
//         test changesvcvbvbc zxcvxcvxcvxcvxcvxcvxcvc
//        kajsdhkljashaksh
//        11223344556677889900
//        11223344556677889900
//        11223344556677889900
//        11223344556677889900
//       khan g

    }

    public void showInfoToast(View view) {
        MDToast.makeText(this, "INFO Toast one", MDToast.LENGTH_LONG);
    }

    public void showSuccessToast(View view) {
        MDToast.makeText(this, "This is a SUCCESS Toast", MDToast.LENGTH_LONG, MDToast.TYPE_SUCCESS);
    }

    public void showWarningToast(View view) {
        MDToast.makeText(this, "This is a WARNING Toast", MDToast.LENGTH_LONG, MDToast.TYPE_WARNING);
    }

    public void showErrorToast(View view) {
        MDToast.makeText(this, "This is an ERROR Toast", MDToast.LENGTH_LONG, MDToast.TYPE_ERROR);
    }
}
