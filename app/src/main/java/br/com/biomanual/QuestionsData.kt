package br.com.biomanual

import java.io.Serializable

object QuestionsData {

    val questions: List<Question> = listOf(
        Question(
            questionTitle = "tudo bem?",
            subQuestions = listOf(
                SubQuestion(
                    questionTitle = "Ta td certo mesmo?",
                    description = "se tiver da um ok",
                    options = listOf(
                        Option(
                            title = "Não",
                            path = 1
                        ),
                        Option(
                            title = "Sim",
                            path = 1
                        )
                    )
                ),
                SubQuestion(
                    questionTitle = "Que triste cara",
                    description = "Melhoras",
                    options = listOf(
                        Option(
                            title = "Putz que droga",
                            path = 2
                        )
                    )
                ),
                SubQuestion(
                    questionTitle = "Vai melhorar",
                    description = "Melhoras",
                    options = listOf(

                    )
                )
            )
        ),
        Question(
            questionTitle = "aconteceu algo?",
            subQuestions = listOf(
                SubQuestion(
                    questionTitle = "Ta td certo mesmo?",
                    description = "se tiver da um ok",
                    options = listOf()
                )
            )
        ),
        Question(
            questionTitle = "teste",
            subQuestions = listOf(
                SubQuestion(
                    questionTitle = "Ta td certo mesmo?",
                    description = "se tiver da um ok",
                    options = listOf()
                )
            )
        )
    )

}

class Question(
    val questionTitle: String,
    val subQuestions: List<SubQuestion>
) : Serializable

class SubQuestion(
    val questionTitle: String,
    val description: String,
    val options: List<Option>
) : Serializable

class Option(
    val title: String,
    val path: Int
) : Serializable