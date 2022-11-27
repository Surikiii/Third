import java.security.PrivateKey;

public abstract class role {
       private String name;
       private int hp;
       private  Boolean isDead;

       role(){

       }

       public role(String name,int hp,Boolean isDead){
           this.name = name;
           this.hp = hp;
           this.isDead = isDead;
       }
       void practise(){
           this.hp=hp+3;
           System.out.println("村民锻炼了");
       };
       void eat() {
           this.hp = hp + 1;
           System.out.println("村民吃饱了");
       }


}
