package com.khair.mul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
///==========================================================================================================
        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView=findViewById(R.id.textView);
//==========================================================================================================
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textView.setText("");
               String mystring=editTextNumber.getText().toString();
               if (editTextNumber.length()>0){
                   int myint=Integer.parseInt(mystring);
                  for (int x=1;x<=10;x++){
                      int mul=myint*x;
                      textView.append(myint+" * "+x+"="+mul+"\n");
                  }

               }else {
                   editTextNumber.setError("plaess enter a number");
               }
           }
       });


///===========================================================================








    }
}