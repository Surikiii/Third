public class bad extends role implements Fight {
    private String name="bad";
    private int hp= 100 ;
    Boolean isDead=false;
    public void getName(){
        this.name=name;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp=hp;
    }

    public  Boolean getIsDead(){
        return false;
    }
    public void setIsDead(Boolean isDead) {
        this.isDead=isDead;
    }
    void die(){
        setIsDead(true);
        System.out.println("死了，噶");
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
        for (int i=0;getHp() <= 0 || hp <= 0;i++){
            beAttacked();
            System.out.println("第" + i + "轮");
        }
        System.out.println("战斗结束，lose");
        return 0;
    }

}
