package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ThankYouFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_thank_you, container, false)
        val txScore: TextView =view.findViewById(R.id.txScore)
        val args = ThankYouFragmentArgs.fromBundle(requireArguments())
        txScore.text = String.format("%.2f", args.score)+"%"

        return view
    }

}