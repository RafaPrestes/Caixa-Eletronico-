/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listamarcio;

import java.util.Scanner;
public class CaixaEletronico {
    
    public static void main(String[]args){      
        Scanner ler = new Scanner(System.in);        
        double deposito,saque,saldo = 1000,num;
        int funcao;  
        String senha;
        long CPF;       
        System.out.println("Bem vindo :D ");
        System.out.println("|==========|");
                    
    System.out.print("Digite seu CPF:");
    CPF = ler.nextLong();
    
    if (CPF == 12345678900L){
            System.out.println("CPF Valido");
    }else{
        System.out.println("CPF Invalido, acesso nao permitido");
        System.exit(0);
    }
    
           
   while(true){
   System.out.print("Digite sua Senha:");
   senha = ler.next(); 
   if (senha.equals ("01020304")){
       System.out.println("Senha Correta");
       break;
       
   }else{ 
  
    System.out.println("Senha incorreta, mais 2 tentativas");
    System.out.print("Digite sua Senha:");
    senha = ler.next();
    
    if (senha.equals ("01020304")){
        System.out.println("Senha Correta");
        break;
    }
    System.out.println("Senha incorreta, mais 1 tentativa");
    System.out.print("Digite sua Senha:");
    senha = ler.next();
       
    if (senha.equals ("01020304")){
        System.out.println("Senha Correta");
        break;
    }
    
    System.out.println("Conta Bloqueada");   
   System.exit(0);
   
   }
   }
    
   
   System.out.println("        ");
   System.out.println("Menu da Conta");
   System.out.println(" |=========| ");      
    
    
   while(true){
   System.out.println("Digite\n 1 para Saldo \n 2 para Deposito \n 3 para Saque \n 0 para sair");         
   funcao = ler.nextInt();   
   
   switch(funcao){
        
       
        case 1:
            
            System.out.println("Saldo: " + saldo);
            System.out.println("Digite 8 para realizar uma nova operacao ou 0 para sair");
            num = ler.nextInt();
            if (num == 8);
            break;
        
        case 2:
            
            System.out.println("Digite o valor do deposito: ");
            deposito = ler.nextInt();
            saldo = saldo + deposito;
            System.out.println("Saldo pós deposito: " + saldo);
            System.out.println("Digite 8 para realizar uma nova operacao ou 0 para sair");
            num = ler.nextInt();
            if (num == 8);
            break;
           
        case 3:
                      
            System.out.println("Digite o valor do saque: ");
            saque = ler.nextInt();
            saldo = (saldo - saque);
            System.out.println("Saldo pós saque: " + saldo);
            System.out.println("Digite 8 para realizar uma nova operacao ou 0 para sair");
            num = ler.nextInt();
            if (num == 8);
            break;           
      
        case 0:
            System.out.println("Obrigado por utilizar nossos servicos !!");            
        System.exit(0);    
   
   
   }
        
   }
   
   
    }    
}
