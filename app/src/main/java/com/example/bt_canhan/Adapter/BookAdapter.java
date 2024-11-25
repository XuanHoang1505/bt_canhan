package com.example.bt_canhan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bt_canhan.Book;
import com.example.bt_canhan.R;

import java.util.List;

public class BookAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Book> arraylist;

    public BookAdapter(Context context, int layout, List<Book> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);
        Book cn=arraylist.get(i);
        ImageView img=view.findViewById(R.id.img);
        TextView title =view.findViewById(R.id.title);
        TextView content=view.findViewById(R.id.content);

        img.setImageResource(cn.getImage());
        title.setText(cn.getTitle());
        content.setText(cn.getContent());

        return view;
    }
}
