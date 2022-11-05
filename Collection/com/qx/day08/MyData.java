package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/14/13:57
 * @Description:
 */
public class MyData {
    int year;
    int month;
    int day;

   /**
   * @Description: 重写Object类的equals方法，使其对于普通类MyData也比较内容
    * 因为==对于基础数据类型比价的是内容，对于引用类比较的是对象地址
    * 而equals只能比较引用对象，比较对象地址。但对于特殊类型String，File，Data,包装类比较的是内容
   * @Param: [obj]
   * @return: boolean
   * @Author: xuexuezi
   * @Date: 2022/8/14
   */
    @Override
    public boolean equals(Object obj) {
        int flag = 0;
        if(obj instanceof MyData){
            MyData myObj= (MyData)obj;
            
            if(myObj.year != this.year){
                flag++;
            }
            if(myObj.month != this.month){
                flag++;
            }
            if(myObj.day != this.day){
                flag++;
            }
        }

        return flag==0?true:false;
    }

    /**
    * @Description: 重写Object类的toString方法,使其从输出对象地址到输出对象内容
    * @Param: []
    * @return: java.lang.String
    * @Author: xuexuezi
    * @Date: 2022/8/14
    */
    @Override
    public String toString() {
        String str = getClass().getName()+"[year="+this.year+",month="+this.month+",day="+this.day+"]";
        return str;
    }
}
