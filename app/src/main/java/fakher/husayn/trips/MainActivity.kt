package fakher.husayn.trips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.make.dots.dotsindicator.DotsIndicator
import fakher.husayn.trips.adapter.PagerAdapter
import fakher.husayn.trips.models.QueryElement

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.flights.observe(this, Observer {

            val otherStrings = arrayOf(it.data?.get(0), it.data?.get(1),
                it.data?.get(2), it.data?.get(3),
                it.data?.get(4))

            val pagerAdapter = PagerAdapter(
                supportFragmentManager,
                otherStrings,
                it.currency.toString()
            )
            val pager = findViewById<ViewPager>(R.id.viewpager)
            val dotsIndicator = findViewById<DotsIndicator>(R.id.dotsIndicator)
            pager.adapter = pagerAdapter

            dotsIndicator.setViewPager(pager)
            pager.adapter?.registerDataSetObserver(dotsIndicator.dataSetObserver)

        })


        val date = MyUtil.getDate()
        val endDate = MyUtil.addToDate(1)



        val QE = QueryElement("49.2-16.61-250km","anywhere",date,endDate,"sticky",
            "popularity","en","oneway","5","aggregateResults","1","1")
          viewModel.setFlightParams(QE)


    }

    override fun onDestroy() {
        super.onDestroy()
          viewModel.cancelJobs()
    }
}
