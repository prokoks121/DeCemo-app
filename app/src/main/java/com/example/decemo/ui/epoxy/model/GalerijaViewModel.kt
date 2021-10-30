package com.example.decemo.ui.epoxy.model

import android.content.Context
import android.opengl.Visibility
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.decemo.R

@EpoxyModelClass(layout = R.layout.epoxy_galerija_item)
abstract class GalerijaViewModel:EpoxyModelWithHolder<GalerijaViewModel.ViewHolder>() {
    private val URL = /*Censure*/

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    lateinit var url:String
    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    lateinit var context: Context

    override fun bind(holder: ViewHolder) {
        super.bind(holder)

        Glide.with(context)
                .load(URL + url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.img)

    }
    class ViewHolder:EpoxyHolder(){
        lateinit var img:ImageView

        override fun bindView(itemView: View) {
            img = itemView.findViewById(R.id.galerijaImg)
        }

    }

}
