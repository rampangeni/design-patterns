package com.example.my.design.pattern;

import com.sun.media.sound.SF2InstrumentRegion;

public class Student {
    private String firstName;
    private String lastName;
    private Integer rollNumber;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getRollNumber() {
        return this.rollNumber;
    }

    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.rollNumber = builder.rollNumber;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer rollNumber;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setRollNumber(Integer rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
