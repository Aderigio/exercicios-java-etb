
package Unidade4Exercicio1;

public class Animal {
    
   private String nome;
   private double peso;
   
   
   public String getNome () {
   return nome;
   }
   
   public void setNome (String nome){
   this.nome = nome;
   }
   
   
   public double getPeso () {
   return peso;
   }
   
   public void setPeso (double peso) {
   this.peso = peso;
   }
   
    
 @Override
 
 public String toString () {
 return "O nome do animal é" + nome + " e seu peso é " + peso + ".";
 }
}
