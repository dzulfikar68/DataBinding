package com.example.databinding;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SetLayout extends Fragment {
    View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_layout, null);
        return mRoot;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.init();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.setLayout();
    }

    private void init() {
        this.setLayout();
    }

    private void setLayout() {
        View view = null;
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //            view = mRoot.inflate(R.layout.segment_dettaglio_evento_land, null);
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            //            view = mRoot.inflate(R.layout.segment_dettaglio_evento, null);
        }
        if (orientation == Configuration.ORIENTATION_LANDSCAPE || orientation == Configuration.ORIENTATION_PORTRAIT) {
            ViewGroup viewGroup = (ViewGroup) mRoot.findViewById(R.id.dettaglio_evento_root);
            viewGroup.removeAllViews();
            viewGroup.addView(view, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            this.initComponent();
        }
    }

    private void initComponent() {
//        if (mResult == null)
//            retrieveData();
//        else
//            populateWithDetail();
    }

//    ================================================================================================

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//    ...
//        if (savedInstanceState != null) {
//            fragment = getSupportFragmentManager().getFragment(savedInstanceState, "KEY");
//            changeFragment(fragment, "MY TAG")
//        } else {
//            setupFragment();
//        }
//    ...
//    }


//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        Fragment fragment = getSupportFragmentManager().findFragmentByTag("MY TAG");
//        if (fragment != null) {
//            getSupportFragmentManager().putFragment(outState, "KEY", fragment);
//        }
//    }
}
