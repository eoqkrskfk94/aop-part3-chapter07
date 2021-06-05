package com.mj.aop_part3_chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {

    @GET("/v3/b28107e4-2d9e-4026-97d2-0d679f8cf158")
    fun getHouseList(): Call<HouseDto>
}