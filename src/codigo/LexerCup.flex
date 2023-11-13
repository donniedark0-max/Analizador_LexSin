package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L = [a-zA-Z_]+
D = [0-9]+
HEXADECIMAL = ([hH]'[0-9a-fA-F]+'|0x[0-9a-fA-F]+|[0-9a-fA-F]+[hHxX])
BINARIO = (b|B)('[0-1]+')
OCTAL = ([oO]?'[0-7]+')
DECIMAL_CUSTOM = ([Dd]?'[0-9]+'|\.[0-9]+)
espacio = [ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    } 
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }   
;
%}
%%
FOR_LOOP |
MY_DATA |
JUMP_HERE |
CALC_SUM |
LOOP_START {return new Symbol(sym.Etiquetas, yychar, yyline, yytext());}
"MOV" { return new Symbol(sym.MOV, yychar, yyline, yytext());} 
"ADD" { return new Symbol(sym.ADD, yychar, yyline, yytext()); } 
"SUB" { return new Symbol(sym.SUB, yychar, yyline, yytext()); }
"MUL" { return new Symbol(sym.MUL, yychar, yyline, yytext()); }
"DIV" { return new Symbol(sym.DIV, yychar, yyline, yytext()); }
"INC" { return new Symbol(sym.INC, yychar, yyline, yytext()); }
"DEC" { return new Symbol(sym.DEC, yychar, yyline, yytext()); }
"AND" { return new Symbol(sym.AND, yychar, yyline, yytext()); }
"OR" { return new Symbol(sym.OR, yychar, yyline, yytext()); }
"XOR" { return new Symbol(sym.XOR, yychar, yyline, yytext()); }
"NOT" { return new Symbol(sym.NOT, yychar, yyline, yytext()); }
"CMP" { return new Symbol(sym.CMP, yychar, yyline, yytext()); }
"JMP" { return new Symbol(sym.JMP, yychar, yyline, yytext()); }
"JE" { return new Symbol(sym.JE, yychar, yyline, yytext()); }
"JNE" { return new Symbol(sym.JNE, yychar, yyline, yytext()); }
"JZ" { return new Symbol(sym.JZ, yychar, yyline, yytext()); }
"JNZ" { return new Symbol(sym.JNZ, yychar, yyline, yytext()); }
"CALL" { return new Symbol(sym.CALL, yychar, yyline, yytext()); }
"RET" { return new Symbol(sym.RET, yychar, yyline, yytext()); }
"PUSH" { return new Symbol(sym.PUSH, yychar, yyline, yytext()); }
"POP" { return new Symbol(sym.POP, yychar, yyline, yytext()); }
"LEA" { return new Symbol(sym.LEA, yychar, yyline, yytext()); }
"MOVSB" { return new Symbol(sym.MOVSB, yychar, yyline, yytext()); }
"MOVSW" { return new Symbol(sym.MOVSW, yychar, yyline, yytext()); }
"TEST" { return new Symbol(sym.TEST, yychar, yyline, yytext()); }
"SHL"|"SAL" { return new Symbol(sym.SHL, yychar, yyline, yytext()); }
"SHR" { return new Symbol(sym.SHR, yychar, yyline, yytext()); }
"SAR" { return new Symbol(sym.SAR, yychar, yyline, yytext()); }
"ROL" { return new Symbol(sym.ROL, yychar, yyline, yytext()); }
"ROR" { return new Symbol(sym.ROR, yychar, yyline, yytext()); }
"BSF" { return new Symbol(sym.BSF, yychar, yyline, yytext()); }
"BSR" { return new Symbol(sym.BSR, yychar, yyline, yytext()); }
"PUSHF" { return new Symbol(sym.PUSHF, yychar, yyline, yytext()); }
"POPF" { return new Symbol(sym.POPF, yychar, yyline, yytext()); }
"XCHG" { return new Symbol(sym.XCHG, yychar, yyline, yytext()); }
"XLAT" { return new Symbol(sym.XLAT, yychar, yyline, yytext()); }
"NOP" { return new Symbol(sym.NOP, yychar, yyline, yytext()); }
"HLT" { return new Symbol(sym.HLT, yychar, yyline, yytext()); }
"STI" { return new Symbol(sym.STI, yychar, yyline, yytext()); }
"CLI" { return new Symbol(sym.CLI, yychar, yyline, yytext()); }
"CMPSB" { return new Symbol(sym.CMPSB, yychar, yyline, yytext()); }
"LODSB" { return new Symbol(sym.LODSB, yychar, yyline, yytext()); }
"STOSB" { return new Symbol(sym.STOSB, yychar, yyline, yytext()); }
"LOOP" { return new Symbol(sym.LOOP, yychar, yyline, yytext()); }
"JG"|"JNLE" { return new Symbol(sym.JG, yychar, yyline, yytext()); }
"JL"|"JNGE" { return new Symbol(sym.JL, yychar, yyline, yytext()); }
"JC" { return new Symbol(sym.JC, yychar, yyline, yytext()); }
"JEQ" { return new Symbol(sym.JEQ, yychar, yyline, yytext()); }
"JNC" { return new Symbol(sym.JNC, yychar, yyline, yytext()); }
"CALLF" { return new Symbol(sym.CALLF, yychar, yyline, yytext()); }
"RETF" { return new Symbol(sym.RETF, yychar, yyline, yytext()); }
"(" {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
")" {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
"[" {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
"]" {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
"," {return new Symbol(sym.Coma, yychar, yyline, yytext());}
"global" {return new Symbol(sym.Global, yychar, yyline, yytext());}
"section" {return new Symbol(sym.Section, yychar, yyline, yytext());}
{espacio} {/*Ignorar*/}
";".*\n? { /*Ignorar los comentarios, incluyendo saltos de línea */ }
\n { /* Saltos de línea */ }
{L}({L}|{D}|_|\.)* { return new Symbol(sym.Identificador, yychar, yyline, yytext());}
{BINARIO} { return new Symbol(sym.NumeroBinario, yychar, yyline, yytext()); }
{HEXADECIMAL} { return new Symbol(sym.NumeroHexadecimal, yychar, yyline, yytext()); }
{OCTAL} { return new Symbol(sym.NumeroOctal, yychar, yyline, yytext()); }
{DECIMAL_CUSTOM} { return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext()); }
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
