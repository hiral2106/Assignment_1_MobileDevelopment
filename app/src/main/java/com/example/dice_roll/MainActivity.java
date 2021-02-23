package com.example.dice_roll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView computerDice = findViewById(R.id.diceComputer);
        ImageView userDice = findViewById(R.id.diceUser);
        Button higherButton = findViewById(R.id.buttonHigher);
        Button lowerButton = findViewById(R.id.buttonLower);
        TextView winner = findViewById(R.id.textViewWinner);
        int[] diceArray =  {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};


        higherButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //take the action we want to apply the logic
                //Replace number one to pick a left and one for right dice

                Random randomNumber = new Random();
                int topRandom = randomNumber.nextInt(6);
                int bottomRandom = randomNumber.nextInt(6);

                computerDice.setImageResource(diceArray[topRandom]);
                userDice.setImageResource(diceArray[bottomRandom]);
                Log.d("This is a msg", "onClick: I pressed the button");

                if (topRandom<bottomRandom){
                    winner.setText("User win!");
                }
                else if (topRandom>bottomRandom){
                    winner.setText("Computer Wins!");
                }
                else {
                    winner.setText("It's a tie!");
                }
            }

        });

        lowerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //take the action we want to apply the logic
                //Replace number one to pick a left and one for right dice

                Random randomNumber = new Random();
                int topRandom = randomNumber.nextInt(6);
                int bottomRandom = randomNumber.nextInt(6);

                computerDice.setImageResource(diceArray[topRandom]);
                userDice.setImageResource(diceArray[bottomRandom]);
                Log.d("This is a msg", "onClick: I pressed the button");

                if (topRandom>bottomRandom){
                    winner.setText("User win!");
                }
                else if (topRandom<bottomRandom){
                    winner.setText("Computer Wins!");
                }
                else {
                    winner.setText("It's a tie!");
                }
            }

        });

    }
}