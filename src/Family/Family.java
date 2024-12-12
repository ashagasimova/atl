package Family;

import java.util.Arrays;

public class Family{
   private Human father;
   private Human mother;
   private Human [] children;
   private Pet pet;

   public Family() {
   }

   public Family(Human father, Human mother, Human[] children, Pet pet) {
      this.father = father;
      this.mother = mother;
      this.children = children;
      this.pet = pet;
   }


   public Human getFather() {
      return father;
   }

   public void setFather(Human father) {
      this.father = father;
   }

   public Human getMother() {
      return mother;
   }

   public void setMother(Human mother) {
      this.mother = mother;
   }

   public Human[] getChildren() {
      return children;
   }

   public void setChildren(Human[] children) {
      this.children = children;
   }

   public Pet getPet() {
      return pet;
   }

   public void setPet(Pet pet) {
      this.pet = pet;
   }


   public void addChild(){
      for(var i=0; i<children.length; i++ ){
         System.out.println(children[i]);
      }
      System.out.println(Arrays.toString(children));

       return ;
   }

}

