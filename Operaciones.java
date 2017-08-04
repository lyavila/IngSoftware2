
public class Operaciones {
  
	public static int resultado;
	
	public static int suma(int n1, int n2){
        resultado = n1 + n2; 
        return resultado; 
    } 
 
    public static int resta (int n1, int n2){ 
        resultado = n1 - n2; 
        return resultado; 
    }
 
    public static int multiplicacion(int n1, int n2){ 
        resultado = n1 * n2; 
        return resultado; 
    }  
 
    public static int division(int n1, int n2){
    	if(n1 >= n2) {
			resultado = n1 / n2;
		}else {
			resultado = n2 / n1;
		} 
        return resultado; 
    }
 
    
}
