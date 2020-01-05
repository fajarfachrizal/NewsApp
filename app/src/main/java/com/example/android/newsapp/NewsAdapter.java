package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fajar Fachrizal on 20.07.2017.
 */


public class NewsAdapter extends ArrayAdapter<News> {

    /** create new (@link NewsAdapter)
     * @param context
     */
    public NewsAdapter(Context context) {
        super(context, -1, new ArrayList<News>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.list_news, parent, false);
        }
        TextView title = (TextView) convertView.findViewById(R.id.news_title);
        TextView author = (TextView) convertView.findViewById(R.id.news_author);
        TextView date = (TextView) convertView.findViewById(R.id.date_update);
        TextView category = (TextView) convertView.findViewById(R.id.news_category);

        News currentNews = getItem(position);
        date.setText(currentNews.getmDate());
        title.setText(currentNews.getmTitle());
        author.setText(currentNews.getmAuthor());
        category.setText(currentNews.getmCategory());

        return convertView;
    }
}
