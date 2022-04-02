package com.watasolutions.t7_week5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.watasolutions.t7_week5.databinding.FragmentDetailBinding
import com.watasolutions.t7_week5.databinding.FragmentHomeBinding
import com.watasolutions.t7_week5.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {
    lateinit var binding : FragmentSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSignOut.setOnClickListener {
            val controller = findNavController()
            controller.navigate(R.id.action_settingFragment_to_loginFragment)
        }
    }

}