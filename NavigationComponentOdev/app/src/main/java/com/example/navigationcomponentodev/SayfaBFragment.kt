package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.navigationcomponentodev.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonGitY.setOnClickListener {
            val gecis = SayfaBFragmentDirections.gecisYBir()

            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }
}