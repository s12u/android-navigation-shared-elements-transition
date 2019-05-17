package com.tistory.mybstory.android_shared_element_transition_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_parent.*

class ParentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_parent, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        iv_shared_element.setOnClickListener { imgView ->
            val extras = FragmentNavigatorExtras(
                imgView to resources.getString(R.string.shared_image_view)
            )
            findNavController().navigate(R.id.action_detail, null, null, extras)
        }

        Glide.with(context!!)
            .load(R.drawable.dog)
            .centerCrop()
            .into(iv_shared_element)

    }
}
