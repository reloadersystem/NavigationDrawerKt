package ar.reloadersystem.swipetabsactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ar.reloadersystem.swipetabsactivity.adapters.TabsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class SwipeTabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewPager()
        setupTabs()
    }

    private fun setupTabs() {
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setupViewPager() {
        viewPager.adapter = TabsPagerAdapter(supportFragmentManager)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
