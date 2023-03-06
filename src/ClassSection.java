import java.util.ArrayList;

public class ClassSection {
    String subject;
    int capacity;
    int yearLevel;
    ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }

    public void addStudent(Student other)
    {
        boolean alreadyExists = false;
        for(Student currStudent : students)
        {
            if(currStudent == other)
            {
                alreadyExists = true;
            }
        }

        if((!alreadyExists) && other.getYearLevel() == yearLevel)
        {
            students.add(other);
        }
    }

    public void removeStudent(Student other)
    {
        students.remove(other);
    }

    public boolean isStudentEnrolled(Student other)
    {
        for(Student curr : students)
        {
            if(curr.equals(other))
            {
                return true;
            }
        }
        return false;
    }
}
