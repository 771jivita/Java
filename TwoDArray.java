public class TwoDArray{
public static void main(String args[]){
int twod[][]=new int[2][2];
for(int i=0;i<twod.length;i++){
for(int j=0;j<twod.length;j++){
twod[i][j]=i+j;
}}
for(int i=0;i<twod.length;i++){
for(int j=0;j<twod.length;j++){
System.out.println(twod[i][j]+"");
}
System.out.println("");
}
}
}