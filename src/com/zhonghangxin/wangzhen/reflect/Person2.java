package com.zhonghangxin.wangzhen.reflect;

class Person2 implements China{
    public Person2() {
         
    }
    public Person2(String sex){
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public void sayChina(){
        System.out.println("hello ,china");
    }
    @Override
    public void sayHello(String name, int age){
        System.out.println(name+"  "+age);
    }
    private String sex;
}
