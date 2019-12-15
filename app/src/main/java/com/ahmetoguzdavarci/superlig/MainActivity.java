package com.ahmetoguzdavarci.superlig;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView lvTakimlar;
    ArrayList<Takim> takimlar=new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_main);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(getApplicationContext(), menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                Intent i;

                switch (menuItem.getTitle().toString()){
                    case "Ana Sayfa":
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        break;
                    case "Takımlar":
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        break;
                    case "Maçlar":
                        startActivity(new Intent(getApplicationContext(),SecondActivity.class));
                        break;
                }
                return true;
            }
        });

        lvTakimlar=findViewById(R.id.lvTakimlar);
        takimlar.add(new Takim("Alanyaspor","Erol Bulut",R.drawable.alanya));
        takimlar.add(new Takim("Ankaragücü","Mustafa Kaplan",R.drawable.ankaragucu));
        takimlar.add(new Takim("Antalyaspor","Stjepan Tomas",R.drawable.antalya));
        takimlar.add(new Takim("Başakşehir","Okan Buruk",R.drawable.basaksehir));
        takimlar.add(new Takim("Beşiktaş","Abdullah Avcı",R.drawable.besiktas));
        takimlar.add(new Takim("Denizlispor","Mehmet Özdilek",R.drawable.denizli));
        takimlar.add(new Takim("Fenerbahçe","Ersun Yanal",R.drawable.fenerbahce));
        takimlar.add(new Takim("Galatasaray","Fatih Terim",R.drawable.galatasaray));
        takimlar.add(new Takim("Gaziantep","Marius Sumudica",R.drawable.gaziantep));
        takimlar.add(new Takim("Gençlerbirliği","Hamza Hamzaoğlu",R.drawable.genclerbirligi));
        takimlar.add(new Takim("Göztepe","İlhan Palut",R.drawable.goztepe));
        takimlar.add(new Takim("Kasımpaşa","Kemal Özdeş",R.drawable.kasimpasa));
        takimlar.add(new Takim("Kayserispor","Bülent Uygun",R.drawable.kayseri));
        takimlar.add(new Takim("Konyaspor","Aykut Kocaman",R.drawable.konya));
        takimlar.add(new Takim("Yeni Malatyaspor","Sergen Yalçın",R.drawable.malatya));
        takimlar.add(new Takim("Çaykur Rizespor","İsmail Kartal",R.drawable.rize));
        takimlar.add(new Takim("Sivasspor","Rıza Çalımbay",R.drawable.sivas));
        takimlar.add(new Takim("Trabzonspor","Ünal Karaman",R.drawable.trabzon));

        TakimAdapter takimAdapter=new TakimAdapter(takimlar, this);
        lvTakimlar.setAdapter(takimAdapter);

        lvTakimlar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View convertView, int position, long id) {
                Toast.makeText(getApplicationContext(),takimlar.get(position).getTakimAdi(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
