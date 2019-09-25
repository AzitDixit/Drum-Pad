package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;
    private int sound13;
    private int sound14;
    private int sound15;
    private int sound16;
    private int sound17;
    private int sound18;
    private int sound19;
    private int sound20;
    private int sound21;
    private int sound22;
    private int sound23;
    private int sound24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1=sp.load(getApplicationContext(),R.raw.sound1,1);
        sound2=sp.load(getApplicationContext(),R.raw.sound2,1);
        sound3=sp.load(getApplicationContext(),R.raw.sound3,1);
        sound4=sp.load(getApplicationContext(),R.raw.sound4,1);
        sound5=sp.load(getApplicationContext(),R.raw.sound5,1);
        sound6=sp.load(getApplicationContext(),R.raw.sound6,1);
        sound7=sp.load(getApplicationContext(),R.raw.sound7,1);
        sound8=sp.load(getApplicationContext(),R.raw.sound8,1);
        sound9=sp.load(getApplicationContext(),R.raw.sound9,1);
        sound10=sp.load(getApplicationContext(),R.raw.sound10,1);
        sound11=sp.load(getApplicationContext(),R.raw.sound11,1);
        sound12=sp.load(getApplicationContext(),R.raw.sound12,1);
        sound13=sp.load(getApplicationContext(),R.raw.sound13,1);
        sound14=sp.load(getApplicationContext(),R.raw.sound14,1);
        sound15=sp.load(getApplicationContext(),R.raw.sound15,1);
        sound16=sp.load(getApplicationContext(),R.raw.sound16,1);
        sound17=sp.load(getApplicationContext(),R.raw.sound17,1);
        sound18=sp.load(getApplicationContext(),R.raw.sound18,1);
        sound19=sp.load(getApplicationContext(),R.raw.sound19,1);
        sound20=sp.load(getApplicationContext(),R.raw.sound20,1);
        sound21=sp.load(getApplicationContext(),R.raw.sound21,1);
        sound22=sp.load(getApplicationContext(),R.raw.sound22,1);
        sound23=sp.load(getApplicationContext(),R.raw.sound23,1);
        sound24=sp.load(getApplicationContext(),R.raw.sound24,1);

    }

    public void playsound1(View view) {
        sp.play(sound1,1.0f,1.0f,0,1,10f);
    }

    public void playsound2(View view) {
        sp.play(sound2,1.0f,1.0f,0,0,10f);
    }

    public void playsound3(View view) {
        sp.play(sound3,1.0f,1.0f,0,0,10f);
    }

    public void playsound4(View view) {
        sp.play(sound4,1.0f,1.0f,0,0,10f);
    }

    public void playsound5(View view) {
        sp.play(sound5,1.0f,1.0f,0,0,10f);
    }

    public void playsound6(View view) {
        sp.play(sound6,1.0f,1.0f,0,0,10f);
    }

    public void playsound7(View view) {
        sp.play(sound7,1.0f,1.0f,0,0,10f);
    }

    public void playsound8(View view) {
        sp.play(sound8,1.0f,1.0f,0,0,10f);
    }

    public void playsound9(View view) {
        sp.play(sound9,1.0f,1.0f,0,0,10f);
    }

    public void playsound10(View view) {
        sp.play(sound10,1.0f,1.0f,0,0,10f);
    }

    public void playsound11(View view) {
        sp.play(sound11,1.0f,1.0f,0,0,10f);
    }

    public void playsound12(View view) {
        sp.play(sound12,1.0f,1.0f,0,0,10f);
    }

    public void playsound13(View view) {
        sp.play(sound13,1.0f,1.0f,0,1,10f);
    }

    public void playsound14(View view) {
        sp.play(sound14,1.0f,1.0f,0,0,10f);
    }

    public void playsound15(View view) {
        sp.play(sound15,1.0f,1.0f,0,0,10f);
    }

    public void playsound16(View view) {
        sp.play(sound16,1.0f,1.0f,0,0,10f);
    }

    public void playsound17(View view) {
        sp.play(sound17,1.0f,1.0f,0,0,10f);
    }

    public void playsound18(View view) {
        sp.play(sound18,1.0f,1.0f,0,0,10f);
    }

    public void playsound19(View view) {
        sp.play(sound19,1.0f,1.0f,0,0,10f);
    }

    public void playsound20(View view) {
        sp.play(sound20,1.0f,1.0f,0,0,10f);
    }

    public void playsound21(View view) {
        sp.play(sound21,1.0f,1.0f,0,0,10f);
    }

    public void playsound22(View view) {
        sp.play(sound22,1.0f,1.0f,0,0,10f);
    }

    public void playsound23(View view) {
        sp.play(sound23,1.0f,1.0f,0,0,10f);
    }

    public void playsound24(View view) {
        sp.play(sound24,1.0f,1.0f,0,0,10f);
    }
}




