package fakher.husayn.trips.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso
import fakher.husayn.trips.R
import fakher.husayn.trips.models.Datum
import kotlinx.android.synthetic.main.trip.*

/**
 * Created By Fakher_Husayn on 10-Dec-19
 **/
open class Trip: Fragment()
{
    val IMAGE_URL = "https://images.kiwi.com/photos/600x330/"

    companion object {
        const val ARG_FROM = "from"
        const val ARG_TO = "to"
        const val ARG_IMAGE = "destination"
        const val ARG_PRICE = "price"
        const val ARG_CURRENCY = "currency"

        fun newInstance(data: Datum?, currency: String): Trip
        {

            val bundle = Bundle().apply {
                putString(ARG_FROM, data?.cityFrom)
                putString(ARG_TO, data?.cityTo)
                putString(ARG_IMAGE, data?.mapIdto)
                putString(ARG_PRICE, data?.price.toString())
                putString(ARG_CURRENCY, currency)
            }

            val frag = Trip()
            frag.arguments = bundle

            return frag
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        val v = inflater.inflate(R.layout.trip, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val to = arguments?.getString(ARG_TO)
        val from = arguments?.getString(ARG_FROM)
        val ticketPrice = arguments?.getString(ARG_PRICE)
        val currency = arguments?.getString(ARG_CURRENCY)
        val destination = arguments?.getString(ARG_IMAGE)

        tv.text = "From $from to $to"
        price.text = "For only $ticketPrice $currency"
        // load the image with Picasso
        Picasso.with(context).load(IMAGE_URL+destination+".jpg") // load the image
            .into(destination_image)

    }
}