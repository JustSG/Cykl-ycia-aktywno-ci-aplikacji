package com.example.losowanie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonLosuj;
    private TextView textViewLiczba;
    private int liczba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("CYKL ZYCIA", "uruchomiono metodę onCreate");
        setContentView(R.layout.activity_main);

        buttonLosuj = findViewById(R.id.buttonLosuj);
        textViewLiczba = findViewById(R.id.textViewLiczba);

        if (savedInstanceState != null) {
            liczba = savedInstanceState.getInt("WYLOSOWANA", 0);
        }
        textViewLiczba.setText(Integer.toString(liczba));

        buttonLosuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liczba = (int) (Math.random() * 100 + 1);
                textViewLiczba.setText(Integer.toString(liczba));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CYKL ZYCIA", "uruchomiono metodę onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL ZYCIA", "uruchomiono metodę onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ZYCIA", "uruchomiono metodę onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ZYCIA", "uruchomiono metodę onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ZYCIA", "uruchomiono metodę onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("WYLOSOWANA", liczba);
        Log.i("CYLK ZYCIA", "uruchomiono metodę onSaveInstanceState");
    }
}