package com.example.duasofthequran

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var linearLayoutManager: LinearLayoutManager
private lateinit var recyclerView: RecyclerView

/**
 * A simple [Fragment] subclass.
 * Use the [DuaListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DuaListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dua_list, container, false)
        recyclerView = view.findViewById(R.id.rv_dua_list)
        recyclerView.hasFixedSize()
        linearLayoutManager = LinearLayoutManager(view.context)
        recyclerView.layoutManager= linearLayoutManager
        recyclerView.adapter=DuaListAdapter()

        return view
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment DuaListFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            DuaListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}