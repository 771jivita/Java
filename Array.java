public class Array                           
{
public static void main(String args[])    
{
int array[]=new int[10];
for(int i=0;i<array.length;i++){
array[i]=i;
}
array[5]=50;
for(int i=0;i<array.length;i++){
System.out.println("...."+i+"..."+array[i]);
}}}
