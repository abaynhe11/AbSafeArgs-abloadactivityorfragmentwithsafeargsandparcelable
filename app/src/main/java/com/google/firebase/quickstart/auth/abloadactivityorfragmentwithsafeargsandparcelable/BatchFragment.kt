package com.google.firebase.quickstart.auth.abloadactivityorfragmentwithsafeargsandparcelable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_batch.*

class BatchFragment : Fragment() {
    // private val viewModel: BatchViewModel by viewModels()
    val args: BatchFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_batch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (args.default.isNew) {
            textView.text = "New Batch"
        }
        else {
            textView.text = "Batch Id = ${args.default.id}"
        }
    }
}