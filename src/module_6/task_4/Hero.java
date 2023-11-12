package module_6.task_4;

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        if(hp > 200)    {hp = 200;}
        else if (hp < 1) {hp = 0;}
        this.name = name;
        this.hp = hp;
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}