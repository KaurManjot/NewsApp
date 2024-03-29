package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = convertView.findViewById(R.id.news_title);
        titleView.setText(currentNews.getTitle());

        // Find the TextView with view ID section
        TextView sectionView = convertView.findViewById(R.id.news_section);
        sectionView.setText(currentNews.getSection());

        // Find the TextView with view ID publication date
        TextView publicationDateView = convertView.findViewById(R.id.date);
        publicationDateView.setText(currentNews.getPublicationDate().substring(0,10));

        // Find the TextView with view ID author
        TextView authorView = convertView.findViewById(R.id.news_author);
        authorView.setText(currentNews.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return convertView;
    }
}
