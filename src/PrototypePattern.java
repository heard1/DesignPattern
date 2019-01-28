public abstract class PrototypePattern implements Cloneable {
   
   protected String word;
   
   public String getWord() {
      return word;
   }
   
   public void setWord(String word) {
      this.word = word;
   }
   
   public Object clone() {
      Object clone = null;
      try {
         clone = super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}