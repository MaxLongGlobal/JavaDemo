package test_demo_09;


public class Test02{
    public static void main(String[] args){
        int a = 3;//����һ��������
//        int b = ++a;//��������
        int b = a++;//��������

        int c = 3;
//        int d = --c;//�Լ�����
        int d = c--;//�Լ�����

        System.out.println("��������������ֵ����"+b);
        System.out.println("�����Լ�������ֵ����"+d);
    }
}