class SocialMedia{
String name;
String color;
boolean isInternetReq;
String ownerName;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating Objects of SocialMedia");
SocialMedia sm=new SocialMedia();
sm.name="Telegram";
sm.color="whiteAndBlue";
sm.isInternetReq=true;
sm.ownerName="pavel Durov";

System.out.println(sm.name + " "+ sm.color + " "+ sm.isInternetReq + " "+ sm.ownerName);
System.out.println("Main method ended");
}
}

