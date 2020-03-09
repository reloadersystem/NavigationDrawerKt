package ar.reloadersystem.swipetabsactivity.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ar.reloadersystem.swipetabsactivity.fragments.AFragment
import ar.reloadersystem.swipetabsactivity.fragments.BFragment
import ar.reloadersystem.swipetabsactivity.fragments.CFragment

class TabsPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(
    fragmentManager
) {
    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return AFragment()
            1 -> return BFragment()
            2 -> return CFragment()
        }
        return null
    }

    override fun getCount(): Int {

        return 3;
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Section ${position + 1}"
    }
}