class Library{
String BookType;
String Title;
boolean isCostFree;
String AuthorName;
public static void main(String a[])
{
System.out.println("Main method started");
System.out.println("In process of creating Objects of Library");
Library lm=new Library();
lm.BookType="ComicBook";
lm.Title="New Avengers";
lm.isCostFree=false;
lm.AuthorName="Stan Lee";

System.out.println(lm.BookType + " "+ lm.Title + " "+ lm.isCostFree+ " "+ lm.AuthorName);
System.out.println("Main method ended");
}
}

