public class Operation{
public static int multiplication (int a, int b){
return(a*b);
}
public static int soustraction (int a, int b){
return(a-b);
}
public static int addition (int a, int b){
return(a+b);
}
public static int division (int a, int b){
if(b !=0)
return(a/b);
else{
System.out.println("erreur:division par zéro");
return 0;
}
}

}
