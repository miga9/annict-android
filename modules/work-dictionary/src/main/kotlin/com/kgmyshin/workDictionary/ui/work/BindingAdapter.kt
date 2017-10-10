package com.kgmyshin.workDictionary.ui.work

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.squareup.picasso.Picasso

internal object BindingAdapter {

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadUrl(
            view: ImageView?,
            imageUrl: String?
    ) {
        if (view == null && imageUrl == null) {
            return
        }
        view?.let {
            Picasso.with(it.context)
                    .load(imageUrl)
                    .into(view)
        }
    }

    @BindingAdapter("workList")
    @JvmStatic
    fun setItemList(
            view: RecyclerView?,
            workList: List<WorkViewModel>?
    ) {
        if (view == null && workList == null) {
            return
        }
        view?.let {
            val adapter = WorkListAdapter(
                    it.context,
                    workList!!
            )
            view.adapter = adapter
        }
    }

}