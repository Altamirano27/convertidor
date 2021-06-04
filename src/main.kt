
var NumeroAConvertir :Double=0.00;
var opcion : Int =0;
var Resultado : Double=0.00;

//Declaracion de Funciones donde realizamos cada una de las operaciones segun la conversion

fun main(){
    println("Bienvenido a su Convertidor de Unidades");
    println("1. mm -> cm");
    println("2. mm -> mt");
    println("3. mm -> km");
    println("4. cm -> mm");
    println("5. mt -> mm");
    println("6. km -> mm");

    println("Elija la opcion ala que desea hacer su conversion ");
    opcion = readLine()!!.toInt();

    when(opcion){
        1->convertir_mm_a_cm();
        2->convertir_mm_a_mt();
        3->convertir_mm_a_km();
        4->convertir_cm_a_mm();
        5->convertir_mt_a_mm();
        6->convertir_km_a_mm();

        else->{
            println("Opcion no valida");
        }
    }
}
fun convertir_mm_a_cm(){
    Pedir_cantidad_a_convertir();
    Resultado  = NumeroAConvertir/ 10;
    println("El resultado de tu conversion de mm -> cm es de:  "+Resultado );
}
fun convertir_mm_a_mt(){
    Pedir_cantidad_a_convertir();
    Resultado = NumeroAConvertir / 1000;
    println("El resultado de la conversion de mm -> mt es de: "+Resultado );
}
fun convertir_mm_a_km(){
    Pedir_cantidad_a_convertir();
    Resultado  = NumeroAConvertir / 1000000;
    println("El resultado de la conversion de mm -> km es de: "+Resultado );
}
fun convertir_cm_a_mm(){
    Pedir_cantidad_a_convertir();
    Resultado  = NumeroAConvertir * 10;
    println("El resultado de la conversion de cm -> mm es de:  "+Resultado );
}
fun convertir_mt_a_mm(){
    Pedir_cantidad_a_convertir();
    Resultado  =NumeroAConvertir* 1000;
    println("El resultado de la conversion de mt -> mm es de:  "+Resultado );
}
fun convertir_km_a_mm(){
    Pedir_cantidad_a_convertir();
    Resultado  =NumeroAConvertir * 1000000;
    println("El resultado de la conversion de km -> mm es de:  "+Resultado );
}
fun Pedir_cantidad_a_convertir(){
    println("Ingrese la cantidad que desea convertir");
    NumeroAConvertir = readLine()!!.toDouble();
}






