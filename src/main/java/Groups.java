import java.util.ArrayList;
import java.util.Arrays;

public enum Groups {
    ECONOMIC_FACULTY_GROUP1(Faculties.ECONOMIC_FACULTY, "Group 1"),
    ECONOMIC_FACULTY_GROUP2(Faculties.ECONOMIC_FACULTY, "Group 2"),
    ELECTROTECHNICAL_FACULTY_GROUP1(Faculties.ELECTROTECHNICAL_FACULTY, "Group 1"),
    ELECTROTECHNICAL_FACULTY_GROUP2(Faculties.ELECTROTECHNICAL_FACULTY, "Group 2"),
    CIVIL_CONSTRUCTION_FACULTY_GROUP1(Faculties.CIVIL_CONSTRUCTION_FACULTY, "Group 1"),
    CIVIL_CONSTRUCTION_FACULTY_GROUP2(Faculties.CIVIL_CONSTRUCTION_FACULTY, "Group 2"),
    TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY, "Group 1"),
    TRANSPORTATION_MANAGEMENT_FACULTY_GROUP2(Faculties.TRANSPORTATION_MANAGEMENT_FACULTY, "Group 2");

    private String groupTitle;
    private Faculties facultyGroupRelatesTo;

    Groups(Faculties groupFaculty, String groupTitle) {
        this.facultyGroupRelatesTo = groupFaculty;
        this.groupTitle = groupTitle;
    }

    public Faculties getFacultyGroupRelatesTo() {
        return facultyGroupRelatesTo;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public static ArrayList<Groups> getListOfGroups() {
        ArrayList<Groups> groups = new ArrayList<>(Arrays.asList(Groups.values()));
        return groups;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groupTitle='" + groupTitle + '\'' +
                ", facultyGroupRelatesTo='" + facultyGroupRelatesTo + '\'' +
                '}';
    }
}
