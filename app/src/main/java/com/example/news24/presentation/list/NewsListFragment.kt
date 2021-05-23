package com.example.news24.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news24.R


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class NewsListFragment : Fragment() {

    private lateinit var recycleView: RecyclerView
    private val adapter = NewsAdapter(listOf())
    private val  layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycleView = view.findViewById(R.id.news_recyclerview)

        recycleView.apply {

            layoutManager = this@NewsListFragment.layoutManager
            adapter = this@NewsListFragment.adapter
        }
            val newoList : ArrayList<News> = arrayListOf<News>.apply(){ this.ArrayList<News>

                add(News(name:"Reouverture des terasses àprès plusieurs mois de confinement"))
                add(News(name: "Hausse de cas de contamination de COVID en région Parisienne"))
                add(News(name: "Nouveau varriant de COVID détecter à Bordeaux"))
                add(News(name: "Victoire ecrasantedu PSG face à Monaco"))
                add(News(name: "La rochelle vainqueur de la finale de rugby"))
            }

            adapter.updateList(newoList)
    }

}

