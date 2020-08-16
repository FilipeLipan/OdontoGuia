package br.com.biomanual

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


abstract class SubquestionFragment : Fragment() {

    abstract val fragmentLayout: Int


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val view = inflater.inflate(fragmentLayout,container, false)
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}