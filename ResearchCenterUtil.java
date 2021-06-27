class ResearchCenterUtil
{
public static void main(String a[])
{
ResearchCenter research=new ResearchCenter("Central Agricultural Research Institute","Agriculture",
"port Blair",1929);
research.printResearchCenterDetails();

ResearchCenter rc=new ResearchCenter("CFTRI","Food","Mysuru",1950);
rc.printResearchCenterDetails();

ResearchCenter.givesInformation();

}
} 