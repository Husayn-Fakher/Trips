package fakher.husayn.trips.models

/**
 * Created By Fakher_Husayn on 04-Dec-19
 */


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 class Example {

    @SerializedName("search_id")
    @Expose
    var searchId: String? = null
    @SerializedName("data")
    @Expose
    var data: List<Datum>? = null
    @SerializedName("connections")
    @Expose
    var connections: List<Any>? = null
    @SerializedName("time")
    @Expose
    var time: Int? = null
    @SerializedName("currency")
    @Expose
    var currency: String? = null
    @SerializedName("currency_rate")
    @Expose
    var currencyRate: Double? = null
    @SerializedName("fx_rate")
    @Expose
    var fxRate: Double? = null
    @SerializedName("refresh")
    @Expose
    var refresh: List<Any>? = null
    @SerializedName("del")
    @Expose
    var del: Double? = null
    @SerializedName("ref_tasks")
    @Expose
    var refTasks: List<Any>? = null

    @Expose
    var allStopoverAirports: List<Any>? = null
    @SerializedName("all_airlines")
    @Expose
    var allAirlines: List<Any>? = null
    @SerializedName("_results")
    @Expose
    var results: Int? = null


}