package com.example.tabview

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.core.content.ContextCompat

class home : Fragment() {

    private lateinit var smoothie1: ImageButton
    private lateinit var smoothie2: ImageButton
    private lateinit var smoothie3: ImageButton
    private lateinit var smoothie4: ImageButton
    private lateinit var smoothie5: ImageButton
    private lateinit var smoothie1pop: PopupWindow
    private lateinit var smoothie2pop: PopupWindow
    private lateinit var smoothie3pop: PopupWindow
    private lateinit var smoothie4pop: PopupWindow
    private lateinit var smoothie5pop: PopupWindow

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        smoothie1 = view.findViewById(R.id.Button1)
        smoothie2 = view.findViewById(R.id.Button2)
        smoothie3 = view.findViewById(R.id.Button3)
        smoothie4 = view.findViewById(R.id.Button4)
        smoothie5 = view.findViewById(R.id.Button5)


        smoothie1.setOnClickListener {
            showSmoothie1Popup(inflater)
            smoothie1pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        smoothie2.setOnClickListener {
            showSmoothie2Popup(inflater)
            smoothie2pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        smoothie3.setOnClickListener {
            showSmoothie3Popup(inflater)
            smoothie3pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        smoothie4.setOnClickListener {
            showSmoothie4Popup(inflater)
            smoothie4pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        smoothie5.setOnClickListener {
            showSmoothie5Popup(inflater)
            smoothie5pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }
        return view
    }

    private fun showSmoothie1Popup(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.smoothie_popup1, null)
        smoothie1pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        smoothie1pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton1)
        closeButton.setOnClickListener {
            smoothie1pop.dismiss()
        }
    }

    private fun showSmoothie2Popup(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.smoothie_popup2, null)
        smoothie2pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        smoothie2pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton2)
        closeButton.setOnClickListener {
            smoothie2pop.dismiss()
        }
    }

    private fun showSmoothie3Popup(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.smoothie_popup3, null)
        smoothie3pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        smoothie3pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton3)
        closeButton.setOnClickListener {
            smoothie3pop.dismiss()
        }
    }

    private fun showSmoothie4Popup(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.smoothie_popup4, null)
        smoothie4pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        smoothie4pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton4)
        closeButton.setOnClickListener {
            smoothie4pop.dismiss()
        }
    }

    private fun showSmoothie5Popup(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.smoothie_popup5, null)
        smoothie5pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        smoothie5pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            smoothie5pop.dismiss()
        }
    }
}
