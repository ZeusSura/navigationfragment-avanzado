package com.omarg.challegennavigationcontroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.omarg.challegennavigationcontroller.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.iniciarBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_nameFragment)
        }
        binding.terminosBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_terminosFragment)
        }
        return binding.root
    }

}
