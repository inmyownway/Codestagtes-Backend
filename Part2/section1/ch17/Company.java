package Part2.section1.ch17;

public class Company {
    // 회사 객체는 한개, 하나의 인스턴스만 존재 한다 외부에서 NEw 못하게 생성자 만듬
    private static Company instance = new Company();
    // 유일한 객체, 요소

    public static Company getInstance(){
       if(instance==null)
           instance = new Company();
       return instance;
    }
    private Company()
    {

    }

}
