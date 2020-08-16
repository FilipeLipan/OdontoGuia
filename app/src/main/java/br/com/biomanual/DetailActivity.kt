package br.com.biomanual

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class DetailActivity : BaseFragmentActivity() {

    override val activityLayout: Int = R.layout.activity_detail

    lateinit var question: Question

    companion object {
        val QUESTION_KEY : String = "question"

        fun newIntent(context: Context, question: Question) : Intent {
            val intent = Intent(context, DetailActivity::class.java)

            return intent.putExtra(QUESTION_KEY, question)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        question = intent.getSerializableExtra(QUESTION_KEY) as Question

        container = findViewById(R.id.fragContainer)

        replaceFragment(BlankFragment.newInstance(question.subQuestions.get(0)))

    }

    fun goToNextQuestion(path: Int) {
        replaceAndBackStackFragment(BlankFragment.newInstance(question.subQuestions.get(path)))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.close, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.close -> finish()
            android.R.id.home -> onBackPressed()
        }

        return super.onOptionsItemSelected(item)
    }
}