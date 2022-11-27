import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class npc extends role implements equipment ,Fight{
    private String name;
    private int hp = 50;
    Boolean isDead;
    int money = 20;



    public npc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //hp初始值
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    //isDead

    public Boolean getIsDead() {
        return false;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    void die() {
        setIsDead(true);
        System.out.println("死了，噶");
    }

    //money
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    void practise() {
        setHp(getHp() + 3);
        System.out.println("村民" + name + "锻炼了hp+3,hp=" + hp);
    }

    void eat() {
        setHp(getHp() + 1);
        System.out.println("村民" + name + "吃饱了hp+1，hp=" + hp);
    }


    //接口e
    public void knife() {
        if (getMoney() >= 5) {
            setMoney(getMoney() - 5);
            setHp(getHp() + 10);
            System.out.println("还剩" + hp + "血，钱钱" + money);
        } else {
            System.out.println("钱包空空不够咯");
        }
    }

    public void axe() {
        if (getMoney() >= 8) {
            setMoney(getMoney() - 8);
            setHp(getHp() + 18);
            System.out.println("还剩" + hp + "血，钱钱" + money);
        } else {
            System.out.println("钱包空空不够咯");
        }
    }

    public void armour() {
        if (getMoney() >= 25) {
            setMoney(getMoney() - 25);
            setHp(getHp() + 25);
            System.out.println("还剩" + hp + "血，钱钱" + money);
        } else {
            System.out.println("钱包空空不够咯");
        }
    }

    public int beAttacked() {
      setHp(getHp() - 5);
        if (getHp() <= 0) {
            System.out.println("wo芜湖");
            this.die();
            return 0;
        } else {
            System.out.println("受到5点伤害,还剩" + getHp());
            return getHp();
        }
    }
    public int fight(int hp) {
        for (int i=0;getHp() >= 0 && hp >= 0;i++){
            beAttacked();
            System.out.println("第" + i + "轮");
        }
        System.out.println("战斗结束，lose");
        return 0;
    }
}
