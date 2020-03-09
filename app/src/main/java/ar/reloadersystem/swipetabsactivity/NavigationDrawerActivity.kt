package ar.reloadersystem.swipetabsactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ar.reloadersystem.swipetabsactivity.fragments.AFragment
import ar.reloadersystem.swipetabsactivity.fragments.BFragment
import ar.reloadersystem.swipetabsactivity.fragments.CFragment
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import kotlinx.android.synthetic.main.toolbar.*

class NavigationDrawerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

        setSupportActionBar(toolbar)

        navigationView.setNavigationItemSelectedListener {

            it.isChecked = !it.isChecked   // si esta seleccionado o no

            drawerLayout.closeDrawers()

            when (it.itemId) {

                R.id.menuAndroid -> changeFragment(0)
                R.id.menuAndroidBug -> changeFragment(1)
                R.id.menuAndroidHelp -> changeFragment(2)


            }


            return@setNavigationItemSelectedListener true
        }
    }

    private fun changeFragment(position: Int) {
        var fragment: Fragment? = null

        when (position) {

            0 -> fragment = AFragment()
            1 -> fragment = BFragment()
            2 -> fragment = CFragment()
        }

        fragment?.let {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame, fragment)
                commit()
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
