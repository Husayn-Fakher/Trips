package fakher.husayn.trips.adapter

/**
 * Created By Fakher_Husayn on 05-Dec-19
 **/
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import fakher.husayn.trips.fragment.Trip
import fakher.husayn.trips.models.Datum

class PagerAdapter(fm: FragmentManager, theData : Array<Datum?>, currency: String ): FragmentPagerAdapter(fm)
{
    val PAGE_MAX_CNT = 5

     val s = theData
     val c = currency

    override fun getCount(): Int {
        return PAGE_MAX_CNT
    }

    override fun getItem(position: Int): Fragment {
        val fragment = when(position)
        {
            0 -> Trip.newInstance(s[0],c)
            1 -> Trip.newInstance(s[1],c)
            2 -> Trip.newInstance(s[2],c)
            3 -> Trip.newInstance(s[3],c)
            4 -> Trip.newInstance(s[4],c)
            else ->Trip.newInstance(s[0],c)
        }
        return fragment
    }}


