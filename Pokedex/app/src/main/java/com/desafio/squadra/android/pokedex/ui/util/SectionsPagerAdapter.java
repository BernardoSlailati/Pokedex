package com.desafio.squadra.android.pokedex.ui.util;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.desafio.squadra.android.pokedex.R;
import com.desafio.squadra.android.pokedex.ui.fragment.GeracaoFragment;
import com.desafio.squadra.android.pokedex.ui.fragment.TiposFragment;

import org.jetbrains.annotations.NotNull;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_title_1, R.string.tab_title_2,
            R.string.tab_title_3, R.string.tab_title_4, R.string.tab_title_5, R.string.tab_title_6,
            R.string.tab_title_7, R.string.tab_title_8, R.string.tab_title_9};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return GeracaoFragment.newInstance(position + 1);
            case 8:
                return new TiposFragment();
            default:
                return new Fragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 9;
    }
}