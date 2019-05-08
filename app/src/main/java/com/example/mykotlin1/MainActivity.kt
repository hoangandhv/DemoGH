package com.example.mykotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item->
        when(item.itemId){
            R.id.trangchu ->{
                //item.setIcon(R.drawable.tab1_active)
                Log.d("trangchu","Man hinh trang chu")
                replaceFragment(trangchu_Fragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.lichsu ->{
                Log.d("trangchu","Man hinh lich su")
                replaceFragment(lichsu_Fragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.hotro ->{
                Log.d("trangchu","Man hinh ho tro")
                replaceFragment(hotro_Fragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.game ->{
                Log.d("trangchu","Man hinh Game")
                replaceFragment(game_Fragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.taikhoan ->{
                Log.d("trangchu","Man hinh tai khoan")
                replaceFragment(taikhoan_Fragment())
                return@OnNavigationItemSelectedListener true
            }
            else -> return@OnNavigationItemSelectedListener  false
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(trangchu_Fragment())
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        bottomNavigation.setItemIconTintList(null);
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }
}
