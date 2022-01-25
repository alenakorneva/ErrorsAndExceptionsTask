import java.util.ArrayList;

public enum Faculties {
    ECONOMIC_FACULTY ("Economic Faculty"),
    ELECTROTECHNICAL_FACULTY("Electrotechnical Faculty"),
    CIVIL_CONSTRUCTION_FACULTY("Civil Construction Faculty"),
    TRANSPORTATION_MANAGEMENT_FACULTY("Transportation Management Faculty");

    private String facultyTitle;

    Faculties(String facultyTitle){
        this.facultyTitle = facultyTitle;
    }

    public String getFacultyTitle(){
        return facultyTitle;
    }

    public static ArrayList<Faculties> getListOfFaculties() {
        ArrayList<Faculties> faculties = new ArrayList<Faculties>() {{
            add(ECONOMIC_FACULTY);
            add(ELECTROTECHNICAL_FACULTY);
            add(CIVIL_CONSTRUCTION_FACULTY);
            add(TRANSPORTATION_MANAGEMENT_FACULTY);
        }};
        return faculties;
    }
}
