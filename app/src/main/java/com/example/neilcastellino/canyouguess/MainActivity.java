package com.example.neilcastellino.canyouguess;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void checkRandom(int i, Button button) {
        if (i == randomNumber) {
            button.setBackgroundColor(Color.GREEN);
            Toast.makeText(MainActivity.this, "SECRET number Found!!!", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Congrats!!!", Toast.LENGTH_SHORT).show();
        } else {
            button.setBackgroundColor(Color.RED);
            if (randomNumber < i) {
                Toast.makeText(MainActivity.this, "Number less than " + i, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Number greater than " + i, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void resetApplication(View view) {
        Toast.makeText(MainActivity.this, "New Game Loaded", Toast.LENGTH_SHORT).show();

        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        Button button3 = (Button) findViewById(R.id.btn3);
        Button button4 = (Button) findViewById(R.id.btn4);
        Button button5 = (Button) findViewById(R.id.btn5);
        Button button6 = (Button) findViewById(R.id.btn6);
        Button button7 = (Button) findViewById(R.id.btn7);
        Button button8 = (Button) findViewById(R.id.btn8);
        Button button9 = (Button) findViewById(R.id.btn9);
        Button button10 = (Button) findViewById(R.id.btn10);
        Button button11 = (Button) findViewById(R.id.btn11);
        Button button12 = (Button) findViewById(R.id.btn12);
        Button button13 = (Button) findViewById(R.id.btn13);
        Button button14 = (Button) findViewById(R.id.btn14);
        Button button15 = (Button) findViewById(R.id.btn15);
        Button button16 = (Button) findViewById(R.id.btn16);
        Button button17 = (Button) findViewById(R.id.btn17);
        Button button18 = (Button) findViewById(R.id.btn18);
        Button button19 = (Button) findViewById(R.id.btn19);
        Button button20 = (Button) findViewById(R.id.btn20);
        button1.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button2.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button3.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button4.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button5.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button6.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button7.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button8.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button9.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button10.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button11.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button12.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button13.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button14.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button15.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button16.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button17.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button18.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button19.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        button20.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
    }

    public void check1(View view) {
        Button button = (Button) findViewById(R.id.btn1);
        checkRandom(1, button);
    }

    public void check2(View view) {
        Button button = (Button) findViewById(R.id.btn2);
        checkRandom(2, button);
    }

    public void check3(View view) {
        Button button = (Button) findViewById(R.id.btn3);
        checkRandom(3, button);
    }

    public void check4(View view) {
        Button button = (Button) findViewById(R.id.btn4);
        checkRandom(4, button);
    }

    public void check5(View view) {
        Button button = (Button) findViewById(R.id.btn5);
        checkRandom(5, button);
    }

    public void check6(View view) {
        Button button = (Button) findViewById(R.id.btn6);
        checkRandom(6, button);
    }

    public void check7(View view) {
        Button button = (Button) findViewById(R.id.btn7);
        checkRandom(7, button);
    }

    public void check8(View view) {
        Button button = (Button) findViewById(R.id.btn8);
        checkRandom(8, button);
    }

    public void check9(View view) {
        Button button = (Button) findViewById(R.id.btn9);
        checkRandom(9, button);
    }

    public void check10(View view) {
        Button button = (Button) findViewById(R.id.btn10);
        checkRandom(10, button);
    }

    public void check11(View view) {
        Button button = (Button) findViewById(R.id.btn11);
        checkRandom(11, button);
    }

    public void check12(View view) {
        Button button = (Button) findViewById(R.id.btn12);
        checkRandom(12, button);
    }

    public void check13(View view) {
        Button button = (Button) findViewById(R.id.btn13);
        checkRandom(13, button);
    }

    public void check14(View view) {
        Button button = (Button) findViewById(R.id.btn14);
        checkRandom(14, button);
    }

    public void check15(View view) {
        Button button = (Button) findViewById(R.id.btn15);
        checkRandom(15, button);
    }

    public void check16(View view) {
        Button button = (Button) findViewById(R.id.btn16);
        checkRandom(16, button);
    }

    public void check17(View view) {
        Button button = (Button) findViewById(R.id.btn17);
        checkRandom(17, button);
    }

    public void check18(View view) {
        Button button = (Button) findViewById(R.id.btn18);
        checkRandom(18, button);
    }

    public void check19(View view) {
        Button button = (Button) findViewById(R.id.btn19);
        checkRandom(19, button);
    }

    public void check20(View view) {
        Button button = (Button) findViewById(R.id.btn20);
        checkRandom(20, button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

        Toast.makeText(MainActivity.this, "Guess the SECRET number by clicking on it", Toast.LENGTH_SHORT).show();
    }
}
