import exceptions.StudentsAbsenceInGroupException;
import subjects.Subjects;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<? extends Student> students;

    public Student findStudentById(int id) {
        List<? extends Student> students = this.students;
        Student requiredStudent = null;
        for (Student student : students) {
            if (student.getId() == id) requiredStudent = student;
        }
        return requiredStudent;
    }

    public double countAverageScoreOfAllSubjects(Student studentToCountAverageScore) {
        int sum = 0;
        int amount = 0;
        for (Integer mark : studentToCountAverageScore.getFirstSubjectMarks()) {
            sum += mark;
            amount += 1;
        }
        for (Integer mark : studentToCountAverageScore.getSecondSubjectMarks()) {
            sum += mark;
            amount += 1;
        }
        for (Integer mark : studentToCountAverageScore.getThirdSubjectMarks()) {
            sum += mark;
            amount += 1;
        }
        return sum / amount;
    }

    public double countAverageScoreOfSubjectInGroupOnFaculty(Subjects requiredSubject, Groups requiredGroup, Faculties requiredFaculty) {
        int sum = 0;
        int amount = 0;
        for (Student student : students) {
            if (student.getGroup().equals(requiredGroup) && student.getFaculty().equals(requiredFaculty)) {
                if (student.getFirstSubject().equals(requiredSubject)) {
                    for (Integer mark : student.getFirstSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                } else if (student.getSecondSubject().equals(requiredSubject)) {
                    for (Integer mark : student.getFirstSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                } else {
                    for (Integer mark : student.getThirdSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                }
            }

        }
        return sum / amount;
    }

    public double countAverageScoreOfSubjectOnFaculty(Subjects requiredSubject, Faculties requiredFaculty) {
        int sum = 0;
        int amount = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(requiredFaculty)) {
                if (student.getFirstSubject().equals(requiredSubject)) {
                    for (Integer mark : student.getFirstSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                } else if (student.getSecondSubject().equals(requiredSubject)) {
                    for (Integer mark : student.getFirstSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                } else {
                    for (Integer mark : student.getThirdSubjectMarks()) {
                        sum += mark;
                        amount += 1;
                    }
                }
            }
        }
        return sum / amount;
    }

    public University(List<? extends Student> students) {
        this.students = students;
        List<Groups> groups = new ArrayList<>(Groups.getListOfGroups());
        //не работает
        for (Groups group : groups) {
            boolean hasSomeStudents = false;
            for (Student student : this.students) {
                if (student.getGroup() == group) {
                    hasSomeStudents = true;
                    break;
                } else {
                    hasSomeStudents = false;
                }
            }
            try {
                if (hasSomeStudents) {
                    break;
                } else {
                    throw new StudentsAbsenceInGroupException("The group " + group.toString() + " has no students.");
                }
            } catch (StudentsAbsenceInGroupException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }
}
