package Part2.section1.ch16;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee lee = new Employee();
        lee.setEmployeeName("정민");
        System.out.println(lee.getEmployeeId());
        Employee kim = new Employee();

        kim.setEmployeeName("민수");
        System.out.println(kim.getEmployeeId());

   }
}
