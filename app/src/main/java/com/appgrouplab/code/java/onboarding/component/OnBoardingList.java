package com.appgrouplab.code.java.onboarding.component;

import com.appgrouplab.code.java.onboarding.R;

import java.util.ArrayList;

public class OnBoardingList {

    public ArrayList<OnBoardingItem> getList() {
        ArrayList<OnBoardingItem> mList = new ArrayList<OnBoardingItem>();
        mList.add(new OnBoardingItem("Feature 1", "Feature description 1", R.drawable.icons8_1_100));
        mList.add(new OnBoardingItem("Feature 2", "Feature description 2", R.drawable.icons8_2_100));
        mList.add(new OnBoardingItem("Feature 3", "Feature description 3", R.drawable.icons8_3_100));
        return mList;
    }

}
