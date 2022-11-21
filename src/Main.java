import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 
        Student student=new Student(22101022L,"Jenishbekov",20,'M',12000);
        Student student1=new Student(210102002L,"Asangaziev",22,'M',12000);
        Student student2 = new Student(234345354L,"",18,'M',12000);
        Student student3 = new Student(13243565L,"Eliza Ashirbaeva",17,'F',8000);
        Student[] students = {student,student1,student2,student3};
        System.out.println(Arrays.toString(students));

        Instructor instructor=new Instructor(1234561L,"Asangazieva",26,'W',30000);
        Mentor mentor=new Mentor(212233442L,"Kurbanov",22,'M',25000);
        System.out.println();


        Instructor instructor1 = new Instructor(51234567890L,"Aijamal Asangazieva",23,'F',50000);
        System.out.println(instructor);
        System.out.println();


        Mentor mentor1 = new Mentor(61234567890L,"Massat Akylbek uulu",35,'M',60000);
        Mentor mentor2 = new Mentor(7234567890L,"Muhammed Toichubai uulu",22,'M',50000);
        Mentor mentor3 = new Mentor(8123456789L,"Rahim Bazarbai uulu",20,'M',40000);
        Mentor[] mentors = {mentor,mentor1,mentor2};
        System.out.println(Arrays.toString(mentors));
        System.out.println();

        LocalDate date = LocalDate.of(2022,10,1);
        LocalDate dateOfFinish = LocalDate.of(2023,7,1);
        System.out.println();


        Group group = new Group("Java-8",students,date,dateOfFinish);
        Group group1 = new Group("Js-8",students,date,dateOfFinish);
        Group[] groups = {group,group1};
        System.out.println(Arrays.toString(groups));
        System.out.println();


        Course course = new Course("Backend",groups,instructor,mentors);
        Course course1 = new Course("Fronted",groups,instructor,mentors);
        Course[] courses = {course,course1};
        System.out.println(Arrays.toString(courses));
        System.out.println();

        Company company = new Company("PeakSoft House", "Vostokt5",courses,"Java");
        System.out.println(company);
        System.out.println();

        System.out.println("Contact: "+Company.income(students));
        System.out.println("Mentor salary: "+mentor.getSalary());
        System.out.println("Instructors: "+instructor.getSalary());

        System.out.println("PeakSoft Mentor period: "+mentor.period(group));
        System.out.println("PeaSoft Instructor period: "+instructor.period(group));
        System.out.println("PeakSoft Student period: "+student.period(group));



        Person[] people = {
                new Student(112345678L,"Alibek Altynbek uulu",20,'M',12000),
                new Student(2123456789L,"Aigerim Bektenova",17,'F',8000),
                new Student(31234567890L,"Adil Aitbaev",18,'M',12000),
                new Student(4123456789L,"Eliza Ashirbaeva",17,'F',8000),
                new Instructor(512345678L,"Aijamal Asangazieva",23,'F',50000),
                new Mentor(6123456789L,"Massat Akylbek uulu",35,'M',60000),
                new Mentor(712345678L,"Muhammed Toichubai uulu",22,'M',50000),
                new Mentor(812345678L,"Rahim Bazarbai uulu",20,'M',40000),
        };

        Person.sortAge(people);

        }
    }

