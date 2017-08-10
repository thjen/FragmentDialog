package com.example.qthjen.fragmentdialog;

import android.Manifest;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PostGetData {

    Button btShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btShow = (Button) findViewById(R.id.btShow);
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentDialog fragmentDialog = new FragmentDialog();
                fragmentDialog.show(getFragmentManager(), "Tag");
            }
        });

    }

    @Override
    public void DeleteData(boolean delete) {

        if ( delete) {
            Toast.makeText(MainActivity.this, "Is delete", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Is not delete", Toast.LENGTH_SHORT).show();
        }

    }
}
