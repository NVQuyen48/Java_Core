package main.java.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Question {
    int questionId;
    String content;
    int categoryId;
    int typeId;
    int creatorId;
    LocalDate createDate;

    public Question(int questionId, String content, int categoryId, int typeId, int creatorId, LocalDate createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryId = categoryId;
        this.typeId = typeId;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getQuestionId() {
        return questionId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", content='" + content + '\'' +
                ", categoryId=" + categoryId +
                ", typeId=" + typeId +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                '}';
    }
}
