package com.p2.ui;

import com.p2.bean.Customer;
import com.p2.service.CustomerList;
import com.p2.util.CMUtillity;

public class CustomerView {
    private CustomerList customers = new CustomerList(10);
    public CustomerView() {
        Customer customer = new Customer("周明滔", '男', 19, "13797196604", "799126016@qq.com");
        customers.addCustomer(customer);
    }
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
            System.out.println("---------------客户信息管理软件---------------");
            System.out.println("                 1 添加客户");
            System.out.println("                 2 修改客户");
            System.out.println("                 3 删除客户");
            System.out.println("                 4 客户列表");
            System.out.println("                 5 退   出");
            System.out.print("                 请选择(1-5):");
            char menu = CMUtillity.readMenuSelection();
            switch(menu){
                case '1':
                    addNewCustomer();
                    break;

                case '2':
                    modifyCustomer();
                    break;

                case '3':
                    deleteCustomer();
                    break;

                case '4':
                    listAllCustomer();
                    break;

                case '5':
                    System.out.print("是否确认退出(Y/N):");
                    char isExit = CMUtillity.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
        }

        }
    }
    private void addNewCustomer(){
        System.out.println("-----------------添加客户-----------------");
        System.out.print("姓名:");
        String name = CMUtillity.readString(10);
        System.out.print("性别:");
        char gender = CMUtillity.readChar();
        System.out.print("年龄:");
        int age = CMUtillity.readInt();
        System.out.print("电话:");
        String phone = CMUtillity.readString(11);
        System.out.print("邮箱:");
        String email = CMUtillity.readString(30);
        Customer cust = new Customer(name, gender, age, phone, email);
        boolean flag = customers.addCustomer(cust);
        if (flag) {
            System.out
                    .println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }

    }
    private void modifyCustomer(){
        System.out.println("-----------------修改客户-----------------");
        Customer cust;
        int number;
        for (;;){
            System.out.print("请输入待修改客户编号(-1退出):");
            number = CMUtillity.readInt();
            if (number == -1){
                return;
            }else{
            cust = customers.getCustomer(number - 1);
                if (cust == null){
                    System.out.println("无法找到指定客户！");
                }else{
                    break;
                }
            }
        }
        System.out.println("姓名(" + cust.getName() + "):");
        String name = CMUtillity.readString(10, cust.getName());
        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtillity.readChar(cust.getGender());
        System.out.print("年龄(" + cust.getAge() + ")：");
        int age = CMUtillity.readInt(cust.getAge());
        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtillity.readString(11, cust.getPhone());
        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtillity.readString(30, cust.getEmail());
        Customer newCust = new Customer(name, gender,age,phone,email);
        boolean isRepalaced = customers.replaceCustomer(number - 1, newCust);
        if (isRepalaced){
            System.out.println("-----------------修改成功-----------------");
        }else{
            System.out.println("-----------------修改失败-----------------");
        }


    }
    private void deleteCustomer(){
        System.out.println("---------------------删除客户---------------------");
        int number;
        for (;;){
            System.out.print("请选择待删除客户编号(-1退出)：");
            number = CMUtillity.readInt();
            if (number == -1){
                return;
            }else{
                Customer customer = customers.getCustomer(number - 1);
                if (customer == null){
                    System.out.println("无法找到指定客户");
                }else{
                    break;
                }
            }
        }
        System.out.println("确认是否删除(Y/N)：");
        char isDelete = CMUtillity.readConfirmSelection();
        if(isDelete == 'Y'){
            boolean deleteSuccess = customers.deleteCustomer(number - 1);
            if (deleteSuccess){
                System.out.println("---------------------删除完成---------------------");
            }else{
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }

        }


    }
    private void listAllCustomer(){
        System.out.println("-----------------客户列表-----------------");
        int Total = customers.getTotal();
        if (Total == 0){
            System.out.println("没有客户记录!");
        }else{
            System.out.println("编号\t姓名\t\t性别\t年龄\t\t电话\t\t邮箱\t");
            Customer[] custs = customers.getAllCustomers();
            for (int i = 0; i < custs.length; i++){
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() +
                        "\t"+ cust.getPhone() + "\t" +cust.getEmail());
            }
        }
        System.out.println("---------------客户列表完成----------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
