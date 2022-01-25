import java.util.ArrayList;

public enum Groups {
    ECONOMIC_FACULTY_GROUP1("Economic Faculty", "Group 1"),
    ECONOMIC_FACULTY_GROUP2("Economic Faculty", "Group 2"),
    ELECTROTECHNICAL_FACULTY_GROUP1("Electrotechnical Faculty", "Group 1"),
    ELECTROTECHNICAL_FACULTY_GROUP2 ("Electrotechnical Faculty", "Group 2"),
    CIVIL_CONSTRUCTION_FACULTY_GROUP1("Civil Construction Faculty", "Group 1"),
    CIVIL_CONSTRUCTION_FACULTY_GROUP2("Civil Construction Faculty", "Group 2"),
    TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1("Transportation Management Faculty", "Group 1"),
    TRANSPORTATION_MANAGEMENT_FACULTY_GROUP2("Transportation Management Faculty", "Group 2");

    private String groupTitle;
    private String facultyGroupRelatesTo;

    Groups(String groupFaculty, String groupTitle){
        this.facultyGroupRelatesTo = groupFaculty;
        this.groupTitle = groupTitle;
    }

    public String getFacultyGroupRelatesTo(){
        return facultyGroupRelatesTo;
    }

    public String getGroupTitle(){
        return groupTitle;
    }

    public static ArrayList<Groups> getListOfGroups(){
        ArrayList <Groups> groups = new ArrayList<Groups>(){{
            add(Groups.ECONOMIC_FACULTY_GROUP1);
            add(Groups.ECONOMIC_FACULTY_GROUP2);
            add(Groups.ELECTROTECHNICAL_FACULTY_GROUP1);
            add(Groups.ELECTROTECHNICAL_FACULTY_GROUP2);
            add(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP1);
            add(Groups.CIVIL_CONSTRUCTION_FACULTY_GROUP2);
            add(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP1);
            add(Groups.TRANSPORTATION_MANAGEMENT_FACULTY_GROUP2);
        }};
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
