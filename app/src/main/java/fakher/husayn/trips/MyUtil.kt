package fakher.husayn.trips

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*


/**
 * Created By Fakher_Husayn on 10-Dec-19
 **/
class MyUtil {



    companion object {


        fun getDate() : String{
            val pattern = "dd/MM/yyyy"
            val simpleDateFormat = SimpleDateFormat(pattern)
            val date: String = simpleDateFormat.format(Date())
            return date
        }


        fun addToDate(DaysToAdd: Int) : String{
            val pattern = "dd/MM/yyyy"
            val simpleDateFormat = SimpleDateFormat(pattern)
            val date: String = simpleDateFormat.format(Date())

            val c = Calendar.getInstance()
            c.setTime(simpleDateFormat.parse(date))
            c.add(Calendar.DAY_OF_MONTH, DaysToAdd);
            val dateEnd: String = simpleDateFormat.format(c.time)

            return dateEnd
        }}



}