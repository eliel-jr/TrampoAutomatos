package gals;

import compiladorteste.CompiladorTeste;
        
public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        Integer a, b, result;
        Long c;        
        switch(action){            
            case 1:                
                break;
            case 2:                                
                CompiladorTeste.fila.offer(Integer.parseInt(token.getLexeme(), 2));
                break;
            case 3:
                a = CompiladorTeste.fila.poll();
                b = CompiladorTeste.fila.poll();
                result = a + b;
                CompiladorTeste.fila.offer(result);
                break;
            case 4:
                a = CompiladorTeste.fila.poll();
                b = CompiladorTeste.fila.poll();
                result = a - b;
                CompiladorTeste.fila.offer(result);
                break;
            case 5:
                a = CompiladorTeste.fila.poll();
                b = CompiladorTeste.fila.poll();
                result = Math.multiplyExact(a, b);
                CompiladorTeste.fila.offer(result);
                break;
            case 6:
                a = CompiladorTeste.fila.poll();
                b = CompiladorTeste.fila.poll();
                result = a / b;              
                CompiladorTeste.fila.offer(result);
                break;
            case 7:
                a = Integer.parseInt(CompiladorTeste.fila.poll().toString());
                b = Integer.parseInt(CompiladorTeste.fila.poll().toString());
                c = Math.round(Math.pow(a, b));
                result = c.intValue();
                CompiladorTeste.fila.offer(result);
                break;
            case 8: 
                a = CompiladorTeste.fila.poll();
                System.out.println(Integer.toBinaryString(a));
        }
    }	
}
