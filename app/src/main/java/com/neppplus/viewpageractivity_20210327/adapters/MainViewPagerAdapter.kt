package com.neppplus.viewpageractivity_20210327.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpageractivity_20210327.fragments.Page1Fragment
import com.neppplus.viewpageractivity_20210327.fragments.Page2Fragment
import com.neppplus.viewpageractivity_20210327.fragments.Page3Fragment

class MainViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {

//    position에 따른 페이지의 제목을 리턴하자

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "인사"
        }
        else if(position == 1) {
            return "자기소개"
        }
        else {
            return "하고싶은말"
        }
    }



    override fun getItem(position: Int): Fragment {

//        position의 값에 따라 다른 Fragment를 리턴할거야

        if (position == 0) {
            return Page1Fragment()
        }
        else if (position == 1) {
            return Page2Fragment()
        }
        else {
            return Page3Fragment()
        }

    }

    override fun getCount(): Int {
       return 3
    }
}