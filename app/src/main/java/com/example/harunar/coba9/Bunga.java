package com.example.harunar.coba9;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Bunga extends Activity {

    ListView list_bunga;
    String[] itemname ={"Adenium", "Anggrek", "Dahlia", "Geranium", "Lavender", "Bunga Matahari", "Mawar", "Melati", "Bunga Pukul Empat", "Bunga Sepatu"};
    String[] listView ={"Adenium", "Orchid", "Dahlia", "Geranium", "Lavender", "Sunflower", "Rose", "Jasmine", "Four o'clock Flower", "Hibiscus"};

    Integer[] imgid={
            R.drawable.adenium,
            R.drawable.anggrek,
            R.drawable.dahlia,
            R.drawable.geranium,
            R.drawable.lavender,
            R.drawable.matahari,
            R.drawable.mawar,
            R.drawable.melati,
            R.drawable.pukul_empat,
            R.drawable.sepatu
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunga);

        this.setTitle("Bunga (FLower)");

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, listView, imgid);
        list_bunga=(ListView)findViewById(R.id.list_bunga);
        list_bunga.setAdapter(adapter);

        list_bunga.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                int item = position;
                switch (item){
                    case 0:
                        adenium();
                        break;
                    case 1:
                        anggrek();
                        break;
                    case 2:
                        dahlia();
                        break;
                    case 3:
                        geranium();
                        break;
                    case 4:
                        lavender();
                        break;
                    case 5:
                        matahari();
                        break;
                    case 6:
                        mawar();
                        break;
                    case 7:
                        melati();
                        break;
                    case 8:
                        pklempat();
                        break;
                    case 9:
                        sepatu();
                        break;
                }
            }
        });
    }

    public void adenium(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_adenium, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void anggrek(){
        final android.app.AlertDialog.Builder alert1;
        alert1 = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater1 = Bunga.this.getLayoutInflater();
        View dialogView1 = inflater1.inflate(R.layout.pu_bunga_anggrek, null);
        alert1.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert1.setCancelable(false);
        alert1.setInverseBackgroundForced(true);
        alert1.setView(dialogView1);
        alert1.show();
    }

    public void dahlia(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_dahlia, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void geranium(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_geranium, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void lavender(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_lavender, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void matahari(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_matahari, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void mawar(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_mawar, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void melati(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_melati, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pklempat(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_pklempat, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void sepatu(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Bunga.this);
        LayoutInflater inflater = Bunga.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_bunga_sepatu, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }
}
