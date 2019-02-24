package com.test.hs.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by hamza on 22/02/2019.
 */
data class Product(

        @SerializedName("ref")
        @Expose
        var id: String? = null,
        @SerializedName("title")
        @Expose
        var title: String? = null,
        @SerializedName("description")
        @Expose
        var description: String? = null,
        @SerializedName("price")
        @Expose
        var price: Long? = null,
        @SerializedName("thumbnail")
        @Expose
        var thumbnail: String? = null
) {
}