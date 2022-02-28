package com.egyptiondev.learnpro;

import androidx.appcompat.app.AlertDialog;
import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText number1,number2;
   TextView myresult ;
   Button myBotton ;
   ImageView imageView;
   AlertDialog.Builder alertDialog;
  private int flag=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fix_activity);
        myBotton = findViewById(R.id.button);
        myresult=findViewById(R.id.textView);
        number1=findViewById(R.id.number_1);
        number2=findViewById(R.id.number_2);
        imageView=findViewById(R.id.imageView2);
        imageView.setVisibility(View.INVISIBLE);
        alertDialog=new AlertDialog.Builder(MainActivity.this);


//        myBotton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!TextUtils.isEmpty(number1.getText().toString()) &&
//                        !TextUtils.isEmpty(number2.getText().toString())
//                ) {
//
//                    double Mynumber1 = Double.parseDouble(number1.getText().toString());
//                    double Mynumber2 = Double.parseDouble(number2.getText().toString());
//                    myresult.setText("result: " + (int) (Mynumber1 + Mynumber2));
//                } else
//                    myresult.setText("من فضلك ادخل الرقم");
//            }
//        });

        myBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  res="";
                    String test="" ;
                if (!TextUtils.isEmpty(number1.getText().toString()) &&
                        !TextUtils.isEmpty(number2.getText().toString())
                ) {

                    double Mynumber1 = Double.parseDouble(number1.getText().toString());
                    double Mynumber2 = Double.parseDouble(number2.getText().toString());
                    imageView.setVisibility(View.INVISIBLE);
                    myresult.setVisibility(View.VISIBLE);

                      res ="result: " + (int) (Mynumber1 + Mynumber2);
                      test=res;
                    myresult.setText(res);
                } else{
                    if (myresult.getText().toString().equals("result"))
                       myresult.setText("من فضلك ادخل الرقم");
                    else if (myresult.getText().toString().equals("من فضلك ادخل الرقم"))
                        myresult.setText("من فضلك ادخل لو سمحت الرقم");
                    else if (myresult.getText().toString().equals("من فضلك ادخل لو سمحت الرقم"))
                        myresult.setText("يا باشا بعد اذنك ادخل الرقم");
                    else if (myresult.getText().toString().equals("يا باشا بعد اذنك ادخل الرقم"))
                        myresult.setText("لا الاه الا الله يابني انا تعبت ");
                    else if (myresult.getText().toString().equals("لا الاه الا الله يابني انا تعبت "))
                    {
//                       moveTaskToBack(true);
//                    android.os.Process.killProcess(android.os.Process.myPid());
//                    System.exit(1);
                        myresult.setVisibility(View.INVISIBLE);
                        imageView.setVisibility(View.VISIBLE);
                        flag=1;


                    }
                    else
                            myresult.setText("من فضلك ادخل الرقم");



                }
            }
        });

    }
//  public void clickSum(View view){
//        if (!TextUtils.isEmpty(number1.getText().toString()) &&
//                !TextUtils.isEmpty(number2.getText().toString())
//        ) {
//
//            double Mynumber1 = Double.parseDouble(number1.getText().toString());
//            double Mynumber2 = Double.parseDouble(number2.getText().toString());
//            myresult.setText("result: " + (int) (Mynumber1 + Mynumber2));
//        }
//
//        }

//  } public void clickSum(View view,View view1){
//        if (!TextUtils.isEmpty(number1.getText().toString()) &&
//                !TextUtils.isEmpty(number2.getText().toString())
//        ) {
//
//            double Mynumber1 = Double.parseDouble(number1.getText().toString());
//            double Mynumber2 = Double.parseDouble(number2.getText().toString());
//            myresult.setText("result: " + (int) (Mynumber1 + Mynumber2));
//        }
//        else{
//            myresult.setText("من فضلك لو سمحت ادخل الرقم");}
//  }

}