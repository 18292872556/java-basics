package chapter13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/10/5:42
 * @Description:
 */
public class Student extends Person implements Move,Study{
    public Student(){
        System.out.println("调用的是 public Student()");
    }

    public Student(int age){
        this.age = age;
        System.out.println("调用的是 public Student(int age)");
    }
    protected Student(String school){
        this.school = school;

        System.out.println("调用的是 protected Student(String school)");
    }

    private Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("调用的是 private Student(String name, int age）");

    }

    String school;
    public void showInfo(){
        System.out.println("学校是:"+this.school);
    }


    @Override
    public void moveTy() {
        System.out.println("骑自行车上学");
    }

    @Override
    public void studyInfo() {
        System.out.println("学习的是中学的知识");
    }

    private void test(String name){

    }

    public String getSchool(){
        return this.school;
    }

}
