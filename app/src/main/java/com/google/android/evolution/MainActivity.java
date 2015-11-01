package com.google.android.evolution;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private ArrayList<Integer> world;
    private int chickenegg = 0;
    private int ostrichegg = 0;
    private int robohamster = 0;
    private int babycat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createWorld();
    }

    public void createWorld(){
        world = new ArrayList<Integer>();
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(1);
        world.add(2);
        world.add(2);
        world.add(2);
        world.add(2);
        world.add(2);
        world.add(3);
        world.add(3);
        world.add(3);
        world.add(4);
        world.add(4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void roll(View view){
        TextView tchickenegg = (TextView) findViewById(R.id.chickenegg);
        TextView tostrichegg = (TextView) findViewById(R.id.ostrichegg);
        TextView trobohamster = (TextView) findViewById(R.id.robohamster);
        TextView tbabycat = (TextView) findViewById(R.id.babycat);
        ImageView card = (ImageView) findViewById(R.id.card);
        //card.setImageResource(R.drawable.chickenegg);

        int r = (int) (Math.random()*20);
        int animalid = world.get(r);
        String animal = "";
        if(animalid == 1){
            animal = "chikenegg";
            card.setImageResource(R.drawable.chickenegg);
            chickenegg++;
            tchickenegg.setText("Chicken egg: " + chickenegg);
        }
        if(animalid == 2){
            animal = "ostrichegg";
            card.setImageResource(R.drawable.ostrichegg);
            ostrichegg++;
            tostrichegg.setText("Ostrich egg: " + ostrichegg);
        }
        if(animalid == 3){
            animal = "robohamster";
            card.setImageResource(R.drawable.robohamster);
            robohamster++;
            trobohamster.setText("Robohamster: " + robohamster);
        }
        if(animalid == 4){
            animal = "babycat";
            card.setImageResource(R.drawable.babycat);
            babycat++;
            tbabycat.setText("Baby Cat: " + babycat);
        }
//        TextView card = (TextView) findViewById(R.id.card);
//        card.setText("" + animal);
    }
}
