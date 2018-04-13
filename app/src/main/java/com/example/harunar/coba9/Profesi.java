package com.example.harunar.coba9;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Profesi extends Activity {

    ListView list_profesi;
    String[] itemname ={"Arsitek", "Dokter", "Guru", "Koki", "Pelukis", "Pengacara", "Penyanyi", "Penari", "Pilot", "Polisi"};
    String[] listView ={"Architect", "Doctor", "Teacher", "Chef", "Painter", "Lawyer", "Singer", "Dancer", "Pilot", "Police"};

    Integer[] imgid={
            R.drawable.arsitek,
            R.drawable.dokter,
            R.drawable.guru,
            R.drawable.koki,
            R.drawable.pelukis,
            R.drawable.pengacara,
            R.drawable.penyanyi,
            R.drawable.penari,
            R.drawable.pilot,
            R.drawable.polisi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesi);

        this.setTitle("Profesi (Profession)");

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, listView, imgid);
        list_profesi=(ListView)findViewById(R.id.list_profesi);
        list_profesi.setAdapter(adapter);

        list_profesi.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                int item = position;
                switch (item){
                    case 0:
                        arsitektur();
                        break;
                    case 1:
                        dokter();
                        break;
                    case 2:
                        guru();
                        break;
                    case 3:
                        koki();
                        break;
                    case 4:
                        pelukis();
                        break;
                    case 5:
                        pengacara();
                        break;
                    case 6:
                        penyanyi();
                        break;
                    case 7:
                        penari();
                        break;
                    case 8:
                        pilot();
                        break;
                    case 9:
                        polisi();
                        break;
                }
            }
        });
    }

    public void arsitektur(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_arsitektur, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void dokter(){
        final android.app.AlertDialog.Builder alert1;
        alert1 = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater1 = Profesi.this.getLayoutInflater();
        View dialogView1 = inflater1.inflate(R.layout.pu_profesi_dokter, null);
        alert1.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert1.setCancelable(false);
        alert1.setInverseBackgroundForced(true);
        alert1.setView(dialogView1);
        alert1.show();
    }

    public void guru(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_guru, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void koki(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_koki, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pelukis(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_pelukis, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void penari(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_penari, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pengacara(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_pengacara, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void penyanyi(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_penyanyi, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void pilot(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_pilot, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }

    public void polisi(){
        final android.app.AlertDialog.Builder alert;
        alert = new android.app.AlertDialog.Builder(Profesi.this);
        LayoutInflater inflater = Profesi.this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.pu_profesi_polisi, null);
        alert.setPositiveButton("OK", null);  //This is my Solution to this question(adding OK button)
        alert.setCancelable(false);
        alert.setInverseBackgroundForced(true);
        alert.setView(dialogView);
        alert.show();
    }
}
