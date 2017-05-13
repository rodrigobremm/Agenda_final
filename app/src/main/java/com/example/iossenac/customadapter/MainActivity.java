package com.example.iossenac.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Contato> contatoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatoList.add(new Contato("Rodrigo","999876532"));
        contatoList.add(new Contato("Rafael","998789654"));
        contatoList.add(new Contato("Sandra","998898987"));
        contatoList.add(new Contato("Renata","989987654"));
        contatoList.add(new Contato("Felipe","996784321"));


        ContatoAdapter adapter = new ContatoAdapter(contatoList,
                this);

        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(MainActivity.this,contatoList.get(position).getNome(),Toast.LENGTH_SHORT)
                                .show();
                    }
                }
        );


    }


}
