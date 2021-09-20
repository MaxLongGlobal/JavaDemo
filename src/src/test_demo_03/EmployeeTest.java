package test_demo_03;

import java.io.*;

public class EmployeeTest{
 
   public static void main(String[] args){
      /* 使用构造器创建两个对象 */

      Employee empOne = new Employee("Tencent");
      Employee empTwo = new Employee("Alibaba");
 
      // 调用这两个对象的成员方法
      empOne.empAge(22);
      empOne.empDesignation("软件测试工程师");
      empOne.empSalary(15000);
      empOne.printEmployee();
 
      empTwo.empAge(28);
      empTwo.empDesignation("高级软件测试工程师");
      empTwo.empSalary(30000);
      empTwo.printEmployee();
   }
}