package id.ac.poliban.mi.fenia.aplikasilistviewkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> Nama = new ArrayList<>();

    {
        Nama.add("Eko");
        Nama.add("Fenia");
        Nama.add("Singapore");
        Nama.add("Italia");
        Nama.add("Inggris");
        Nama.add("Belanda");
        Nama.add("Argentina");
        Nama.add("Chile");
        Nama.add("Mesir");
    }
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Uganda");
        countries.add("Palestina");
        countries.add("India");
        countries.add("Hongkong");
        countries.add("Taiwan");
        countries.add("Thailand");
        countries.add("Bangladesh");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
