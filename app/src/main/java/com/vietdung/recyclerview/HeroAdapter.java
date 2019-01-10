package com.vietdung.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
    private List<Hero> mHeroList;
    private Context mContext;

    public HeroAdapter(List<Hero> heroList, Context context) {
        mHeroList = heroList;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTextViewNameHero.setText(mHeroList.get(position).getNameHero());
        holder.mImageViewHero.setImageResource(mHeroList.get(position).getUrlImage());

    }

    @Override
    public int getItemCount() {
        return mHeroList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageViewHero;
        TextView mTextViewNameHero;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageViewHero = itemView.findViewById(R.id.image_hero);
            mTextViewNameHero = itemView.findViewById(R.id.text_name_hero);

        }
    }
}
