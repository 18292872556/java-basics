package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/19:35
 * @Description: 匿名内部类，代码块
 */
public class Test {

//    {
//        System.out.println("这是一个代码块");
//    }
//
//    static{
//        System.out.println("这是一个静态代码块");
//    }

    public static void main(String[] args) {
//        new Person();
//        new Person();
//        new Person();

        //匿名内部类
//        Student p = new Student(){
//            //这是一个Student的匿名子类
//            //问题？现在想把name改成李四，但是不想动Student的代码
//            {
//                //在匿名内部类中，用代码块代替构造方法，为类属性初始化
//                super.name = "李四";
//                super.schoolName = "第一小学";
//                System.out.println("匿名子类中用代码块替代构造器");
//            }
//
//            @Override
//            public void test() {
//                System.out.println("在Student的匿名子类中重写test方法");
//            }
//        };
//
//        System.out.println(p.name+","+p.schoolName);
//        p.test();


//        Animal fish = new Fish();
//        Fish fish2 = new Fish();
//        fish.move();
//        fish2.move();
//
//        Animal dog = new Dog();
//        Dog dog2 = new Dog();
//        dog.move();
//        dog2.move();
//
//        Animal bird = new Brid();
//        Brid bird2 = new Brid();
//        bird.move();
//        bird2.move();

//        Employee e1 = new CommonEmployee();
//        CommonEmployee e2 = new CommonEmployee();
//
//        Employee e3 = new Manager();
//        Manager e4 = new Manager();
//        e1.work();
//        e2.work();
//
//        e3.work();
//        e4.work();

//        SubTemplate s1 = new SubTemplate();
//        s1.getTime();

//        TestInTmp1 t1 = new TestInTmp1();
//        t1.start();


//        TeacherSC t1 = new TeacherSC();
//        t1.setInfo("艾丽",25,"女","物理");
//        t1.showInfo();

        //这是开发人员B的工作
//        BWM b3 = new BWM3Factory().productBWM();
//        b3.showInfo();
//
//        BWM b5 = new BWM5Factory().productBWM();
//        b5.showInfo();
//
//        BWM b7 = new BWM7Factory().productBWM();
//        b7.showInfo();

//        A a = new A();
//        a.showInfo();
//
//        Test3 t3 = new Test3();
//        t3.showInfo();

        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);

    }
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println(s3.a);
    }

    class Inner{
        public int a = 5;
    }

    Person2 p = new Person2(){
        {
            //在匿名内部类中必须用代码块代替构造方法，因为匿名内部类没有构造
            super.name = "haha";
        }
        int i = 0;
        void showInfo2(){

        }

    };

}
