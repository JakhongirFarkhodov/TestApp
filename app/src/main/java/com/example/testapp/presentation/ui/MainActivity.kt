package com.example.testapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.presentation.adapter.OfferAdapter
import com.example.testapp.presentation.viewmodel.OfferViewModel
import com.example.testapp.presentation.viewmodel.OfferViewModelFactory

class MainActivity : AppCompatActivity() {

    private val offerFactory by lazy {
        OfferViewModelFactory(application)
    }

    private val viewModel: OfferViewModel by lazy {
        ViewModelProvider(this,offerFactory).get(OfferViewModel::class.java)
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var offerAdapter: OfferAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.main_recyclerView)
        offerAdapter = OfferAdapter()

        viewModel.getOfferData()

        viewModel.offer.observe(this){
            Log.d("TAG", "onCreate: $it")
            offerAdapter.setOfferList(it)
            with(recyclerView)
            {
                adapter = offerAdapter
                layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            }
        }



    }
}