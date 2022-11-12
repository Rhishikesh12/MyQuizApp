package com.example.myquizapp

object Constants {

    fun getQuestions() : ArrayList<Question>{
        val QuestionList= ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_australia,
            "Austria","Australia","India","America",
            2
        )
        val que2 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_argentina,
            "Austria","Australia","Argentina","America",
            3
        )
        val que3 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_brazil,
            "Brazil","Australia","India","America",
            1
        )
        val que4 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_fiji,
            "Brazil","Australia","India","Fiji",
            4
        )
        val que5 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_denmark,
            "Austria","Denmark","Fiji","Japan",
            2
        )
        val que6 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_germany,
            "Kuwait","Germany","Fiji","India",
            2
        )
        val que7 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_kuwait,
            "Kuwait","Australia","India","America",
            1
        )
        val que8 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_new_zealand,
            "Japan","Germany","India","New Zealand",
            4
        )
        val que9 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_india,
            "Austria","Australia","India","America",
            3
        )
        val que10 = Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_belgium,
            "Germany","Australia","Belgium","America",
            3
        )
        QuestionList.add(que1)
        QuestionList.add(que2)
        QuestionList.add(que3)
        QuestionList.add(que4)
        QuestionList.add(que5)
        QuestionList.add(que6)
        QuestionList.add(que7)
        QuestionList.add(que8)
        QuestionList.add(que9)
        QuestionList.add(que10)

        return QuestionList
    }
}