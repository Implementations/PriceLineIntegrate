package com.kanishk.pricelinehack.event;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.priceline.SearchFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventFragment fragment = new EventFragment();
        getSupportFragmentManager().beginTransaction().
                add(R.id.search_fragment_container, fragment).commit();
    }
}
