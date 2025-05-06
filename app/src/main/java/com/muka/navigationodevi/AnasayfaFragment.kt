package com.muka.navigationodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muka.navigationodevi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.btnA.setOnClickListener {
            findNavController().navigate(R.id.AyaGecis)
        }
        binding.btnX.setOnClickListener {
            findNavController().navigate(R.id.XeGecis)
        }
        return binding.root
    }


}