package com.qxcto.chapter9;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/11/7:28
 * @Description: 只有四个对象的类和枚举类
 */
public class Season {
    private final String S_NAME;
    private final String S_DESC;

    //类似饿汉式单例模式，先实例化完成，用的时候再调用方法返回
    private static Season spring = new Season("春天","生机");
    private static Season summer = new Season("夏天","炎热");
    private static Season autumn = new Season("秋天","收获");
    private static Season winter = new Season("冬天","银装素裹");


    private Season(String name, String desc){
        this.S_NAME = name;
        this.S_DESC = desc;
        System.out.println("name:"+this.S_NAME+"desc:"+this.S_DESC);
    }

    public static Season getSpring(){
        return spring;
    }
    public static Season getSummer(){
        return summer;
    }
    public static Season getAutumn(){
        return autumn;
    }
    public static Season getWinter(){
        return winter;
    }
}

enum SeasonEnum {
    SPRING("春天","2月"),
    SUMMER("夏天","5月"),//对应有参构造
    AUTUMN("秋天","8月"),
    WINTER("冬天","11月");
    //WINTER();//对应无参构造,一般不写无参构造因为属性需要在构造器中被赋值

    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName(){
        return seasonName;
    }

    public String getSeasonDesc(){
        return seasonDesc;
    }

    public void showInfo(){
        System.out.println("this.name="+this.seasonName);
    }

}
