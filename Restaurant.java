class Restaurant{
String Name;
String Location;
boolean isBookingAvailable;
String ownerName;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating Objects Restaurant");
Restaurant ru=new Restaurant();
ru.Name="MaheshPrasad";
ru.Location="Mysore";
ru.isBookingAvailable=false;
ru.ownerName="Prakashshetty";

System.out.println(ru.Name + " "+ ru.Location + " "+ ru.isBookingAvailable + " "+ ru.ownerName);
System.out.println("Main method ended");
}
}

