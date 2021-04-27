package com.thebordev.Network

import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable

interface RetroService {

    @GET("volumes")
    fun getBookListFromApi(@Query("q") query: String): Observable<BookListModel>
}