package com.example.task1;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] price = {5,100,20,66,16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        int[] result = decryptData(price, discount, offset, readLength);
    }

    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 99) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
        int counter = 0;
        int[] result = new int[readLength];
        for(int i = offset; i < price.length; i++ ){
            result[counter] = (price[i] * discount / 100);
            counter++;
            if(counter == readLength)
                break;
        }
        return result;
    }
}