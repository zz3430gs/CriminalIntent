package com.example.joe.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Joe on 12/6/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
