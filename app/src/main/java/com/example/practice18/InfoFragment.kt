package com.example.practice18

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.textView)
        val image  = view?.findViewById<ImageView>(R.id.imageView)
        image?.visibility = View.VISIBLE

        when(selectedItem){
            getString(R.string.cat1) ->{
                image?.setImageResource(R.drawable.kerl)
                textView?.setText(R.string.cat1info)
            }
            getString(R.string.cat2) ->{
                image?.setImageResource(R.drawable.bombey)
                textView?.setText(R.string.cat2info)
            }
            getString(R.string.cat3) ->{
                image?.setImageResource(R.drawable.reks)
                textView?.setText(R.string.cat3info)
            }
            getString(R.string.cat4) ->{
                image?.setImageResource(R.drawable.nibelung)
                textView?.setText(R.string.cat4info)
            }

        }
    }
}