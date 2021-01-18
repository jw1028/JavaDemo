package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with Intellig IDEA
 * Description:
 * User: zjc
 * Date: 2021- 01 -18
 * Time: 20:47
 */
//管理员用户
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.operations=new IOperation[]{
                new Exit(),
                new FInd(),
                new Add(),
                new Delete(),
                new Display()

        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("hello " + this.name + "欢迎来到图书系统！");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("===============================");
        int choice = scanner.nextInt();
        return  choice;
    }


}
