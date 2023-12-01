package com.example.tss.Myapp.ui.buscar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tss.databinding.FragmentBuscarBinding


class buscarFragment : Fragment() {
    private var _binding: FragmentBuscarBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentBuscarBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}