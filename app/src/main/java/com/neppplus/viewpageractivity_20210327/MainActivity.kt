package com.neppplus.viewpageractivity_20210327

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpageractivity_20210327.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        뷰페이저 어댑터 + ViewPager 조합
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

//        ViewPager + TabLayout 조합
        myTabLayout.setupWithViewPager(mainViewPager)


    }
}