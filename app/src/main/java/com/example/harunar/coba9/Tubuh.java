package com.example.harunar.coba9;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Tubuh extends Activity {

    ListView list_tubuh;
    String[] itemname ={"Alis", "Hidung", "Jari", "Kaki", "Kepala", "Mata", "Mulut", "Tangan", "Telinga", "Rambut"};
    String[] listView ={"Eyebrow", "Nose", "Finger", "Foot", "Head", "Eye", "Mouth", "Hand", "Ear", "Hair"};

    Integer[] imgid={
            R.drawable.alis,
            R.drawable.hidung,
            R.drawable.jari,
            R.drawable.kaki,
            R.drawable.kepala,
            R.drawable.mata,
            R.drawable.mulut,
            R.drawable.tangan,
            R.drawable.telinga,
            R.drawable.rambut
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tubuh);

        this.setTitle("Anggota Tubuh (Part of Body)");

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, listView, imgid);
        list_tubuh=(ListView)findViewById(R.id.list_tubuh);
        list_tubuh.setAdapter(adapter);

        list_tubuh.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                int item = position;
                switch (item){
                    case 0:
                        alis();
                        break;
                    case 1:
                        hidung();
                        break;
                    case 2:
                        jari();
                        break;
                    case 3:
                        kaki();
                        break;
                    case 4:
                        kepala();
                        break;
                    case 5:
                        mata();
                        break;
                    case 6:
                        mulut();
                        break;
                    case 7:
                        tangan();
                        break;
                    case 8:
                        telinga();
                        break;
                    case 9:
                        rambut();
                        break;
                }
            }
        });
    }

    public void alis(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_alis, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void hidung(){
        final android.app.AlertDialog.Builder alert1;
        alert1 = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater1 = Tubuh.this.getLayoutInflater();
        View dialogView1 = inflater1.inflate(R.layout.pu_tubuh_hidung, null);
        alert1.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert1.setCancelable(false);
        alert1.setInverseBackgroundForced(true);
        alert1.setView(dialogView1);
        alert1.show();
    }

    public void jari(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_jari, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void kaki(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_kaki, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void kepala(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_kepala, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void mata(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_mata, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void mulut(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_mulut, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void tangan(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_tangan, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void telinga(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_telinga, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void rambut(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Tubuh.this);
        LayoutInflater inflater = Tubuh.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_tubuh_rambut, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }
}
