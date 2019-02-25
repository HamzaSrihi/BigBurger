package com.test.hs.bigburger.adapters

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.hs.bigburger.R
import com.test.hs.bigburger.di.module.GlideApp
import com.test.hs.domain.Product
import kotlinx.android.synthetic.main.item_list_panier.view.*
import kotlinx.android.synthetic.main.item_list_product.view.*
import java.text.DecimalFormat

/**
 * Created by hamza on 25/02/2019.
 */
class PanierListAdapter(private val context: Context, val clickListener: (Product) -> Unit, private val products: List<Product>) :
        RecyclerView.Adapter<PanierListAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.titlePanier
        val imageVIew = itemView.panier_image
        val price = itemView.pricePanier
        val buttonPlus = itemView.buttonPlus
        val buttonMoin = itemView.buttonMoin
        val productQuantity = itemView.productQuantity
        val buttonSupprimer = itemView.buttonSupprimer


    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val viewItem = LayoutInflater.from(context)
                .inflate(R.layout.item_list_panier, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.title?.text = products[position].title
        GlideApp.with(context)
                .load(Uri.parse(products[position].thumbnail))
                .into(holder.imageVIew)
        var price: Double = (products[position].price!!.div(100.00))
        val df = DecimalFormat("#.##")
        holder.price.text = df.format(price) + "£"

       // holder.buttonPanier.setOnClickListener { clickListener(products[position]) }

    }

    override fun getItemCount() = products.size
}