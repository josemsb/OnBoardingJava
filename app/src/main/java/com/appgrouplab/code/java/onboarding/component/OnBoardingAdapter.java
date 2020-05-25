package com.appgrouplab.code.java.onboarding.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.appgrouplab.code.java.onboarding.R;

import java.util.ArrayList;

public class OnBoardingAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<OnBoardingItem> mList;

    public OnBoardingAdapter(Context context) {
        this.mContext = context;
        this.mList = new OnBoardingList().getList();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup collection, int position) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.content_onboarding, collection, false);

        TextView txtTitle = layout.findViewById(R.id.txtTitle);
        TextView txtDescription = layout.findViewById(R.id.txtDescription);
        ImageView imgView = layout.findViewById(R.id.imgView);

        txtTitle.setText(mList.get(position).getTitle());
        txtDescription.setText(mList.get(position).getDescription());
        imgView.setImageResource(mList.get(position).getImagen());

        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, @NonNull Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
