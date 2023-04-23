package com.nikolai.quizappevenying.helpers

import com.nikolai.quizappevenying.model.Answer
import com.nikolai.quizappevenying.model.Question
import com.nikolai.quizappevenying.model.Test

var answer1 = Answer(
    isCorrect = false,
    text = "Треугольник"
)

var answer2 = Answer(
    isCorrect = false,
    text = "Квадрат"
)

var answer3 = Answer(
    isCorrect = true,
    text = "Круг"
)

var question1 = Question(
    text = "Фигура в которой нет углов",
    answers = listOf(answer1, answer2, answer3)
)

////////////////////////////////////////////////////////////////////////////////////////////////////

var question2 = Question(
    text = "Кто был призидентом США в 2014 году?",
    answers = listOf(
        Answer(
            isCorrect = false,
            text ="Трамп"

        ),

        Answer(
            isCorrect = true,
            text ="Обама"

        ),

                Answer(
                isCorrect = false,
                    text ="Джон Кеннеди"

                )
    )
)
////////////////////////////////////////////////////////////////////////////////////////////////////
var question3 = Question(
    text = "В каком году началась Атака мертвецов?",
    answers = listOf(
        Answer(
            isCorrect = true,
            text ="1915 год"

        ),

        Answer(
            isCorrect = false,
            text ="1814 год"

        ),

        Answer(
            isCorrect = false,
            text ="1939 год"

        )
    )
)

val textExample = Test(
    score = 0,
    questions = listOf(question1, question2, question3)
)










