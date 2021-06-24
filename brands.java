class Brands{
String name;
String EstablishedYear;
String website;
String FounderName;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating Objects of Brands");
Brands bs=new Brands ();
bs.name="Nike";
bs.EstablishedYear="1964";
bs.website="https://www.nike.com";
bs.FounderName="Phillknight";

System.out.println(bs.name + " "+ bs.EstablishedYear  + " " + bs.website + " "+ bs.FounderName);
System.out.println("Main method ended");
}
}

