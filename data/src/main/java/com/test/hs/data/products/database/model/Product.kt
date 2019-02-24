package com.test.hs.data.products.database.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by hamza on 24/02/2019.
 */
@Entity(tableName = "products")
data class Product(@Expose
                   @PrimaryKey
                   var id: String,

                   @Expose
                   @ColumnInfo(name = "product_title")
                   var title: String,
                   @Expose
                   @ColumnInfo(name = "product_description")
                   var description: String,
                   @Expose
                   @ColumnInfo(name = "product_thumbnail")
                   var thumbnail: String,
                   @Expose
                   @ColumnInfo(name = "product_price")
                   var price: Long,
                   @Expose
                   @ColumnInfo(name = "product_quantity")
                   var quantity: Int

) {
    constructor() : this("", "", "", "", 0,  0)
}