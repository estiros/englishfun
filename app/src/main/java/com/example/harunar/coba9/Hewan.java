package com.example.harunar.coba9;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Hewan extends Activity {

    ListView list_hewan;
    String[] itemname ={"Banteng", "Burung Hantu", "Jerapah", "Kambing", "Koala", "Kucing", "Pinguin", "Sapi", "Singa", "Zebra"};
    String[] listView ={"Bull", "Owl", "Giraffe", "Goat", "Koala", "Cat", "Penguin", "Cow", "Lion", "Zebra"};

    Integer[] imgid={
            R.drawable.banteng,
            R.drawable.burunghantu,
            R.drawable.jerapah,
            R.drawable.kambing,
            R.drawable.koala,
            R.drawable.kucing,
            R.drawable.pinguin,
            R.drawable.sapi,
            R.drawable.singa,
            R.drawable.zebra
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        this.setTitle("Hewan (Animal)");

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, listView, imgid);
        list_hewan=(ListView)findViewById(R.id.list_hewan);
        list_hewan.setAdapter(adapter);

        list_hewan.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                int item = position;
                switch (item){
                    case 0:
                        banteng();
                        break;
                    case 1:
                        brghantu();
                        break;
                    case 2:
                        jerapah();
                        break;
                    case 3:
                        kambing();
                        break;
                    case 4:
                        koala();
                        break;
                    case 5:
                        kucing();
                        break;
                    case 6:
                        pinguin();
                        break;
                    case 7:
                        sapi();
                        break;
                    case 8:
                        singa();
                        break;
                    case 9:
                        zebra();
                        break;
                }
            }
        });
    }

    public void banteng(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_banteng, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void brghantu(){
        final android.app.AlertDialog.Builder alert1;
        alert1 = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater1 = Hewan.this.getLayoutInflater();
        View dialogView1 = inflater1.inflate(R.layout.pu_hewan_brghantu, null);
        alert1.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert1.setCancelable(false);
        alert1.setInverseBackgroundForced(true);
        alert1.setView(dialogView1);
        alert1.show();
    }

    public void jerapah(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_jerapah, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void kambing(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_kambing, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void koala(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_koala, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void kucing(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_kucing, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pinguin(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_pinguin, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void sapi(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_sapi, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void singa(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_singa, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void zebra(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Hewan.this);
        LayoutInflater inflater = Hewan.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_hewan_zebra, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }
}
