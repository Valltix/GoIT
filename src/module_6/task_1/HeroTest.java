package module_6.task_1;

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {
    private String name;
    private int hp;

    Hero(){
        this.name = "Paratrooper";
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}