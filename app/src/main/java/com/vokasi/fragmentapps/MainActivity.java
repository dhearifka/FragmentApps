package com.vokasi.fragmentapps;

import android.app.Fragment;
import android.graphics.pdf.PdfDocument;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{
    //inisialisasi TabLayout dan ViewPager
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0); //menghilangkan shadow di ActionBar

        //tabLayout dan viewPager
        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.pager);

        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
        tabLayout.addTab(tabLayout.newTab().setText("STATUS"));
        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));

        PagerAdapter adapter=new PagerAdapter(
            getSupportFragmentManager(),
            tabLayout.getTabCount()
        );
            viewPager.setAdapter(adapter);
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { //kalau 2.3 ke bawah add ganti set
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void OnFragmentInteraction(String hasil) {

    }
}

