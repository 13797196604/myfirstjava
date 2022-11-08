package exer;

public class ExerText001 {
    public static void main(String[] args) {
        Exer001 text = new Exer001(7500,1231);
        if (text.getPayment()<text.getSpend()){
            System.out.println("应付款不足。");
        }else {
            int a5000 = text.getCollection()/5000;
            int a1000 = text.getCollection()%5000/1000;
            int a500 = text.getCollection()%5000%1000/500;
            int a100 = text.getCollection()%5000%1000%500/100;
            int a50 = text.getCollection()%5000%1000%500%100/50;
            int a10 = text.getCollection()%5000%1000%500%100%50/10;
            int a1 = text.getCollection()%5000%1000%500%100%50%10/1;
            System.out.println("应付款:" + text.getPayment());
            System.out.println("实际付款:" + text.getSpend());
            System.out.println("应找钱:" + text.getCollection());
            System.out.print("其中:");
            System.out.println("五千元：" + a5000 + "张");
            System.out.println('\t'+"一千元：" + a1000 + "张");
            System.out.println('\t'+"五百元：" + a500 + "张");
            System.out.println('\t'+"一百元：" + a100 + "张");
            System.out.println('\t'+"五十元：" + a50 + "张");
            System.out.println('\t'+"十元：" + a10 + "张");
            System.out.println('\t'+"一元：" + a1 + "张");
        }
    }
}
