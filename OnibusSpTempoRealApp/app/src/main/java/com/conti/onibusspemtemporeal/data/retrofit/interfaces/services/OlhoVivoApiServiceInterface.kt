package com.conti.onibusspemtemporeal.data.retrofit.interfaces.services

import com.conti.onibusspemtemporeal.data.models.BusRoute
import com.conti.onibusspemtemporeal.data.models.ResponseAllBus
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OlhoVivoApiServiceInterface {

    @GET("Linha/Buscar")
    suspend fun getRoutes(
        @Query("termosBusca")
        searchTerm: String
    ): Response<List<BusRoute>>

    @GET("Posicao")
    suspend fun getAllBus(): Response<ResponseAllBus>


}