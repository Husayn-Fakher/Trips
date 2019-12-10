package fakher.husayn.trips.models

/**
 * Created By Fakher_Husayn on 04-Dec-19
 */
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Datum {

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("p1")
    @Expose
    var p1: Int? = null
    @SerializedName("p2")
    @Expose
    var p2: Int? = null
    @SerializedName("p3")
    @Expose
    var p3: Int? = null
    @SerializedName("price")
    @Expose
    var price: Int? = null

    @SerializedName("airlines")
    @Expose
    var airlines: List<String>? = null
    @SerializedName("pnr_count")
    @Expose
    var pnrCount: Int? = null
    @SerializedName("transfers")
    @Expose
    var transfers: List<Any>? = null
    @SerializedName("has_airport_change")
    @Expose
    var hasAirportChange: Boolean? = null
    @SerializedName("technical_stops")
    @Expose
    var technicalStops: Int? = null

    @SerializedName("type_flights")
    @Expose
    var typeFlights: List<String>? = null
    @SerializedName("dTime")
    @Expose
    var dTime: Int? = null
    @SerializedName("dTimeUTC")
    @Expose
    var dTimeUTC: Int? = null
    @SerializedName("aTime")
    @Expose
    var aTime: Int? = null
    @SerializedName("aTimeUTC")
    @Expose
    var aTimeUTC: Int? = null
    @SerializedName("nightsInDest")
    @Expose
    var nightsInDest: Any? = null
    @SerializedName("flyFrom")
    @Expose
    var flyFrom: String? = null
    @SerializedName("flyTo")
    @Expose
    var flyTo: String? = null
    @SerializedName("cityFrom")
    @Expose
    var cityFrom: String? = null
    @SerializedName("cityTo")
    @Expose
    var cityTo: String? = null
    @SerializedName("cityCodeFrom")
    @Expose
    var cityCodeFrom: String? = null
    @SerializedName("cityCodeTo")
    @Expose
    var cityCodeTo: String? = null

    @SerializedName("mapIdfrom")
    @Expose
    var mapIdfrom: String? = null
    @SerializedName("mapIdto")
    @Expose
    var mapIdto: String? = null
    @SerializedName("distance")
    @Expose
    var distance: Double? = null
    @SerializedName("routes")
    @Expose
    var routes: List<List<String>>? = null
    @SerializedName("virtual_interlining")
    @Expose
    var virtualInterlining: Boolean? = null
    @SerializedName("fly_duration")
    @Expose
    var flyDuration: String? = null

    @SerializedName("facilitated_booking_available")
    @Expose
    var facilitatedBookingAvailable: Boolean? = null
    @SerializedName("found_on")
    @Expose
    var foundOn: List<String>? = null

    @SerializedName("booking_token")
    @Expose
    var bookingToken: String? = null
    @SerializedName("quality")
    @Expose
    var quality: Double? = null
    @SerializedName("deep_link")
    @Expose
    var deepLink: String? = null

}