package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {


        public static void displayToast(Context c, String message){

            Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

        }
        public static void helloWorld(String message){
            System.out.println("Hello"+message);
        }
}
