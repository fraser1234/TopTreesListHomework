package com.example.codeclan.toptreeslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopTreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trees_list);

        TopTrees topTrees = new TopTrees();
        ArrayList<Tree> list = topTrees.getList();

        TopTreesAdapter treeAdapter = new TopTreesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(treeAdapter);
    }
}
