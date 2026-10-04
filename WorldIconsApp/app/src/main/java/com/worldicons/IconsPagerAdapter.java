package com.worldicons;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class IconsPagerAdapter extends FragmentStateAdapter {

    private static final int NUM_TABS = 8;

    public IconsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return IconsFragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}