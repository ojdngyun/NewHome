package com.example.oliverng.newhome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.BrandViewHolder>{

    private Brand[] mBrands;
    private Context mContext;
    private int lastPosition = -1;

    public BrandAdapter(Brand[] brands, Context context){
        mBrands = brands;
        mContext = context;
    }

    @Override
    public BrandViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item_home, viewGroup, false);
        BrandViewHolder viewHolder = new BrandViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BrandViewHolder brandViewHolder, int i) {
        brandViewHolder.bindBrand(mBrands[i]);

       setAnimation(brandViewHolder.container, i);
    }

    @Override
    public int getItemCount() {
        return mBrands.length;
    }

    public class BrandViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.brandImageView) ImageView mBrandImageView;
        @InjectView(R.id.ratingIcon) ImageView mRatingIcon;
        @InjectView(R.id.likesTextView) TextView mLikes;
        @InjectView(R.id.savesTextView) TextView mSaves;
        @InjectView(R.id.locationTextView) TextView mLocation;
        @InjectView(R.id.brandNameTextView) TextView mBrandName;
        @InjectView(R.id.relativeLayout) RelativeLayout container;

        public BrandViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
        }

        public void bindBrand(Brand brand){
            mBrandImageView.setImageResource(brand.getBackgroundId());
            mRatingIcon.setImageResource(brand.getRatingIconId());
            mLikes.setText(brand.getLikes() + "");
            mSaves.setText(brand.getSaves() + "");
            mLocation.setText(brand.getLocation());
            mBrandName.setText(brand.getBrandName());
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
