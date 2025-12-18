package main.java.Entity;

public class Answer {
    int answerId;
    String content;
    int questionId;
    boolean isCorrect;

    public Answer(int answerId, String content, int questionId, boolean isCorrect) {
        this.answerId = answerId;
        this.content = content;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", content='" + content + '\'' +
                ", questionId=" + questionId +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
