package test_demo_03;

import java.io.*;

public class EmployeeTest{
 
   public static void main(String[] args){
      /* ʹ�ù����������������� */

      Employee empOne = new Employee("Tencent");
      Employee empTwo = new Employee("Alibaba");
 
      // ��������������ĳ�Ա����
      empOne.empAge(22);
      empOne.empDesignation("������Թ���ʦ");
      empOne.empSalary(15000);
      empOne.printEmployee();
 
      empTwo.empAge(28);
      empTwo.empDesignation("�߼�������Թ���ʦ");
      empTwo.empSalary(30000);
      empTwo.printEmployee();
   }
}