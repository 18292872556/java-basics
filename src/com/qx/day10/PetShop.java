package com.qx.day10;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/12/15:19
 * @Description:
 */
public class PetShop implements Comparator<PetShop> {
    public PetShop(){

    }
    public PetShop(String shopName,int petNum){
        this.shopName = shopName;
        this.petNum = petNum;
    }
    private int petNum;
    private String shopName;

    public int getPetNum(){
        return this.petNum;
    }
    public void setPetNum(int petNum){
        this.petNum = petNum;
    }

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getShopName(){
        return this.shopName;
    }

    @Override
    public int compare(PetShop o1, PetShop o2) {
        //return 0;
        if(o1.petNum > o2.petNum){
            return 1;//认为o1>o2，且排序由小到大
        }else if(o1.petNum < o2.petNum){
            return -1;
        }else{
            return 0;
        }


    }
}
