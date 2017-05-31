package com.zhonghangxin.wangzhen.reflect2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {  
	   
    public static void main(String[] args) throws Exception {  
   
        
       /* 
        * ʵ�л��� ����1 
        */  
       //String classPath = "com.whbs.bean.UserBean";  
       //Class cla = Test1.class.getClassLoader().loadClass(classPath);  
       //Object ob = cla.newInstance();  
        
       /* 
        * ʵ�л��� ����2 
        */  
       UserBean bean = new UserBean();  
       bean.setId(100);  
       bean.setAddress("�人");  
        
       //�õ������  
       Class userCla = (Class) bean.getClass();  
        
       /* 
        * �õ����е��������Լ��� 
        */  
       Field[] fs = userCla.getDeclaredFields();  
       for(int i = 0 ; i < fs.length; i++){  
           Field f = fs[i];  
           f.setAccessible(true); //����Щ�����ǿ��Է��ʵ�  
           Object val = f.get(bean);//�õ������Ե�ֵ     
        
           System.out.println("name:"+f.getName()+"\t value = "+val);  
            
           String type = f.getType().toString();//�õ������Ե�����  
           if (type.endsWith("String")) {  
              System.out.println(f.getType()+"\t��String");  
              f.set(bean,"12") ;        //��������ֵ  
           }else if(type.endsWith("int") || type.endsWith("Integer")){  
              System.out.println(f.getType()+"\t��int");  
              f.set(bean,12) ;       //��������ֵ  
           }else{  
              System.out.println(f.getType()+"\t");  
           }  
            
       }  
        
        
       /* 
        * �õ����еķ��� 
        */  
       Method[] methods = userCla.getMethods();  
       for(int i = 0; i < methods.length; i++){  
           Method method = methods[i];  
           if(method.getName().startsWith("get")){  
              System.out.print("methodName:"+method.getName()+"\t");  
              System.out.println("value:"+method.invoke(bean));//�õ�get ������ֵ  
           }  
       }  
    }  
   
}  