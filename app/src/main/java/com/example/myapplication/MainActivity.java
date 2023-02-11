package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class Factorial {

        public void main(String[] args) {

            int num=10; long factorial =1;
            for(int i = 1; i <= num; ++i)
            {
                // factorial=factorial* i;
                factorial *=i;
            }
            System.out.printf("Factorial of %d = %d", num, factorial);
        }
    }
}