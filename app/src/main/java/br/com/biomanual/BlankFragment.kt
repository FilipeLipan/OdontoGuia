package br.com.biomanual

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.subquestions_fragment.*

private const val SUBQUESTION_KEY = "param1"

class BlankFragment : SubquestionFragment() {

    private lateinit var subquestion: SubQuestion

    override val fragmentLayout: Int = R.layout.subquestions_fragment


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            subquestion = it.getSerializable(SUBQUESTION_KEY) as SubQuestion


            subquestionTitle.text = subquestion.questionTitle
            subquestionDescription.text = subquestion.description


            val adapter = OptionAdapter(subquestion.options)
            optionList.adapter = adapter

            adapter.setOnItemChildClickListener { adapter, view, position ->
                val selectedOption = subquestion.options.get(position)

                (requireActivity() as DetailActivity).goToNextQuestion(selectedOption.path)
            }
        }
    }

    companion object {

        fun newInstance(subQuestion: SubQuestion) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(SUBQUESTION_KEY, subQuestion)
                }
            }
    }
}