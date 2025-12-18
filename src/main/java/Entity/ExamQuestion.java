package main.java.Entity;

public class ExamQuestion {
    int examId;
    int questionId;

    public ExamQuestion(int examId, int questionId) {
        this.examId = examId;
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "examId=" + examId +
                ", questionId=" + questionId +
                '}';
    }
}
