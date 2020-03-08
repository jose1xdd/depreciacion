
/**
 * Use los comentarios para explicar el objetivo de este programa MainTienda .
 *
 * @author (Sus Nombres y Apellidos y Su email)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
class MainProducto
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        depreciacion depreciacion = new depreciacion();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        depreciacion.depreciar=c.leerEntero("Valor total a depreciar");
        depreciacion.mensualDepreciar=c.leerEntero("Valor mensual");
        
      

        //invocar el algoritmo o los algoritmos, usando el Modelo
        depreciacion.algoritmo();

        //mostrar / imprimir los datos de salida
      c.imprimir("Años Depreciación :"+depreciacion.añosDepreciar);
    } 
    
}//fin class MainTienda
