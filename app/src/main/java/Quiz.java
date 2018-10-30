import java.util.List;

public class Quiz {

    List<String> questions;
    int score;
    int currentQuestion;

    public Quiz(List<String> q) {
        List<String> questions = q;
        score = 0;
        currentQuestion = 0;
    }

    public String getQuestion(int questionNum) {
        questions.get(questionNum);
        currentQuestion = questionNum;
    }

    public String nextQuestion() {
        questions.get(currentQuestion + 1);
        currentQuestion += 1;
    }

}
