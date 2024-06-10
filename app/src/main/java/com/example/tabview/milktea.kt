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

class milktea : Fragment() {

    private lateinit var milktea1: ImageButton
    private lateinit var milktea2: ImageButton
    private lateinit var milktea3: ImageButton
    private lateinit var milktea4: ImageButton
    private lateinit var milktea5: ImageButton
    private lateinit var milktea1pop: PopupWindow
    private lateinit var milktea2pop: PopupWindow
    private lateinit var milktea3pop: PopupWindow
    private lateinit var milktea4pop: PopupWindow
    private lateinit var milktea5pop: PopupWindow

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_milktea, container, false)

        milktea1 = view.findViewById(R.id.Button1)
        milktea2 = view.findViewById(R.id.Button2)
        milktea3 = view.findViewById(R.id.Button3)
        milktea4 = view.findViewById(R.id.Button4)
        milktea5 = view.findViewById(R.id.Button5)

        milktea1.setOnClickListener {
            showMilkteaPopup1(inflater)
            milktea1pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        milktea2.setOnClickListener {
            showMilkteaPopup2(inflater)
            milktea2pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        milktea3.setOnClickListener {
            showMilkteaPopup3(inflater)
            milktea3pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        milktea4.setOnClickListener {
            showMilkteaPopup4(inflater)
            milktea4pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        milktea5.setOnClickListener {
            showMilkteaPopup5(inflater)
            milktea5pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }
        return view
    }

    private fun showMilkteaPopup1(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.milktea_popup1, null)
        milktea1pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        milktea1pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton1)
        closeButton.setOnClickListener {
            milktea1pop.dismiss()
        }
    }

    private fun showMilkteaPopup2(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.milktea_popup2, null)
        milktea2pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        milktea2pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton2)
        closeButton.setOnClickListener {
            milktea2pop.dismiss()
        }
    }

    private fun showMilkteaPopup3(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.milktea_popup3, null)
        milktea3pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        milktea3pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton3)
        closeButton.setOnClickListener {
            milktea3pop.dismiss()
        }
    }

    private fun showMilkteaPopup4(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.milktea_popup4, null)
        milktea4pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        milktea4pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton4)
        closeButton.setOnClickListener {
            milktea4pop.dismiss()
        }
    }

    private fun showMilkteaPopup5(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.milktea_popup5, null)
        milktea5pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        milktea5pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            milktea5pop.dismiss()
        }
    }
}