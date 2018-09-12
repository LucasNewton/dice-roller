package com.example.diceroll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textViewDice;
    private Random rng = new Random();
    private MediaPlayer MP1 = new MediaPlayer();
    private MediaPlayer MP20 = new MediaPlayer();
    private MediaPlayer MPRole = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        textViewDice = findViewById(R.id.text_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
        MP1 = MediaPlayer.create(this, R.raw.fail_buzzer);
        MP20 = MediaPlayer.create(this, R.raw.success_sound);
        MPRole = MediaPlayer.create(this, R.raw.dice_roll_sound);
    }

    private void rollDice()
    {
        int randNum = rng.nextInt(20) + 1;

        textViewDice.setText("");

        if (randNum == 1)
        {
            imageViewDice.setImageResource(R.drawable.role1);
            textViewDice.setText(getString(R.string.miss_role));
            MP1.start();
        }
        else if (randNum == 20)
        {
            imageViewDice.setImageResource(R.drawable.role12);
            textViewDice.setText(getString(R.string.hit_role));
            MP20.start();
        }
        else {
            MPRole.start();
        }
        if (randNum == 2)
        {
            imageViewDice.setImageResource(R.drawable.role2);
        }
        else if (randNum == 3)
        {
            imageViewDice.setImageResource(R.drawable.role3);
        }
        else if (randNum == 4)
        {
            imageViewDice.setImageResource(R.drawable.role4);
        }
        else if (randNum == 5)
        {
            imageViewDice.setImageResource(R.drawable.role5);
        }
        else if (randNum == 6)
        {
            imageViewDice.setImageResource(R.drawable.role6);
        }
        else if (randNum == 7)
        {
            imageViewDice.setImageResource(R.drawable.role7);
        }
        else if (randNum == 8)
        {
            imageViewDice.setImageResource(R.drawable.role8);
        }
        else if (randNum == 9)
        {
            imageViewDice.setImageResource(R.drawable.role9);
        }
        else if (randNum == 10)
        {
            imageViewDice.setImageResource(R.drawable.role10);
        }else if (randNum == 11)
        {
            imageViewDice.setImageResource(R.drawable.role11);
        }else if (randNum == 12)
        {
            imageViewDice.setImageResource(R.drawable.role13);
        }
        else if (randNum == 13)
        {
            imageViewDice.setImageResource(R.drawable.role14);
        }
        else if (randNum == 14)
        {
            imageViewDice.setImageResource(R.drawable.role15);
        }
        else if (randNum == 15)
        {
            imageViewDice.setImageResource(R.drawable.role16);
        }
        else if (randNum == 16)
        {
            imageViewDice.setImageResource(R.drawable.role17);
        }
        else if (randNum == 17)
        {
            imageViewDice.setImageResource(R.drawable.role18);
        }
        else if (randNum == 18)
        {
            imageViewDice.setImageResource(R.drawable.role19);
        }
        else if (randNum == 19) {
            imageViewDice.setImageResource(R.drawable.role20);
        }
    }
}
