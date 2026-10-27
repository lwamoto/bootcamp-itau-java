package classes_encapsulamento.primeira_classe;

public class Person {
     //CONSTRUTOR
     /*
     public Person(){

     }
     */

     //Assim deixamos claro que queremos trabalhar com o paramento name
     /*
     public Person(String name){
          this.name = name;
          this.age = 1;
     }
     */
     /*
     public Person(String name, int age){
          this.name=name;
          this.age=age;
     }
     */

     //NAME
     /*
     private final String name;
     public String getName(){
          return this.name;
     }
     */
     /*
     public void setName(String name){
          this.name = name;
     }
      */


     //AGE
     /*
     private int age;
     public int getAge(){
          return this.age;
     }
     */
     /*
     public void setAge(int age){
          this.age = age;
     }
     */

     //YEAR
     /*Esse -1, reseta o OffsetDateTime.now().getYear(), assim podendo utilizar o metodo

     private int lastYearAgeInt = OffsetDateTime.now().getYear();// - 1;

     public void incAge(){
          if (this.lastYearAgeInt >= OffsetDateTime.now().getYear()) return;

          this.age += 1;
          this.lastYearAgeInt = OffsetDateTime.now().getYear();
     }
     */
}
