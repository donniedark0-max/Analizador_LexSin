package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L = [a-zA-Z_]+
D = [0-9]+
espacio = [ ,\m,\r,\b,\t,\f,\v]+
%{
   public String lexeme;
%}
%%
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
"JNC" { lexeme=yytext(); return JNC; }
"CALLF" { lexeme=yytext(); return CALLF; }
"RETF" { lexeme=yytext(); return RETF; }
{espacio} {/*Ignorar*/}
"/".* {/*Ignorar*/}
{L}({L}|{D}|_|\.)* { lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
. {return ERROR;}