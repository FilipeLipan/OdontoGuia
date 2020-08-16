package br.com.biomanual

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class QuestionAdapter(data: List<Question>) : BaseQuickAdapter<Question, BaseViewHolder>(R.layout.first_question_list_item, data) {


    override fun convert(helper: BaseViewHolder?, item: Question?) {

        helper?.setText(R.id.questionText, item?.questionTitle)

    }
}