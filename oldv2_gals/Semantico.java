package gals;

import compiladorteste.CompiladorTeste;

public class Semantico implements Constants
{
    String tempVar = "";
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        Integer a, b, result;
        Long c;    
        switch(action){            
            case 1:   
                CompiladorTeste.pilha.push(CompiladorTeste.mapa.get(token.getLexeme()));
                break;
            case 2:                                
                CompiladorTeste.pilha.push(Integer.parseInt(token.getLexeme(), 2));
                break;
            case 3:
                a = CompiladorTeste.pilha.pop();
                b = CompiladorTeste.pilha.pop();
                result = a + b;
                CompiladorTeste.pilha.push(result);
                break;
            case 4:
                a = CompiladorTeste.pilha.pop();
                b = CompiladorTeste.pilha.pop();
                result = a - b;
                CompiladorTeste.pilha.push(result);
                break;
            case 5:
                a = CompiladorTeste.pilha.pop();
                b = CompiladorTeste.pilha.pop();
                result = Math.multiplyExact(a, b);
                CompiladorTeste.pilha.push(result);
                break;
            case 6:
                a = CompiladorTeste.pilha.pop();
                b = CompiladorTeste.pilha.pop();
                result = a / b;              
                CompiladorTeste.pilha.push(result);
                break;
            case 7:
                a = CompiladorTeste.pilha.pop();
                b = CompiladorTeste.pilha.pop();
                c = Math.round(Math.pow(a, b));
                result = c.intValue();
                CompiladorTeste.pilha.push(result);
                break;
            case 8: 
                a = CompiladorTeste.pilha.pop();
                System.out.println(Integer.toBinaryString(a));
                break;
            case 9:
                tempVar = token.getLexeme();
                break;
            case 10:
                CompiladorTeste.mapa.put(tempVar, CompiladorTeste.pilha.pop());
                break;
        }
    }	
}
