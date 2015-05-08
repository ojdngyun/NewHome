package com.example.oliverng.newhome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder> {

    private String[] mS;
    private Context mContext;
    private int lastPosition = -1;

    public StringAdapter(String[] s, Context context){
        mS = s;
        mContext = context;
    }

    @Override
    public StringViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_strings, parent, false);
        StringViewHolder viewHolder = new StringViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StringViewHolder holder, int position) {
        holder.bindString(mS[position]);

//        setAnimation(holder.container, position);
    }

    @Override
    public int getItemCount() {
        return mS.length;
    }

    public class StringViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.textView) TextView mText;
        @InjectView(R.id.layout) LinearLayout container;

        public StringViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }

        public void bindString(String string){
            mText.setText(string);
        }


    }
    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.entry_animation);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

}
