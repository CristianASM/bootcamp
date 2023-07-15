public class Calculadora {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String operacion = args[2];
        int resultado = 0;
        
        if(operacion.equals("SUM")){
        	resultado = a + b;
        }else if(operacion.equals("RES")) {
        	resultado = a - b;
        }else if(operacion.equals("MUL")) {
        	resultado = a * b;
        }else if(operacion.equals("DIV")) {
        	resultado = a / b;
        }else {
        	System.out.println("ERROR");
	return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
