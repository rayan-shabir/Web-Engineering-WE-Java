class QuizBase {
    String quiz;

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }
}

class QuizChild extends QuizBase {
    String quiz;

    public String getQuiz() {
        return super.quiz;
    }

    public void setQuiz(String quiz) {
        super.quiz = this.quiz;
    }
}

public class okyboss {
    public static void main(String args[]) {
        QuizBase objb = new QuizBase();
        objb.setQuiz("QUIZ");
        
        QuizChild objc = new QuizChild();
        objc.setQuiz("QUIZ");

        System.out.println(objb.getQuiz());
        System.out.println(objc.getQuiz());
    }
}
