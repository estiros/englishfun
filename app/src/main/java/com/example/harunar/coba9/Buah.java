package com.example.harunar.coba9;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Buah extends Activity {

    ListView list_buah;
    String[] itemname ={"Anggur", "Apel", "Ceri", "Durian", "Mangga", "Manggis", "Nanas", "Pepaya", "Pisang", "Semangka"};
    String[] listView ={"Grape", "Apple", "Cherry", "Durian", "Mango", "Mangosteen", "Pineapple", "Papaya", "Banana", "Watermelon"};

    Integer[] imgid={
            R.drawable.anggur,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.mangga,
            R.drawable.manggis,
            R.drawable.nanas,
            R.drawable.pepaya,
            R.drawable.pisang,
            R.drawable.semangka
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        this.setTitle("Buah (Fruit)");

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, listView, imgid);
        list_buah=(ListView)findViewById(R.id.list_buah);
        list_buah.setAdapter(adapter);

        list_buah.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                int item = position;
                switch (item){
                    case 0:
                        anggur();
                        break;
                    case 1:
                        apel();
                        break;
                    case 2:
                        ceri();
                        break;
                    case 3:
                        durian();
                        break;
                    case 4:
                        mangga();
                        break;
                    case 5:
                        manggis();
                        break;
                    case 6:
                        nanas();
                        break;
                    case 7:
                        pepaya();
                        break;
                    case 8:
                        pisang();
                        break;
                    case 9:
                        semangka();
                        break;
                }
            }
        });
    }

    public void anggur(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_anggur, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void apel(){
        final android.app.AlertDialog.Builder alert1;
        alert1 = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater1 = Buah.this.getLayoutInflater();
        View dialogView1 = inflater1.inflate(R.layout.pu_buah_apel, null);
        alert1.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert1.setCancelable(false);
        alert1.setInverseBackgroundForced(true);
        alert1.setView(dialogView1);
        alert1.show();
    }

    public void ceri(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_ceri, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void durian(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_durian, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void mangga(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_mangga, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void manggis(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_manggis, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void nanas(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_nanas, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pepaya(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_pepaya, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pisang(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_pisang, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void semangka(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Buah.this);
        LayoutInflater inflater = Buah.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_buah_semangka, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }
}
