package com.primawan.pengayaan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    Button tambahTulisan;
    ListView listNama;
    AdapterNama adapterNama;

    ArrayList<String> arrayNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputText = (EditText) findViewById(R.id.editText);
        tambahTulisan = (Button) findViewById(R.id.tambahTulisan);
        listNama = (ListView) findViewById(R.id.listNama);
        arrayNama = new ArrayList<>();
        // adapterNama = new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, arrayNama );
        adapterNama = new AdapterNama(getBaseContext(), arrayNama);
        listNama.setAdapter(adapterNama);
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

    public void addNama(View view) {
        String addNama = (String.valueOf(inputText.getText()));

        arrayNama.add(addNama);
        adapterNama.notifyDataSetChanged();
        for (int i=0;i<arrayNama.size();i++){
            Log.d("MainActivity", arrayNama.get(i));
        }
    }
}
