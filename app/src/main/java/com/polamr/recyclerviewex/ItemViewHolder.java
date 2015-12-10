package com.polamr.recyclerviewex;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rajareddy on 10/12/15.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tv;

    public ItemViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.textView);
    }
}
