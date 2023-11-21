package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L = [a-zA-Z_]+
D = [0-9]+
HEXADECIMAL = ([hH]'[0-9a-fA-F]+'|0x[0-9a-fA-F]+|[0-9a-fA-F]+[hHxX])
BINARIO = (b|B)('[0-1]+')
OCTAL = ([oO]?'[0-7]+')
DECIMAL_CUSTOM = ([Dd]?'[0-9]+'|\.[0-9]+)
espacio = [ ,\m,\r,\b,\t,\f,\v,]+
%{
   public String lexeme;
%}
%%
FOR_LOOP |
MY_DATA |
JUMP_HERE |
CALC_SUM |
LOOP_START {lexeme=yytext(); return etiquetas;}
"MOV" { lexeme=yytext(); return MOV; } 
"ADD" { lexeme=yytext(); return ADD; } 
"SUB" { lexeme=yytext(); return SUB; }
"MUL" { lexeme=yytext(); return MUL; }
"DIV" { lexeme=yytext(); return DIV; }
"INC" { lexeme=yytext(); return INC; }
"DEC" { lexeme=yytext(); return DEC; }
"AND" { lexeme=yytext(); return AND; }
"OR" { lexeme=yytext(); return OR; }
"XOR" { lexeme=yytext(); return XOR; }
"NOT" { lexeme=yytext(); return NOT; }
"CMP" { lexeme=yytext(); return CMP; }
"JMP" { lexeme=yytext(); return JMP; }
"JE" { lexeme=yytext(); return JE; }
"JNE" { lexeme=yytext(); return JNE; }
"JZ" { lexeme=yytext(); return JZ; }
"JNZ" { lexeme=yytext(); return JNZ; }
"CALL" { lexeme=yytext(); return CALL; }
"RET" { lexeme=yytext(); return RET; }
"PUSH" { lexeme=yytext(); return PUSH; }
"POP" { lexeme=yytext(); return POP; }
"LEA" { lexeme=yytext(); return LEA; }
"MOVSB" { lexeme=yytext(); return MOVSB; }
"MOVSW" { lexeme=yytext(); return MOVSW; }
"TEST" { lexeme=yytext(); return TEST; }
"SHL"|"SAL" { lexeme=yytext(); return SHL; }
"SHR" { lexeme=yytext(); return SHR; }
"SAR" { lexeme=yytext(); return SAR; }
"ROL" { lexeme=yytext(); return ROL; }
"ROR" { lexeme=yytext(); return ROR; }
"BSF" { lexeme=yytext(); return BSF; }
"BSR" { lexeme=yytext(); return BSR; }
"PUSHF" { lexeme=yytext(); return PUSHF; }
"POPF" { lexeme=yytext(); return POPF; }
"XCHG" { lexeme=yytext(); return XCHG; }
"XLAT" { lexeme=yytext(); return XLAT; }
"NOP" { lexeme=yytext(); return NOP; }
"HLT" { lexeme=yytext(); return HLT; }
"STI" { lexeme=yytext(); return STI; }
"CLI" { lexeme=yytext(); return CLI; }
"CMPSB" { lexeme=yytext(); return CMPSB; }
"LODSB" { lexeme=yytext(); return LODSB; }
"STOSB" { lexeme=yytext(); return STOSB; }
"LOOP" { lexeme=yytext(); return LOOP; }
"JG"|"JNLE" { lexeme=yytext(); return JG; }
"JL"|"JNGE" { lexeme=yytext(); return JL; }
"JC" { lexeme=yytext(); return JC; }
"JEQ" { lexeme=yytext(); return JEQ; }
"JNC" { lexeme=yytext(); return JNC; }
"CALLF" { lexeme=yytext(); return CALLF; }  
"RETF" { lexeme=yytext(); return RETF; }
"(" {lexeme=yytext();return Parentesis_a;}
")" {lexeme=yytext();return Parentesis_c;}
"[" {lexeme=yytext();return Llave_a;}
"]" {lexeme=yytext();return Llave_c;}
"," {lexeme=yytext();return Coma;}
"''" {lexeme=yytext();return Comilla_a;}
"''" {lexeme=yytext();return Comilla_c;}
"global" {lexeme=yytext();return Global;}
"section" {lexeme=yytext();return Section;}
".text" { lexeme = yytext(); return Section_text; }
".data" { lexeme = yytext(); return Section_data; }
".bss" { lexeme = yytext(); return Section_bss; }
{espacio} {/*Ignorar*/}
";".*[\r\n]* { /* Ignorar los comentarios, incluyendo saltos de línea */ }
( "\n" ) {return Linea;}
{L}({L}|{D}|_|\.)* { lexeme=yytext(); return Identificador;}
{BINARIO} { lexeme=yytext(); return NumeroBinario; }
{HEXADECIMAL} { lexeme=yytext(); return NumeroHexadecimal; }
{OCTAL} { lexeme=yytext(); return NumeroOctal; }
{DECIMAL_CUSTOM} { lexeme=yytext(); return NumeroDecimal; }
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
. {return ERROR;}