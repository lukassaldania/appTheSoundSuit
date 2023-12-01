package com.example.tss.Myapp.ui.perfil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tss.databinding.FragmentPerfilBinding

class PerfilFragment : Fragment() {
        private var _binding: FragmentPerfilBinding?= null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPerfilBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

}