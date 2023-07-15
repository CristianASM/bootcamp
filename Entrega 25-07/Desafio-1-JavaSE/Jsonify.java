public class Jsonify {
	
    public static void main(String[] args) {
        
        String data = "{\"data\":[";
        
        for (int i = 0; i < args.length; i++) {
            data += '"' + args[i] + '"';
            
            if (i != args.length - 1) {
                data += ",";
            }
        }
        
        data += "]}"; 
        System.out.println(data);
    }
}