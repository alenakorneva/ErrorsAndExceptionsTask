import subjects.Subjects;
import exceptions.InappropriateMarkException;
import exceptions.SubjectsAbsenceException;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private final int id;
    private String studentName;
    private String studentSurname;
    private Faculties faculty;
    private Groups group;
    private Subjects firstSubject;
    private ArrayList<Integer> firstSubjectMarks;
    private Subjects secondSubject;
    private ArrayList<Integer> secondSubjectMarks;
    private Subjects thirdSubject;
    private ArrayList<Integer> thirdSubjectMarks;

    private Student(Builder builder) {
        id = builder.id;
        studentName = builder.studentName;
        studentSurname = builder.studentSurname;
        faculty = builder.faculty;
        group = builder.group;
        try {
            if (builder.firstSubject == null && builder.secondSubject == null && builder.thirdSubject == null) {
                throw new SubjectsAbsenceException("Student " + studentName + " " + studentSurname + " hasn't got any subjects");
            } else {
                firstSubject = builder.firstSubject;
                secondSubject = builder.secondSubject;
                thirdSubject = builder.thirdSubject;
            }
        } catch (SubjectsAbsenceException e) {
            e.getMessage();
            e.printStackTrace();
        }
        firstSubjectMarks = builder.firstSubjectMarks;
        secondSubjectMarks = builder.secondSubjectMarks;
        thirdSubjectMarks = builder.thirdSubjectMarks;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public Groups getGroup() {
        return group;
    }

    public String getGroupName() {
        return group.getGroupTitle();
    }

    public Subjects getFirstSubject() {
        return firstSubject;
    }

    public ArrayList<Integer> getFirstSubjectMarks() {
        return firstSubjectMarks;
    }

    public Subjects getSecondSubject() {
        return secondSubject;
    }

    public ArrayList<Integer> getSecondSubjectMarks() {
        return secondSubjectMarks;
    }

    public Subjects getThirdSubject() {
        return thirdSubject;
    }

    public ArrayList<Integer> getThirdSubjectMarks() {
        return thirdSubjectMarks;
    }

    public static class Builder {
        private final int id;
        private String studentName;
        private String studentSurname;

        private Faculties faculty;
        private Groups group;
        private Subjects firstSubject;
        private ArrayList<Integer> firstSubjectMarks = new ArrayList<>();
        private Subjects secondSubject;
        private ArrayList<Integer> secondSubjectMarks = new ArrayList<>();
        private Subjects thirdSubject;
        private ArrayList<Integer> thirdSubjectMarks = new ArrayList<>();

        public Builder(int id, String studentName, String studentSurname) {
            this.id = id;
            this.studentName = studentName;
            this.studentSurname = studentSurname;
        }

        public Builder setFaculty(Faculties facultyValueToInitialize) {
            faculty = facultyValueToInitialize;
            return this;
        }

        public Builder setGroup(Groups groupValueToInitialize) {
            group = groupValueToInitialize;
            return this;
        }

        public Builder setFirstSubjectAndMarks(Subjects firstSubjectToInitialize, Integer... marks) {
            firstSubject = firstSubjectToInitialize;
            for (Integer mark : marks) {
                try {
                    if (mark > 0 && mark <= 10) {
                        firstSubjectMarks.add(mark);
                    } else {
                        throw new InappropriateMarkException(mark + " this mark for " + firstSubjectToInitialize.toString() + " студента " + studentName + " " + studentSurname + " is not in an appropriate range");
                    }
                } catch (InappropriateMarkException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            }
            return this;
        }

        public Builder setSecondSubjectAndMarks(Subjects secondSubjectToInitialize, Integer... marks) {
            secondSubject = secondSubjectToInitialize;
            for (Integer mark : marks) {
                try {
                    if (mark > 0 && mark <= 10) {
                        secondSubjectMarks.add(mark);
                    } else {
                        throw new InappropriateMarkException(mark + " this mark for " + secondSubjectToInitialize.toString() + " " + studentName + " " + studentSurname + " is not in an appropriate range");
                    }
                } catch (InappropriateMarkException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            }
            return this;
        }

        public Builder thirdSubjectAndMarks(Subjects thirdSubjectToInitialize, Integer... marks) {
            thirdSubject = thirdSubjectToInitialize;
            for (Integer mark : marks) {
                try {
                    if (mark > 0 && mark <= 10) {
                        thirdSubjectMarks.add(mark);
                    } else {
                        throw new InappropriateMarkException(mark + " this mark for " + thirdSubjectToInitialize.toString() + " " + studentName + " " + studentSurname + " is not in an appropriate range");
                    }
                } catch (InappropriateMarkException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            }
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(studentName, student.studentName) && Objects.equals(studentSurname, student.studentSurname) && faculty == student.faculty && group == student.group && Objects.equals(firstSubject, student.firstSubject) && Objects.equals(firstSubjectMarks, student.firstSubjectMarks) && Objects.equals(secondSubject, student.secondSubject) && Objects.equals(secondSubjectMarks, student.secondSubjectMarks) && Objects.equals(thirdSubject, student.thirdSubject) && Objects.equals(thirdSubjectMarks, student.thirdSubjectMarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, studentSurname, faculty, group, firstSubject, firstSubjectMarks, secondSubject, secondSubjectMarks, thirdSubject, thirdSubjectMarks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", setFaculty=" + faculty +
                ", setGroup=" + group +
                ", setFirstSubjectAndMarks=" + firstSubject +
                ", firstSubjectMarks=" + firstSubjectMarks +
                ", setSecondSubjectAndMarks=" + secondSubject +
                ", secondSubjectMarks=" + secondSubjectMarks +
                ", thirdSubjectAndMarks=" + thirdSubject +
                ", thirdSubjectMarks=" + thirdSubjectMarks +
                '}';
    }
}
