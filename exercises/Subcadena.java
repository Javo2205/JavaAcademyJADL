public class Subcadena{
    public static void main(String[] args) {
        String cadenaOriginal = args[0];
        String subCadena = "";
        if(cadenaOriginal.length()<2){
            System.out.println(cadenaOriginal);
        } else {
            subCadena = cadenaOriginal.substring(0, 2);
        }
        System.out.println("La subcadena es " +subCadena);
    }
}

/**
 * .substring recorre desde beginIndex hasta endIndex -1
 */