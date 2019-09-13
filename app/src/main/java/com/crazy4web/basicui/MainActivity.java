package com.crazy4web.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    public class Card
    {
        private int type, value;
        private String[] cardType = {"Clubs", "Spades", "Diamonds", "Hearts"};
        private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
                "9", "8", "7", "6", "5", "4", "3", "2"};

        public Card(int types, int values)
        {
            type = types;
            value = values;
        }


        public String toString()
        {
            String finalCard = cardValue[value] + " of " + cardType[type];

            return finalCard;

        }

        public String Count(int count){



            return " "+count;



        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                       Button btn = this.findViewById(R.id.button3);


        btn.setOnClickListener(new View.OnClickListener() {




                            int i = 51;
                           @Override
                           public void onClick(View view) {




                               TextView text = findViewById(R.id.textView2);


                               Random cardvalue = new Random();


                               int one=cardvalue.nextInt(3);
                               int two=cardvalue.nextInt(11);

                               Card abc = new Card(one, two);


//                               int cardname = cardvalue.nextInt();
//                               int card
//



                               text.setText(abc.toString());




                               TextView txt4 = findViewById(R.id.textView4);



                               if(i>0) {


                                   txt4.setText(abc.Count(i));
                                   i--;




                               }

                               else if(i==0){
                                   i=52;
                                   txt4.setText(abc.Count(i));
                               }


                           }
                       });

//
//                       Button btn2 = this.findViewById(R.id.button2);
//
//
//                       btn2.setOnClickListener(new View.OnClickListener() {
//                           @Override
//                           public void onClick(View view) {
//
//                               TextView text = findViewById(R.id.textView);
//
//                               text.setText("Try Again");
//                           }
//                       });
//

    }
}
