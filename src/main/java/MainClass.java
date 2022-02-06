import exceptions.FacultiesAbsenceInUniversityException;
import exceptions.GroupsAbsenceAtFacultyException;
import exceptions.InappropriateMarkException;
import exceptions.SubjectsAbsenceException;
import subjects.CivilConstructionFacultySubjects;
import subjects.EconomicFacultySubjects;
import subjects.ElectrotechnicalFacultySubjects;
import subjects.TransportationManagementFacultySubjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> students = null;
        try {
            students = Arrays.asList(
                    new Student.Builder(1, "Аня", "Сельцова")
                            .setFaculty(Faculties.ELECTROTECHNICAL_FACULTY).setGroup(Groups.ELECTROTECHNICAL_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, 8, 7, 8)
                            .setSecondSubjectAndMarks(ElectrotechnicalFacultySubjects.AUTOMATION_AND_COMMUNICATION, 8, 9, 6)
                            .thirdSubjectAndMarks(ElectrotechnicalFacultySubjects.INFORMATION_MANAGEMENT_SYSTEMS_AND_TECHNOLOGIES, 8, 7, 9).build(),
                    new Student.Builder(2, "Катя", "Фещенко")
                            .setFaculty(Faculties.ELECTROTECHNICAL_FACULTY).setGroup(Groups.ELECTROTECHNICAL_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, 8, 7, 6)
                            .setSecondSubjectAndMarks(ElectrotechnicalFacultySubjects.AUTOMATION_AND_COMMUNICATION, 9, 9, 8)
                            .thirdSubjectAndMarks(ElectrotechnicalFacultySubjects.INFORMATION_MANAGEMENT_SYSTEMS_AND_TECHNOLOGIES, 7, 8, 9).build(),
                    new Student.Builder(3, "Оля", "Попкова")
                            .setFaculty(Faculties.ELECTROTECHNICAL_FACULTY).setGroup(Groups.ELECTROTECHNICAL_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, 8, 7, 9)
                            .setSecondSubjectAndMarks(ElectrotechnicalFacultySubjects.AUTOMATION_AND_COMMUNICATION, 6, 9, 10)
                            .thirdSubjectAndMarks(ElectrotechnicalFacultySubjects.INFORMATION_MANAGEMENT_SYSTEMS_AND_TECHNOLOGIES, 8, 7, 9).build(),
                    new Student.Builder(4, "Таня", "Бодунова")
                            .setFaculty(Faculties.ELECTROTECHNICAL_FACULTY).setGroup(Groups.ELECTROTECHNICAL_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, 7, 5, 9)
                            .setSecondSubjectAndMarks(ElectrotechnicalFacultySubjects.AUTOMATION_AND_COMMUNICATION, 9, 5, 7)
                            .thirdSubjectAndMarks(ElectrotechnicalFacultySubjects.INFORMATION_MANAGEMENT_SYSTEMS_AND_TECHNOLOGIES, 5, 6, 8).build(),
                    new Student.Builder(5, "Надя", "Букавнева")
                            .setFaculty(Faculties.ELECTROTECHNICAL_FACULTY).setGroup(Groups.ELECTROTECHNICAL_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, 7, 9, 10)
                            .setSecondSubjectAndMarks(ElectrotechnicalFacultySubjects.AUTOMATION_AND_COMMUNICATION, 9, 9, 10)
                            .thirdSubjectAndMarks(ElectrotechnicalFacultySubjects.INFORMATION_MANAGEMENT_SYSTEMS_AND_TECHNOLOGIES, 8, 9, 10).build(),
                    new Student.Builder(6, "Ксюша", "Ковалевич")
                            .setFaculty(Faculties.CIVIL_CONSTRUCTION_FACULTY).setGroup(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_MECHANICS, 9, 8, 10)
                            .setSecondSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_TECHNOLOGIES, 10, 9, 10)
                            .thirdSubjectAndMarks(CivilConstructionFacultySubjects.ARCHITECTURE, 9, 8, 8).build(),
                    new Student.Builder(7, "Маша", "Рокач")
                            .setFaculty(Faculties.CIVIL_CONSTRUCTION_FACULTY).setGroup(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_MECHANICS, 7, 6, 8)
                            .setSecondSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_TECHNOLOGIES, 8, 6, 5)
                            .thirdSubjectAndMarks(CivilConstructionFacultySubjects.ARCHITECTURE, 6, 7, 6).build(),
                    new Student.Builder(8, "Маша", "Подобная")
                            .setFaculty(Faculties.CIVIL_CONSTRUCTION_FACULTY).setGroup(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_MECHANICS, 6, 7, 5)
                            .setSecondSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_TECHNOLOGIES, 7, 9, 6)
                            .thirdSubjectAndMarks(CivilConstructionFacultySubjects.ARCHITECTURE, 9, 4, 6).build(),
                    new Student.Builder(9, "Алена", "Корнева")
                            .setFaculty(Faculties.CIVIL_CONSTRUCTION_FACULTY).setGroup(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_MECHANICS, 9, 8, 7)
                            .setSecondSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_TECHNOLOGIES, 8, 9, 9)
                            .thirdSubjectAndMarks(CivilConstructionFacultySubjects.ARCHITECTURE, 9, 8, 8).build(),
                    new Student.Builder(10, "Саша", "Хоршунова")
                            .setFaculty(Faculties.CIVIL_CONSTRUCTION_FACULTY).setGroup(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_MECHANICS, 6, 7, 5)
                            .setSecondSubjectAndMarks(CivilConstructionFacultySubjects.CONSTRUCTION_TECHNOLOGIES, 7, 8, 6)
                            .thirdSubjectAndMarks(CivilConstructionFacultySubjects.ARCHITECTURE, 9, 5, 7).build(),
                    new Student.Builder(11, "Ира", "Россол")
                            .setFaculty(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY).setGroup(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(TransportationManagementFacultySubjects.AUTOMOBILE_TRANSPORTATION_AND_ROAD_TRAFFIC_MANAGEMENT, 9, 6, 7)
                            .setSecondSubjectAndMarks(TransportationManagementFacultySubjects.CARGO_AND_COMMERCIAL_WORK_MANAGEMENT, 6, 7, 6)
                            .thirdSubjectAndMarks(TransportationManagementFacultySubjects.LABOUR_PROTECTION, 9, 7, 6).build(),
                    new Student.Builder(12, "Андрей", "Корольков")
                            .setFaculty(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY).setGroup(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(TransportationManagementFacultySubjects.AUTOMOBILE_TRANSPORTATION_AND_ROAD_TRAFFIC_MANAGEMENT, 6, 7, 5)
                            .setSecondSubjectAndMarks(TransportationManagementFacultySubjects.CARGO_AND_COMMERCIAL_WORK_MANAGEMENT, 7, 8, 5)
                            .thirdSubjectAndMarks(TransportationManagementFacultySubjects.LABOUR_PROTECTION, 8, 8, 6).build(),
                    new Student.Builder(13, "Аня", "Казакова")
                            .setFaculty(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY).setGroup(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(TransportationManagementFacultySubjects.AUTOMOBILE_TRANSPORTATION_AND_ROAD_TRAFFIC_MANAGEMENT, 9, 7, 6)
                            .setSecondSubjectAndMarks(TransportationManagementFacultySubjects.CARGO_AND_COMMERCIAL_WORK_MANAGEMENT, 9, 6, 7)
                            .thirdSubjectAndMarks(TransportationManagementFacultySubjects.LABOUR_PROTECTION, 7, 8, 8).build(),
                    new Student.Builder(14, "Аня", "Мишота")
                            .setFaculty(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY).setGroup(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(TransportationManagementFacultySubjects.AUTOMOBILE_TRANSPORTATION_AND_ROAD_TRAFFIC_MANAGEMENT, 9, 6, 5)
                            .setSecondSubjectAndMarks(TransportationManagementFacultySubjects.CARGO_AND_COMMERCIAL_WORK_MANAGEMENT, 7, 7, 8)
                            .thirdSubjectAndMarks(TransportationManagementFacultySubjects.LABOUR_PROTECTION, 9, 7, 6).build(),
                    new Student.Builder(15, "Карина", "Дебова")
                            .setFaculty(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY).setGroup(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(TransportationManagementFacultySubjects.AUTOMOBILE_TRANSPORTATION_AND_ROAD_TRAFFIC_MANAGEMENT, 9, 7, 4)
                            .setSecondSubjectAndMarks(TransportationManagementFacultySubjects.CARGO_AND_COMMERCIAL_WORK_MANAGEMENT, 8, 5, 7)
                            .thirdSubjectAndMarks(TransportationManagementFacultySubjects.LABOUR_PROTECTION, 9, 5, 7).build(),
                    new Student.Builder(16, "Марина", "Ефименко")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 7, 8, 6)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 8, 9, 7)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 8, 9, 5).build(),
                    new Student.Builder(17, "Маша", "Микитчук")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 9, 8, 10)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 8, 7, 9)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 9, 7, 8).build(),
                    new Student.Builder(18, "Марина", "Курносова")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP1)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 6, 5, 7)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 8, 6, 5)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 4, 8, 6).build(),
                    new Student.Builder(19, "Даша", "Лучиц")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 5, 6, 5)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 7, 8, 4)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 6, 5, 8).build(),
                    new Student.Builder(20, "Инна", "Козырь")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 8, 7, 9)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 9, 6, 7)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 8, 5, 7).build(),
                    new Student.Builder(21, "Юля", "Егорова")
                            .setFaculty(Faculties.ECONOMIC_FACULTY).setGroup(Groups.ECONOMIC_FACULTY_GROUP2)
                            .setFirstSubjectAndMarks(EconomicFacultySubjects.ECONOMY_OF_TRANSPORTATION, 8, 7, 9)
                            .setSecondSubjectAndMarks(EconomicFacultySubjects.HISTORY, 8, 7, 9)
                            .thirdSubjectAndMarks(EconomicFacultySubjects.PHILOSOPHY, 8, 7, 9).build()
            );
        } catch (InappropriateMarkException | SubjectsAbsenceException e){
            e.getMessage();
            e.printStackTrace();
        }

        Groups[] groups = Groups.values();
        List<Faculties> faculties = new ArrayList<>(Faculties.getListOfFaculties());
        for (Faculties faculty : faculties) {
            boolean hasSomeGroups = false;
            for (Groups group : groups) {
                if (group.getFacultyGroupRelatesTo().equals(faculty)) {
                    hasSomeGroups = group.getFacultyGroupRelatesTo().equals(faculty);
                    break;
                } else {
                    hasSomeGroups = false;
                }
            }
            try {
                if (hasSomeGroups) {
                    break;
                } else {
                    throw new GroupsAbsenceAtFacultyException("The " + faculty.getFacultyTitle() + " hasn't got any groups");
                }
            } catch (GroupsAbsenceAtFacultyException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

        try {
            if (faculties.size() == 0) {
                throw new FacultiesAbsenceInUniversityException("There are no faculties in the University");
            }
        } catch (FacultiesAbsenceInUniversityException e) {
            e.getMessage();
            e.printStackTrace();
        }

        University university = new University(students);
        Student studentToCountAverageScore = university.findStudentById(11);
        //System.out.println(university.countAverageScoreOfAllSubjects(studentToCountAverageScore));
        university.countAverageScoreOfAllSubjects(studentToCountAverageScore);
        //System.out.println(university.countAverageScoreOfSubjectInGroupOnFaculty(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, Groups.ELECTROTECHNICAL_FACULTY_GROUP2, Faculties.ELECTROTECHNICAL_FACULTY ));
        university.countAverageScoreOfSubjectInGroupOnFaculty(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, Groups.ELECTROTECHNICAL_FACULTY_GROUP2, Faculties.ELECTROTECHNICAL_FACULTY);
        //System.out.println(university.countAverageScoreOfSubjectOnFaculty(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, Faculties.ELECTROTECHNICAL_FACULTY));
        university.countAverageScoreOfSubjectOnFaculty(ElectrotechnicalFacultySubjects.ELECTRICAL_ENGINEERING, Faculties.ELECTROTECHNICAL_FACULTY);
    }
}
