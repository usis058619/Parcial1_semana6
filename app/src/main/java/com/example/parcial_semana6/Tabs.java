package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.parcial_semana6.Controls.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Tabs extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem ContactsTab, EmailTab, MessagesTab;
    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        linkingComps();
        Button bVolver3 = (Button)findViewById(R.id.bVolver3);

        bVolver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(Tabs.this,Menu.class);
                startActivity(vuelva);
            }
        });

        //**** this code controls the switch fragment******//
        pagerAdapter = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());

        //***** the fragments will show in viewPager*******////
        viewPager.setAdapter(pagerAdapter);

        //******** Click event for tabs*******////
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //******* getting the position to show ******/////
                viewPager.setCurrentItem(tab.getPosition());

                //*** chose what fragment to show ****/

                if (tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //******* ViewPager showing the fragment selected*****////
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    //////////////************Linking components************/////////////////

    private void  linkingComps  (){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pageView);
        ContactsTab = findViewById(R.id.tbContacts);
        EmailTab = findViewById(R.id.tbEmail);
        MessagesTab = findViewById(R.id.tbEmail);
    }
}

