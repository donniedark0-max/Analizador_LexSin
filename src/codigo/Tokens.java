/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package codigo;

/**
 *
 * @author jjose
 */
public enum Tokens {
   MOV,//mueve datos de un lugar a otro//
   ADD,//Realiza una suma.//
   SUB,// Realiza una resta.
   MUL,// Realiza una resta.
   DIV,//Realiza una división.
   INC,//Incrementa un valor.
   DEC,//Decrementa un valor.
   AND,//Realiza una operación lógica AND.
   OR,//Realiza una operación lógica OR.
   XOR,//Realiza una operación lógica XOR.
   NOT,//Realiza una operación lógica NOT.
   CMP,//Campara dos valores
   JMP,///Salto condicional
   JE,//Salto si es igual
   JNE,//salto si no es igual
   JZ,//salto si es cero
   JNZ,//salto si no es cero
   CALL,//llama a una funcion
   RET,//retorna de una funcion
   PUSH,// Inserta un valor en la pila.
   POP,//Extrae un valor de la pila.
   LEA,//Carga la dirección efectiva de una operación.
   MOVSB,//Mueve un byte de memoria a otro.
   MOVSW,//Mueve una palabra de memoria a otra.
   TEST,//Realiza una operación AND y actualiza las banderas.
   SHL,// Desplaza a la izquierda (aritmético).
   SHR,// Desplaza a la derecha (lógico).
   SAR,//Desplaza a la derecha (aritmético).
   ROL,//Rotación a la izquierda.
   ROR,//Rotación a la derecha.
   BSF,//Escanea hacia adelante para el primer bit establecido.
   BSR,//Escanea hacia atrás para el primer bit establecido.
   PUSHF,//Inserta las banderas en la pila.
   POPF,//Extrae las banderas de la pila.
   XCHG,//Intercambia valores entre dos ubicaciones de memoria.
   XLAT,//Traduce una tabla utilizando un índice.
   NOP,//No operación (sin efecto).
   HLT,//Detiene la ejecución del programa.
   STI,//Habilita las interrupciones.
   CLI,// Deshabilita las interrupciones.
   CMPSB,//Compara dos bytes de memoria
   LODSB,//Carga un byte desde la memoria.
   STOSB,//Almacena un byte en la memoria.
   LOOP,//Realiza un bucle basado en la cuenta de CX/ECX.
   JG,//Salto si es mayor (signed) o no es menor o igual (unsigned).
   JL,//Salto si es menor (signed) o no es mayor o igual (unsigned).
   JC,//Salto si hay acarreo.
   JNC,//Salto si no hay acarreo.
   CALLF,//Llama a un segmento de código.
   RETF,//Retorna de un segmento de código.
   NumeroBinario,  // Nuevo token para números binarios
   NumeroHexadecimal,  // Nuevo token para números hexadecimales
   NumeroOctal,  // Nuevo token para números octales
   NumeroDecimalCustom,  // Nuevo token para números decimales personalizados
   Identificador,
   Numero,
   ERROR
}
