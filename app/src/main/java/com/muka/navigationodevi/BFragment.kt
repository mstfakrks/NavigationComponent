package com.muka.navigationodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muka.navigationodevi.databinding.FragmentBBinding


class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater,container,false)

        binding.buttonB.setOnClickListener {
            findNavController().navigate(R.id.BdenYyeGecis)
        }
       return binding.root
    }


}