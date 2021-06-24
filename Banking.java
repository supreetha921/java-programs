class Banking{
String name;
String EstablishedYear;
boolean isLoanAvailable;
String FounderName;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating Objects of Banking");
Banking bg=new Banking();
bg.name="karnataka bank";
bg.EstablishedYear="1924";
bg.isLoanAvailable=true;
bg.FounderName="Vysaray Achar";

System.out.println(bg.name+ " "+ bg.EstablishedYear + " "+ bg.isLoanAvailable + " "+ bg.FounderName);
System.out.println("Main method ended");
}
}

