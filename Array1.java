public class Array1                           
{
public static void main(String args[])    
{
int array[][]=new int[5][5];
for(int i=0;i<array.length;i++){
for(int j=0;j<array.length;j++){
array[i][j]=i+j;
}}
for(int i=0;i<array.length;i++){
for(int j=0;j<array.length;j++){
System.out.println("...."+i+"..."+j+"..."+array[i][j]);
}
System.out.println();
}}}
