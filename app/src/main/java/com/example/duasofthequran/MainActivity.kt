package com.example.duasofthequran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dailyDuaFragment = DailyDuaFragment()
        val duaListFragment = DuaListFragment()
        val favDuasFragment = FavouriteDuasFragment()
        if(savedInstanceState == null) { // Initial fragment should be Daily dua
            activateFragment(dailyDuaFragment)
        }
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNavBar.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.nav_todays_dua -> activateFragment(dailyDuaFragment)
                R.id.nav_all_duas -> activateFragment(duaListFragment)
                R.id.nav_fav_duas -> activateFragment(favDuasFragment)
            }
            true
        }
    }


    private fun activateFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv_main_activity, fragment)
            .commit()
    }
}