package com.dragme.vue.draggme.ui.activities;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.dragme.vue.draggme.R;
import com.dragme.vue.draggme.ui.fragments.SlideFragment;


public class MainActivity extends BaseActivity {

    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    SlideFragment slideFragment;
    View drawerFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerFrame =findViewById(R.id.drawer_frame);
        setDimensionsForFragments();
        mDrawerLayout.setDrawerListener(new DrawerHandler());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setDimensionsForFragments() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int margin = (width /100)*30;
        // Resources r = getResources();
        DrawerLayout.LayoutParams layoutParamsForSettings = new DrawerLayout.LayoutParams(width-margin, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParamsForSettings.gravity = Gravity.START;
        drawerFrame.setLayoutParams(layoutParamsForSettings);
    }
    private class DrawerHandler extends ActionBarDrawerToggle {
        DrawerHandler() {
            super(MainActivity.this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close);
        }

        @Override
        public void onDrawerClosed(View drawerView) {
            super.onDrawerClosed(drawerView);
        }

        @Override
        public void onDrawerOpened(View drawerView) {
            super.onDrawerOpened(drawerView);
        }
    }
}
