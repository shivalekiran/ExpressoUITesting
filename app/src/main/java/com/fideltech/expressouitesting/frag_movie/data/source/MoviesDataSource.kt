package com.fideltech.expressouitesting.data.source

import com.fideltech.expressouitesting.data.Movie


interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}