package irvandandung.github.intentandroid

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.fragment_practice5_read_data.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Practice5ReadDataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class Practice5ReadDataFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var nim: Int? = null
    companion object {
        var EXTRA_NAMA = ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null) {
            val myName = arguments?.getString(EXTRA_NAMA)
            tvMyData.text = "Nama Saya : $myName, NIM Saya : $nim"
        }
        btnKembaliBeranda.setOnClickListener{
            val mIntent = Intent(activity, Practice5Activity::class.java)
            startActivity(mIntent)
        }
    }

}
