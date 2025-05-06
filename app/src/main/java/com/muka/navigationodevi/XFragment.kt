package com.muka.navigationodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muka.navigationodevi.databinding.FragmentXBinding


class XFragment : Fragment() {
    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater,container,false)
        binding.buttonX.setOnClickListener {
            findNavController().navigate(R.id.XdenYyeGecis)
        }
        return binding.root
    }


}