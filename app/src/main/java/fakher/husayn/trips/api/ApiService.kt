package fakher.husayn.trips.api

import fakher.husayn.trips.models.Example
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created By Fakher_Husayn on 06-Dec-19
 **/
interface ApiService {

    @GET("/flights?")
    suspend fun doGetFlights(@Query("flyFrom") from: String, @Query("to") to: String,
                     @Query("dateFrom") dateFrom: String, @Query("dateTo") dateTo: String,
                     @Query("partner") partner: String,
                     @Query("sort") sort: String,
                             @Query("local") local: String,
                             @Query("typeFlight") typeFlight: String,
                             @Query("limit") limit: String,
                             @Query("featureName") featureName: String,
                             @Query("oneforcity") oneForCity: String,
                             @Query("adults") adults: String): Example

}