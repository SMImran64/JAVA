
package superclassandsubclass;


public class EducationSystem {
    
    private String buidings;
    private String classroom;
    private String teacher;
    private String books;
    private String library;

    public EducationSystem() {
    }

    public EducationSystem(String buidings, String classroom, String teacher, String books, String library) {
        this.buidings = buidings;
        this.classroom = classroom;
        this.teacher = teacher;
        this.books = books;
        this.library = library;
    }

    public String getBuidings() {
        return buidings;
    }

    public void setBuidings(String buidings) {
        this.buidings = buidings;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "EducationSystem{" + "buidings=" + buidings + ", classroom=" + classroom + ", teacher=" + teacher + ", books=" + books + ", library=" + library + '}';
    }

    
    
}
