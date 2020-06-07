package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    List<News> mNewsList;

    public NewsAdapter(@NonNull Context context, List<News> newsList) {
        super(context, 0,newsList);
        mNewsList = newsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        News currentNews = mNewsList.get(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        TextView webTitle = (TextView) view.findViewById(R.id.web_title_view);
        webTitle.setText(currentNews.getTitle());

        TextView dateView = (TextView) view.findViewById(R.id.publication_date_view);
        dateView.setText(currentNews.getDate());

        TextView sectionView = (TextView) view.findViewById(R.id.section_view);
        sectionView.setText(currentNews.getSection());

        TextView authorView = (TextView) view.findViewById(R.id.read_more_view);
        authorView.setText(currentNews.getAuthor());

        return view;
    }
}
