package com.polamr.recyclerviewex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Rajareddy on 10/12/15.
 */
public class MyAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Item> mItemList;
    private Context mContext;

    public MyAdapter(Context context, List<Item> items) {
        mContext = context;
        mItemList = items;
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        ItemViewHolder viewHolder = new ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int pos) {
        Item feedItem = mItemList.get(pos);

//        //Download image using picasso library
//        Picasso.with(mContext).load(feedItem.getThumbnail())
//                .error(R.drawable.placeholder)
//                .placeholder(R.drawable.placeholder)
//                .into(customViewHolder.imageView);

        //Setting text view title
        holder.tv.setText(Html.fromHtml(feedItem.getTitle()));
    }

    @Override
    public int getItemCount() {
        return (null != mItemList ? mItemList.size() : 0);
    }
}
