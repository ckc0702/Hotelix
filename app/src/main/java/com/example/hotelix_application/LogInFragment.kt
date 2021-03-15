package com.example.hotelix_application

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelix_application.databinding.FragmentLogInBinding


class LogInFragment : Fragment() {

    private var binding: FragmentLogInBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //save inflated view to fragmentBinding
        val fragmentBinding = FragmentLogInBinding.inflate(inflater, container, false)
        //initialize to binding
        binding = fragmentBinding
        //create view with inflated fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}