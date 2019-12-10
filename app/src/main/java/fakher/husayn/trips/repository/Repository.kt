package fakher.husayn.trips.repository

import androidx.lifecycle.LiveData
import fakher.husayn.trips.api.MyRetrofitBuilder
import fakher.husayn.trips.models.Example
import fakher.husayn.trips.models.QueryElement
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

/**
 * Created By Fakher_Husayn on 06-Dec-19
 **/
object Repository {

    var job: CompletableJob? = null

    fun doGetFlights(flights : QueryElement): LiveData<Example> {
        job = Job()
        return object: LiveData<Example>(){
            override fun onActive() {
                super.onActive()
                job?.let{ theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val example = MyRetrofitBuilder.apiService.doGetFlights(flights.flyfrom,flights.to,flights.dateFrom,flights.dateTo,flights.partner
                        ,flights.sort,flights.local,flights.typeFlight, flights.limit, flights.featueName , flights.oneForCity, flights.adults)
                        withContext(Main){
                            value = example
                            theJob.complete()
                        }
                    }

                }

            }
        }
    }


    fun cancelJobs(){
        job?.cancel()
    }

}