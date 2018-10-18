package com.example.giuliozausa.ev3droiddirect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.giuliozausa.ev3droid.EV3;
import com.giuliozausa.ev3droid.android.AndroidBluetoothConnector;

public class MainActivity extends AppCompatActivity {

    private EV3 ev3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ev3 = new EV3(new AndroidBluetoothConnector());

        final Button button = findViewById(R.id.pollButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ev3.soundTone(1, 440, 100);
            }
        });
    }
}
