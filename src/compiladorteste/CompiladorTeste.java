/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorteste;

import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santiago
 */
public class CompiladorTeste {
    public static Stack<Integer> pilha = new Stack<Integer>();
    public static HashMap<String, Integer> mapa = new HashMap<String, Integer>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Lexico lex = new Lexico("A = 10 + 11;"+"B = 11 + 100;"+"C = 11;"+"B = 111 + A * B;"+"B= B + C;"+"cout(B);");            
            Sintatico sin = new Sintatico();
            Semantico sem = new Semantico();
            sin.parse(lex, sem);            
        } catch (LexicalError | SyntaticError | SemanticError ex) {
            Logger.getLogger(CompiladorTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
