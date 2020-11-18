package irvandandung.github.intentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_practice5_first.*

/**
 * A simple [Fragment] subclass.
 * Use the [Practice5FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Practice5FirstFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToSecondFragment.setOnClickListener{
            val namaSaya = inputNamaSaya.text.toString()
            if (namaSaya.isEmpty()) {
                inputNamaSaya.error = "Nama Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val nimSaya = inputNimSaya.text.toString()
            if (nimSaya.isEmpty()) {
                inputNimSaya.error = "Nim Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val mReadDataFragment =
                Practice5ReadDataFragment()
            val mBundle = Bundle()
            mBundle.putString(Practice5ReadDataFragment.EXTRA_NAMA, namaSaya)
            mReadDataFragment.arguments = mBundle
            mReadDataFragment.nim = nimSaya.toInt()
            val mFragmentManager = fragmentManager as FragmentManager
            mFragmentManager
                .beginTransaction()
                .replace(R.id.frame_container, mReadDataFragment, Practice5ReadDataFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }

}
