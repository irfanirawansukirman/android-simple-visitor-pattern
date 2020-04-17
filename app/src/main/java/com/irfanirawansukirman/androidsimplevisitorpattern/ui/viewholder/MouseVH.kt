package com.irfanirawansukirman.androidsimplevisitorpattern.ui.viewholder

import android.view.View
import com.irfanirawansukirman.androidsimplevisitorpattern.base.BaseVH
import com.irfanirawansukirman.androidsimplevisitorpattern.model.Item

class MouseVH(private val view: View) : BaseVH<Item>(view) {
    override fun bind(item: Item) {
        view.apply {

        }
    }
}