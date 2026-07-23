class PrimeNumber{
public static void main(String[] args)
{
int n = 10;
boolean isprime = true;
if(n <= 1){
isprime = false;
}

else{
for(int i = 2;i <= Math.sqrt(n);i++)
{
if(n%i == 0){
isprime = false;
break;
}
}
}
if(isprime){
System.out.println("this is prime number");
}
else{
System.out.println("this is not prime number");
}
}
}

