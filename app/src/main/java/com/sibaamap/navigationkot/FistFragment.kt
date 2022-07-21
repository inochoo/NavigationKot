package com.sibaamap.navigationkot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fist.view.*


class FistFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fist, container, false)

        view.textView1.setOnClickListener {
            val action = FistFragmentDirections.navigateToSecondFragment(22)
            Navigation.findNavController(view).navigate(action) }

        return view

    }

}