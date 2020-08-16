package br.com.biomanual

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class OptionAdapter(data: List<Option>) : BaseQuickAdapter<Option, BaseViewHolder>(R.layout.options_list_item, data) {

    override fun convert(helper: BaseViewHolder?, item: Option?) {

        helper?.setText(R.id.button, item?.title)

        helper?.addOnClickListener(R.id.button)
    }
}