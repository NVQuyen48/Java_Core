package main.java.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Exam {
    int examId;
    String code;
    String title;
    int categoryId;
    int duration;
    int creatorId;
    LocalDate createDate;

    public Exam(int examId, String code, String title, int categoryId, int duration, int creatorId, LocalDate createDate) {
        this.examId = examId;
        this.code = code;
        this.title = title;
        this.categoryId = categoryId;
        this.duration = duration;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getExamId() {
        return examId;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", code=" + code +
                ", title='" + title + '\'' +
                ", categoryId=" + categoryId +
                ", duration=" + duration +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                '}';
    }
}
