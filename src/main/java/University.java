import exceptions.StudentsAbsenceInGroupException;
import subjects.Subjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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
        Collection<ArrayList<Integer>> marksOfAllSubjects = studentToCountAverageScore.getSubjectsWithMarks().values();
        for (ArrayList<Integer> marks : marksOfAllSubjects) {
            for (Integer mark : marks) {
                sum += mark;
                amount += 1;
            }
        }
        return sum / amount;
    }

    public double countAverageScoreOfSubjectInGroupOnFaculty(Subjects requiredSubject, Groups requiredGroup, Faculties requiredFaculty) {
        int sum = 0;
        int amount = 0;
        for (Student student : students) {
            if (student.getGroup().equals(requiredGroup) && student.getFaculty().equals(requiredFaculty)) {
                Set<Subjects> studentsSubjects = student.getSubjectsWithMarks().keySet();
                for (Subjects subject : studentsSubjects) {
                    if (subject.equals(requiredSubject)) {
                        for (Integer mark : student.getSubjectsWithMarks().get(subject)) {
                            sum += mark;
                            amount += 1;
                        }
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
                Set<Subjects> studentsSubjects = student.getSubjectsWithMarks().keySet();
                for (Subjects subject : studentsSubjects) {
                    if (subject.equals(requiredSubject)) {
                        for (Integer mark : student.getSubjectsWithMarks().get(subject)) {
                            sum += mark;
                            amount += 1;
                        }
                    }
                }
            }
        }
        return sum / amount;
    }

    public University(List<? extends Student> students) {
        this.students = students;
        List<Groups> groups = new ArrayList<>(Groups.getListOfGroups());
        for (Groups group : groups) {
            boolean hasSomeStudents = false;
            for (Student student : this.students) {
                if (student.getGroup().equals(group)) {
                    hasSomeStudents = true;
                    break;
                } else {
                    hasSomeStudents = false;
                }
            }
            try {
                if (!hasSomeStudents) {
                    throw new StudentsAbsenceInGroupException("The group " + group.toString() + " has no students.");
                }
            } catch (StudentsAbsenceInGroupException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }
}
