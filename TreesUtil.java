class TreesUtil
{
public static void main(String a[])
{
Trees tree=new Trees("banyan","Anti-bacterial",200,"Ficus Benghalensis");
tree.printTreesDetails();

Trees tr=new Trees("oak","homewares",300,"Quercus");
tr.printTreesDetails();

Trees.givesOxygen();

}
}