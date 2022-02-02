class Bird {
    enum DuckType {
        Rubber,
        Mallard,
        RedHead

    }
}

interface BirdInterface {
    void ShowDetail();
}

class Duck implements BirdInterface {
    private final double weight;
    private final int numberOfWings;
    private final Bird.DuckType TypeOfDuck;

    public Duck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        this.weight = weight;
        this.numberOfWings = numberOfWings;
        this.TypeOfDuck = TypeOfDuck;
    }

    @Override
    public void ShowDetail() {
        if (TypeOfDuck == Bird.DuckType.Mallard)
            System.out.println("Mallard Duck");
        else if (TypeOfDuck == Bird.DuckType.Rubber)
            System.out.println("Rubber Duck");
        else if (TypeOfDuck == Bird.DuckType.RedHead)
            System.out.println("Redhead Duck");
        System.out.println("Weight of duck : " + weight);
        System.out.println("Total number of wings : " + numberOfWings);
    }
}

class MallardDuck extends Duck {

    public MallardDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }

    public void ShowDetail() {
        super.ShowDetail();
        System.out.println("Mallard ducks fly fast and quack loud.");
    }
}

class RedheadDuck extends Duck {

    public RedheadDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }

    public void ShowDetail() {
        super.ShowDetail();
        System.out.println("Redhead ducks fly slow and quack mild.");
    }
}

class RubberDuck extends Duck {
    public RubberDuck(double weight, int numberOfWings, Bird.DuckType TypeOfDuck) {
        super(weight, numberOfWings, TypeOfDuck);
    }

    public void ShowDetail() {
        super.ShowDetail();
        System.out.println("Rubber ducks don’t fly and squeak.");
    }
}

class Question20 {
    public static void main(String[] args) {
        BirdInterface[] duck = new BirdInterface[3];
        duck[0] = new RubberDuck(7, 2, Bird.DuckType.Rubber);
        duck[1] = new MallardDuck(8, 2, Bird.DuckType.Mallard);
        duck[2] = new RedheadDuck(9, 2, Bird.DuckType.RedHead);
        for (int i = 0; i < 3; i++) {
            duck[i].ShowDetail();
            System.out.println();
        }
    }
}