package com.example.tonghung.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_toast, (ViewGroup) findViewById(R.id
                        .toastRoot));

                TextView tv = (TextView) view.findViewById(R.id.textViewToast);
                tv.setText("Merry Christmas! Noel comming...");

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(view);
                toast.show();
            }
        });
    }
}
