package com.muka.navigationodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.muka.navigationodevi.databinding.ActivityMainBinding
import com.muka.navigationodevi.databinding.FragmentABinding


class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater,container,false)

        binding.buttonA.setOnClickListener {
            findNavController().navigate(R.id.AdanByeGecis)
        }
        return binding.root
    }

}