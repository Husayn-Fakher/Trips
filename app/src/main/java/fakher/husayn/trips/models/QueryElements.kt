package fakher.husayn.trips.models

import retrofit2.http.Query

/**
 * Created By Fakher_Husayn on 07-Dec-19
 **/

class QueryElement (val flyfrom: String, val to: String, val dateFrom: String , val dateTo: String, val partner: String,
                    val sort: String,val local: String,val typeFlight: String, val limit: String,
                    val featueName: String,val oneForCity: String,
                    val adults: String)