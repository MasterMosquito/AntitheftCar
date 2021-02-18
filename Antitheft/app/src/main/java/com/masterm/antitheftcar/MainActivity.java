package com.masterm.antitheftcar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int READ_WAIT_MILLIS = 100;
    private static final int WRITE_WAIT_MILLIS = 100;
    private static final byte[] request = new byte[] { (byte)0xe0, 0x4f}; //{ (byte)0xe0, 0x4f} un valore a caso
    private static final byte[] response = new byte[] {(byte)0x00};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
