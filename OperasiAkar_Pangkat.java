package operasiakar_pangkat;

import java.io.*;
class OperasiAkar_Pangkat
{
public static void main(String[] args) throws Exception
{
String angka;
int a,b,c;
double akar,kuadrat;
DataInputStream dis = new DataInputStream (System.in);
System.out.println("Masukan Angka :");
angka=dis.readLine();
a=Integer.parseInt(angka);
kuadrat=Math.pow(a,2);
akar=Math.sqrt(a);
System.out.println("Kuadrat :"+kuadrat);
System.out.println("Akar : " +akar);
}
}