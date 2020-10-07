package com.fideltech.expressouitesting.factory


import androidx.fragment.app.FragmentFactory
import com.fideltech.expressouitesting.ui.movie.DirectorsFragment
import com.fideltech.expressouitesting.ui.movie.MovieDetailFragment
import com.fideltech.expressouitesting.ui.movie.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }


}













