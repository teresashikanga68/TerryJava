public class TestAccounts {

    public static void main(String[] args) {

        Account acc1= new Account("Mary","001",3000);
        Account acc2= new Account("Joel","002",100000);
        Account acc3= new Account("Job","003",300000);
        Account acc4= new Account("Mercy","004",500000);
        Account acc5= new Account("John","005",20000);

        System.out.println(acc1.getBalance());

        acc1.setBalance(6500);
        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();

        String name= "John";
        name.toLowerCase();
        int x=10;
        double z= 88;
        boolean fiished = true;

        Account[]accounts= {acc1,acc2,acc3,acc4,acc5};

        for (Account k : accounts){
            k.printDetails();
            k.printDetails();
        }




    }

























































































}
