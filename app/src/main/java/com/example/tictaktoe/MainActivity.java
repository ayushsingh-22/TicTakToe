package com.example.tictaktoe;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button abt1, abt2, abt3, abt4, abt5, abt6, abt7, abt8, abt9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0; int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

       abt1= findViewById(R.id.bt1);  abt2 = findViewById(R.id.bt2);
       abt3 = findViewById(R.id.bt3); abt4 = findViewById(R.id.bt4);
        abt5 = findViewById(R.id.bt5); abt6 = findViewById(R.id.bt6);
        abt7 = findViewById(R.id.bt7); abt8 = findViewById(R.id.bt8);
        abt9 = findViewById(R.id.bt9); }

    public void process(View view)
    {
            Button btc = (Button) view;

            if(btc.getText().toString().equals("")) {

                count++;
                if (flag == 0) {
                    btc.setText("X");
                    flag = 1;
                } else {
                    btc.setText("O");
                    flag = 0;
                }

                if (count >=5) {
                    b1 = abt1.getText().toString();
                    b2 = abt2.getText().toString();
                    b3 = abt3.getText().toString();
                    b4 = abt4.getText().toString();
                    b5 = abt5.getText().toString();
                    b6 = abt6.getText().toString();
                    b7 = abt7.getText().toString();
                    b8 = abt8.getText().toString();
                    b9 = abt9.getText().toString();


                    if (b1.equals(b2) && b2.equals(b3) && !b3.equals("")) {
                        Toast.makeText(this, "Winner --> " + b1, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        Toast.makeText(this, "Winner --> " + b4, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b7.equals(b8) && b8.equals(b9) && !b8.equals("")) {
                        Toast.makeText(this, "Winner --> " + b7, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                        Toast.makeText(this, "Winner --> " + b1, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        Toast.makeText(this, "Winner --> " + b2, Toast.LENGTH_SHORT).show();
                        newgame();
                    }else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        Toast.makeText(this, "Winner --> " + b3, Toast.LENGTH_SHORT).show();
                        newgame();
                    }
                    else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                        Toast.makeText(this, "Winner --> " + b9, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                        Toast.makeText(this, "Winner --> " + b3, Toast.LENGTH_SHORT).show();
                        newgame();
                    } else if (count == 9) {
                        Toast.makeText(this, "GAMME DRAW", Toast.LENGTH_SHORT).show();
                        newgame();

                    }
                }

            }
    }
    public void newgame()
    {
       abt1.setText("");
       abt2.setText("");
       abt3.setText("");
       abt4.setText("");
       abt5.setText("");
       abt6.setText("");
       abt7.setText("");
       abt8.setText("");
       abt9.setText("");
       flag = 0;
       count = 0; }
}