package com.example.proyectotic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
class iniciar_sesion : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_iniciar_sesion, container, false)
        val btn_iniciar_sesion = root.findViewById<Button>(R.id.btn_iniciar_sesion)

        btn_iniciar_sesion.setOnClickListener { findNavController().navigate(R.id.action_iniciar_sesion_to_navigation_home)}

        return root

    }
}