package com.google.android.evolution;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends ActionBarActivity {

    private ArrayList<Integer> world;
    private int chickenegg = 0;
    private int ostrichegg = 0;
    private int robohamster = 0;
    private int babycat = 0;
//    private TextView tchickenegg = (TextView) findViewById(R.id.chickenegg);
//    private TextView tostrichegg = (TextView) findViewById(R.id.ostrichegg);
//    private TextView trobohamster = (TextView) findViewById(R.id.robohamster);
//   private TextView tbabycat = (TextView) findViewById(R.id.babycat);
//    private ImageView card = (ImageView) findViewById(R.id.card);
    private TextView result;

    private String[] options = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    private HashMap<String, Integer> inventory = new HashMap<String, Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createInventory(options);
        result = (TextView) findViewById(R.id.resulttext);
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

    public void createInventory(String[] in){
        for(String s : in){
            inventory.put(s, 0);
        }

    }
    public void roll(View view){

        getRoll();

//        int r = (int) (Math.random()*20);
//        int animalid = world.get(r);
//        String animal = "";
        result.setText(inventory.toString());
    }
    public void getRoll(){
        int r = (int) (Math.random()*151);
        r = decider(r);
        String result = options[r];
        inventory.put(result, inventory.get(result)+1);
    }
    public static int decider(int in){
        if(in < 30){
            in = 0;
        } else if (in <= 60){
            in = 1;
        } else if (in <= 90){
            in = 2;
        } else if (in <= 105){
            in = 3;
        } else if (in <= 120){
            in = 4;
        } else if (in <= 135){
            in = 5;
        } else if (in <= 140){
            in = 6;
        } else if (in <= 145){
            in = 7;
        } else if (in <= 150){
            in = 8;
        } else {
            in = 9;
        }
        return in;
    }

    public static HashMap<String, Integer> getRollTester(HashMap<String, Integer> inv, String[] opt){
        int r = (int) (Math.random()*152);
        r = decider(r);
        String result = opt[r];
        inv.put(result, inv.get(result)+1);
        return inv;
    }
    public static HashMap<String, Integer> createInventory(HashMap<String, Integer> h, String[] in){
        for(String s : in){
            h.put(s, 0);
        }
        return h;
    }
}
