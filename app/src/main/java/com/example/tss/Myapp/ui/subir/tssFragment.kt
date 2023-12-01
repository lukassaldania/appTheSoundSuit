package com.example.tss.Myapp.ui.subir

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tss.databinding.FragmentTssBinding


class tssFragment : Fragment() {

    private var _binding: FragmentTssBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTssBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}