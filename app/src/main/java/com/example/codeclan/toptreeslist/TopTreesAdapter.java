package com.example.codeclan.toptreeslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fraserblack on 19/12/2017.
 */

public class TopTreesAdapter extends ArrayAdapter<Tree> {

    public TopTreesAdapter(Context context, ArrayList<Tree> trees) {
        super(context, 0, trees);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.trees_item, parent, false);
        }

        Tree currentTree = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTree.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.name);
        title.setText(currentTree.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.age);
        year.setText(currentTree.getYear().toString());

        listItemView.setTag(currentTree);
        return listItemView;
    }
}
