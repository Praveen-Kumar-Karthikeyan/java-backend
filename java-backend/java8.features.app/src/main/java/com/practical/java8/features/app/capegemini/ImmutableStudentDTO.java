package com.practical.java8.features.app.capegemini;

public final class ImmutableStudentDTO {

    private final String studentName;
    private final Integer studentId;

    public ImmutableStudentDTO(String studentName, Integer studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }
}
