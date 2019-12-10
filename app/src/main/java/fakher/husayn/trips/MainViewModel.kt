package fakher.husayn.trips

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import fakher.husayn.trips.models.Example
import fakher.husayn.trips.models.QueryElement
import fakher.husayn.trips.repository.Repository

/**
 * Created By Fakher_Husayn on 06-Dec-19
 **/
class MainViewModel: ViewModel() {

    private val _flight_parameters: MutableLiveData<QueryElement> = MutableLiveData()

    val flights: LiveData<Example> = Transformations
        .switchMap(_flight_parameters){
            Repository.doGetFlights(it)
        }
// check this
    fun setFlightParams(flightParams: QueryElement){
        val update = flightParams
        if (_flight_parameters.equals(update)) {
            return
        }
    _flight_parameters.value = update
    }

    fun cancelJobs(){
        Repository.cancelJobs()
    }
}