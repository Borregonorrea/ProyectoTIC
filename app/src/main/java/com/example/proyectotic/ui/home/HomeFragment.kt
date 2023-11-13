package com.example.proyectotic.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.proyectotic.R
import com.example.proyectotic.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val btn_navegar = root.findViewById<Button>(R.id.btn_navegar)
        val btn_aseo = root.findViewById<Button>(R.id.btn_aseo)
        val btn_musica = root.findViewById<Button>(R.id.btn_musica)
        val btn_cocina = root.findViewById<Button>(R.id.btn_cocinar)

        btn_navegar.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_entretenimiento)}
        btn_aseo.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_aseo)}
        btn_musica.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_musica)}
        btn_cocina.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_cocinar)}

        return root

    }


}