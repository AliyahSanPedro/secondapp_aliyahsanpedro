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

class Frappe : Fragment() {

    private lateinit var frappe1: ImageButton
    private lateinit var frappe2: ImageButton
    private lateinit var frappe3: ImageButton
    private lateinit var frappe4: ImageButton
    private lateinit var frappe5: ImageButton
    private lateinit var frappe1pop: PopupWindow
    private lateinit var frappe2pop: PopupWindow
    private lateinit var frappe3pop: PopupWindow
    private lateinit var frappe4pop: PopupWindow
    private lateinit var frappe5pop: PopupWindow

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frappe, container, false)

        frappe1 = view.findViewById(R.id.Button1)
        frappe2 = view.findViewById(R.id.Button2)
        frappe3 = view.findViewById(R.id.Button3)
        frappe4 = view.findViewById(R.id.Button4)
        frappe5 = view.findViewById(R.id.Button5)

        frappe1.setOnClickListener {
            showFrappePopup1(inflater)
            frappe1pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        frappe2.setOnClickListener {
            showFrappePopup2(inflater)
            frappe2pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        frappe3.setOnClickListener {
            showFrappePopup3(inflater)
            frappe3pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        frappe4.setOnClickListener {
            showFrappePopup4(inflater)
            frappe4pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }

        frappe5.setOnClickListener {
            showFrappePopup5(inflater)
            frappe5pop.showAtLocation(view, Gravity.CENTER, 0, 50)
        }
        return view
    }

    private fun showFrappePopup1(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.frappe_popup1, null)
        frappe1pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        frappe1pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton1)
        closeButton.setOnClickListener {
            frappe1pop.dismiss()
        }
    }

    private fun showFrappePopup2(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.frappe_popup2, null)
        frappe2pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        frappe2pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton2)
        closeButton.setOnClickListener {
            frappe2pop.dismiss()
        }
    }

    private fun showFrappePopup3(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.frappe_popup3, null)
        frappe3pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        frappe3pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton3)
        closeButton.setOnClickListener {
            frappe3pop.dismiss()
        }
    }

    private fun showFrappePopup4(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.frappe_popup4, null)
        frappe4pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        frappe4pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton4)
        closeButton.setOnClickListener {
            frappe4pop.dismiss()
        }
    }

    private fun showFrappePopup5(inflater: LayoutInflater) {
        val popupView = inflater.inflate(R.layout.frappe_popup5, null)
        frappe5pop = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        frappe5pop.setBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            frappe5pop.dismiss()
        }
    }
}