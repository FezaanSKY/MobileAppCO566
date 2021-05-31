package com.quizapplication

object Constants {

    const val USER_NAME: String = "user_name"
    const val Total_Questions: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1 = Question(1, "What is Islamophobia?",
            R.drawable.rsz_islamaphobia,
            "Prejudice, hatred or fear of Muslims or the Islamic faith",
            "Not being able to understand Islam",
            "Not wanting to learn about Islam",
            "All of the above",
            1

        )
        questionsList.add(que1)

        val que2 = Question(2,  "How much is it estimated that Muslims in the UK gave in charity Ramadan 2020?",
            R.drawable.charity,
            "2 Million",
            "150 million",
            "75 million",
            "38 Million",
            2

        )
        questionsList.add(que2)

        val que3 = Question(3, "What is the population of muslims worldwide ?",
            R.drawable.mus_pop,
            "2 billion",
            "1.1 billion",
            "800 million",
            "1.45billion",
            1

        )
        questionsList.add(que3)

        val que4 = Question(4, "How does Islam view equality? ?",
            R.drawable.equality,
            "All people are equal in Islam and the only thing that differentiates them is their commitment to their religion",
            "Only Jews and Christians are equal to Muslims",
            "Muslims are more equal than others",
            "Men deserve more equality than women",
            1

        )
        questionsList.add(que4)

        val que5 = Question(5, "What does the Qu'ran teach regarding justice?",
            R.drawable.justice,
            "The Qu'ran teaches that justice applies only to other monotheistic faiths",
            "The Qur’an teaches that justice applies to all humankind regardless of faith",
            "The Qu'ran teaches that justice applies to Muslims and pagans only",
            "Eye for an eye, tooth for a tooth",
            2

        )
        questionsList.add(que5)

        val que6 = Question(6, "What is Ramadhan?",
            R.drawable.ramadan,
            "A month where muslims plan how to implement sharia law",
            "A month of being vegetarian",
            "Going to Saudi arabia",
            "A month of abstaining from food and drink from dawn to dask and improving to be more god conscious",
            4

        )
        questionsList.add(que6)

        val que7 = Question(7, "For everyone one positive or “moderate” Muslim referenced in the press, how many negative references are there?",
            R.drawable.media,
            "1",
            "5",
            "21",
            "30",
            3

        )
        questionsList.add(que7)

        val que8 = Question(8, " Muslims are ?",
            R.drawable.muslim,
            "Terrorists",
            "Anti semitic",
            "Threat to british values",
            "A person who submits his will to Allah (God)",
            4

        )
        questionsList.add(que8)

        val que9 = Question(9, "How mich do muslims contribute to the Uk Economy ?",
            R.drawable.money,
            "2 billion",
            "30 billion",
            "20 million",
            "8 billion",
            2

        )
        questionsList.add(que9)

        val que10 = Question(10, "How is unity described in islam ?",
            R.drawable.islam,
            "Like one body, where if one part has an issue we all come together to solve the issue",
            "Up to the individual",
            "The responsibility is on the government",
            "As long as there is no incentive, it's your issue ",
            1

        )
        questionsList.add(que10)
        return questionsList
    }
}