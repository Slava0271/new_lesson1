package com.example.calc.part6_tab_with_rv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.calc.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_matches.*

class Matches : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)

        addTabLayoutItems()


        val text = ArrayList<String>()
        val matchData = MatchData()
        addDataToList(matchData, text)

        var linearLayoutManager: LinearLayoutManager? = null

        linearLayoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView?.layoutManager = linearLayoutManager
        recyclerView?.adapter = Adapter(text) // Your adapter
        recyclerView?.setHasFixedSize(true);
        listenScrollAndSelectTabItems(linearLayoutManager)
        scrollRVOnClick(linearLayoutManager)


    }


    /**
     * A method that adds 4 elements (months) to tab layout
     */
    private fun addTabLayoutItems() {
        val numbers: Array<String> = arrayOf(
            Month.JANUARY.description, Month.FEBRUARY.description,
            Month.MARCH.description, Month.APRIL.description
        )
        pager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, pager) { tab, position ->
            tab.text = numbers[position]
        }.attach()
    }

    /**
     * A method that listens to the recycling scrolling and changes
     * active elements in the tab loyout depending on the elements in the recycling
     */
    private fun listenScrollAndSelectTabItems(linearLayoutManager: LinearLayoutManager) {
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val pastVisibleItems = linearLayoutManager.findFirstVisibleItemPosition()
                when {
                    pastVisibleItems < 9 -> tabLayout.getTabAt(0)!!.select()
                    pastVisibleItems in 9..23 -> tabLayout.getTabAt(1)!!.select()
                    pastVisibleItems in 24..37 -> tabLayout.getTabAt(2)!!.select()
                    pastVisibleItems >= 38 -> tabLayout.getTabAt(3)!!.select()
                };
            }

        })

    }

    /**
     * A method that scrolls the recycler view to the desired
     * item, depending on the pressed button in the tab layout
     */
    private fun scrollRVOnClick(linearLayoutManager: LinearLayoutManager) {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    when (tab.position) {
                        0 -> linearLayoutManager.scrollToPositionWithOffset(0, 0);
                        1 -> linearLayoutManager.scrollToPositionWithOffset(14, 0);
                        2 -> linearLayoutManager.scrollToPositionWithOffset(28, 0);
                        3 -> linearLayoutManager.scrollToPositionWithOffset(42, 0);

                    }
                }
            }
        })
    }

    /**
     * Adding information to activities
     */
    private fun addDataToList(matchData: MatchData, text: ArrayList<String>) {
        matchData.addMatches(text, Month.JANUARY.description)
        matchData.addMatches(text, Month.FEBRUARY.description)
        matchData.addMatches(text, Month.MARCH.description)
        matchData.addMatches(text, Month.APRIL.description)
    }
}