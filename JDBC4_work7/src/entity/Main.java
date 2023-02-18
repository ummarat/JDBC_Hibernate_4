package entity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalHelper ah = new AnimalHelper();
        Animal an = new Animal();

        //додати об'єкт
        an.setId(4);
        an.setName("Cat");
        an.setAge(1);
        an.setTail(true);
        ah.add(an);

        //вивести всі об'єкти
        List<Animal> animalList = ah.getAll();
        for(Animal animal : animalList){
            System.out.println(animal.getId() + " " + animal.getName() + " " +
                    animal.getAge() + " " + animal.isTail());
        }

        //вивести об'єкт за ID
//        an = ah.getById(4);
//        System.out.println(an.getId() + " " + an.getName() + " " +
//                an.getAge() + " " + an.isTail());

        //видалення об'єкта
//        ah.remove(an);
    }
}
