package br.com.biomanual

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override val activityLayout: Int = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val adapter = QuestionAdapter(QuestionsData.questions)

        questionList.adapter = adapter
        questionList.layoutManager = LinearLayoutManager(this)



        adapter.setOnItemClickListener { adapter, view, position ->
            startActivity(DetailActivity.newIntent(this, adapter.data.get(position) as Question))
        }
    }
}