package com.examle.homework64.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.examle.homework64.databinding.FragmentThirdBinding
import com.examle.homework64.ui.activities.MainViewModel

class ThirdFragment : Fragment() {
   private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        val stringBuffer = StringBuffer()
        viewModel.commands.observe(viewLifecycleOwner,{commands->
            binding.tvComand.text = stringBuffer.append(commands)

        })
    }

}