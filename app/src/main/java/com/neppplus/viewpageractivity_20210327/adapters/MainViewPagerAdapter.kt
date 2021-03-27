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

//        리턴을 하는데 -> position 값에 따라 다른 결과가 리턴되도록 하는 코틀린 문법 예시

        return when(position) {
            0 -> "인사"
            1 -> "자기소개"
            else -> "하고싶은말"
       }
    }

    override fun getItem(position: Int): Fragment {

//        position의 값에 따라 다른 Fragment를 리턴할거야

        return when(position) {
            0 -> Page1Fragment()
            1 -> Page2Fragment()
            else -> Page3Fragment()
        }

    }

    override fun getCount(): Int {
       return 3
    }
}