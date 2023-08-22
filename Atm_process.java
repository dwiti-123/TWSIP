import java.util.Scanner;
import java.sql.*;
public class Atm_process {
    public static void main(String[] args) {
        try {
            //making connection to database
            String url="jdbc:mysql://localhost:3306/bank";
            String username="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            //connection formed

            //to check if user already have account
            System.out.println("Welcome to the Demo of ATM");
            System.out.println("Enter Account Number");
                Scanner sc= new Scanner(System.in);
                int acc_no=sc.nextInt();

                String sql="SELECT * FROM account WHERE account_no='" + acc_no + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                //if user have account
                if(rs.next()){
                    System.out.println("Account Found Successfully");
                    System.out.println("Please Select from given Options");
                    System.out.println("\n1 for Withdrawing Money" +
                                       "\n2 for Depositing Money" +
                                       "\n3 for Transferring Money" +
                                       "\n4 for Checking Balance");

                    Scanner sel=new Scanner(System.in);
                    int select=sel.nextInt();

                    if(select==1){
                        System.out.println("Enter The Amount To be Withdraw:");
                        Scanner w= new Scanner(System.in);
                        int withdraw=w.nextInt();

                        PreparedStatement ps1= conn.prepareStatement("UPDATE account SET withdraw=? WHERE account_no=?");
                        ps1.setInt(1,withdraw);
                        ps1.setInt(2,acc_no);

                        int a = ps1.executeUpdate();

                        PreparedStatement ps2=conn.prepareStatement("UPDATE account SET balance=balance-withdraw WHERE account_no=?");
                        ps2.setInt(1,acc_no);
                        int ubal=ps2.executeUpdate();

                        String sql1="SELECT balance FROM account where account_no="+acc_no;
                        Statement stmt1= conn.createStatement();
                        ResultSet wbal = stmt1.executeQuery(sql1);

                        if(wbal.next()){
                            System.out.println("The updated balance is:");
                            System.out.println(wbal.getString("balance"));
                        }
                    }

                    if(select==2){

                        System.out.println("Enter The Amount To be Deposite");
                        Scanner d= new Scanner(System.in);
                        int deposite=d.nextInt();

                        PreparedStatement ps1= conn.prepareStatement("UPDATE account SET deposite=? WHERE account_no=?");
                        ps1.setInt(1,deposite);
                        ps1.setInt(2,acc_no);

                        int a = ps1.executeUpdate();

                        PreparedStatement ps2=conn.prepareStatement("UPDATE account SET balance=balance+deposite WHERE account_no=?");
                        ps2.setInt(1,acc_no);


                        int ubal=ps2.executeUpdate();
                        String sql1="SELECT balance FROM account where account_no="+acc_no;
                        Statement stmt1= conn.createStatement();
                        ResultSet wbal = stmt1.executeQuery(sql1);

                        if(wbal.next()){
                            System.out.println("The updated balance is:");
                            System.out.println(wbal.getString("balance"));
                        }

                    }

                    if(select==3){

                        System.out.println("Enter Account Number from money Transferred");
                        Scanner sc1= new Scanner(System.in);
                        int acc_no1=sc1.nextInt();

                        String sql2="SELECT * FROM account WHERE account_no='" + acc_no1 + "'";
                        Statement stmt2 = conn.createStatement();
                        ResultSet rs1 = stmt2.executeQuery(sql2);

                        System.out.println("Enter The Amount To Transferred From account 1 to 2:");
                        Scanner w= new Scanner(System.in);
                        int withdraw=w.nextInt();

                        PreparedStatement ps1= conn.prepareStatement("UPDATE account SET withdraw=? WHERE account_no=?");
                        ps1.setInt(1,withdraw);
                        ps1.setInt(2,acc_no1);

                        int a = ps1.executeUpdate();

                        PreparedStatement ps2=conn.prepareStatement("UPDATE account SET balance=balance-withdraw WHERE account_no=?");
                        ps2.setInt(1,acc_no1);

                        int ubal1=ps2.executeUpdate();
                        String sql1="SELECT balance FROM account where account_no="+acc_no1;
                        Statement stmt1= conn.createStatement();
                        ResultSet wbal1 = stmt1.executeQuery(sql1);

                        if(wbal1.next()){
                            System.out.println("The updated balance of account money withdraw from");
                            System.out.println(wbal1.getString("balance"));
                        }

                        //2 nd account

                        System.out.println("Enter Account Number in which money is Transferred");
                        Scanner sc2= new Scanner(System.in);
                        int acc_no2=sc2.nextInt();
                        String sqla="SELECT * FROM account WHERE account_no='" + acc_no2 + "'";
                        Statement stmta = conn.createStatement();
                        ResultSet rsa = stmta.executeQuery(sqla);

                           int deposite;
                        deposite = withdraw;

                        PreparedStatement ps3= conn.prepareStatement("UPDATE account SET deposite=? WHERE account_no=?");
                            ps3.setInt(1,deposite);
                            ps3.setInt(2,acc_no2);

                            int a1 = ps3.executeUpdate();

                            PreparedStatement ps4=conn.prepareStatement("UPDATE account SET balance=balance+deposite WHERE account_no=?");
                            ps4.setInt(1,acc_no2);


                            int ubal2=ps4.executeUpdate();
                            String sql3="SELECT balance FROM account where account_no="+acc_no2;
                            Statement stmt3= conn.createStatement();
                            ResultSet wbal2 = stmt3.executeQuery(sql3);

                            if(wbal2.next()){
                                System.out.println("The updated balance in account money deposited:");
                                System.out.println(wbal2.getString("balance"));
                            }


                    }

                    if(select==4) {



                        String sql1="SELECT balance FROM account where account_no="+acc_no;
                        Statement stmt1= conn.createStatement();
                        ResultSet wbal = stmt1.executeQuery(sql1);

                        if(wbal.next()){
                            System.out.println("The updated balance is:");
                            System.out.println(wbal.getString("balance"));
                        }

                    }

                }

                //if user does not have account
                else {
                    System.out.println("Please Enter Your Name: ");
                    Scanner sc1=new Scanner(System.in);
                    String name=sc1.nextLine();

                    System.out.println("Please Enter Your Account Number: ");
                    Scanner sc2=new Scanner(System.in);
                    int acc_no1=sc2.nextInt();

                    System.out.println("Please Enter The PIN: ");
                    Scanner sc3=new Scanner(System.in);
                    int pin=sc3.nextInt();

                    System.out.println("Please Renter Your PIN to Confirm: ");
                    Scanner sc4=new Scanner(System.in);
                    int pin1=sc1.nextInt();

                    System.out.println("Please Enter Your Phone Number: ");
                    Scanner sc5=new Scanner(System.in);
                    int ph_no=sc5.nextInt();

                    PreparedStatement ps = conn.prepareStatement("insert into account (account_no,pin_no,user_name,ph_no) values(?,?,?,?)");

                    ps.setInt(1,acc_no1);
                    ps.setInt(2,pin1);
                    ps.setString(3,name);
                    ps.setInt(4,ph_no);

                    int b= ps.executeUpdate();
                    if(b>0){
                        System.out.println("New Account Created Successfully");
                        System.out.println("Please login Again  To Continue...");
                    }
                }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
