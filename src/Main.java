public class Main {
    public static void main(String[] args)

    {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен 18 или больше,то он совершеннолетний");
        }
        else
        {
            System.out.println("Если возраст человека меньше 18, то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println();
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60)
        {
            System.out.println("Если скорость больше 60 км/ч, то придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость меньше или равна 60 км/ч, то можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задача 4");
        int Age = 25;
        if (Age >= 2 && Age <= 6)
        {
            System.out.println("Если возраст человека от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        else if (Age >= 7 && Age <= 17)
        {
            System.out.println("Если возраст человека от 7 до 17 лет, то ему нужно ходить в школу");
        }
        else if (Age >= 18 && Age <= 24)
        {
            System.out.println("Если возраст человека больше или равен 18, но меньше или равен 24, то его место в университете");
        }
        else
        {
            System.out.println("Если возраст человека больше 24, то ему пора ходить на работу");
        }

        System.out.println();
        System.out.println("Задача 5");
        int age1 = 9;
        if (age < 5)
        {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
        }
        else if (age >= 5 && age < 14)
        {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого");
        }
        else
        {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
        }


        System.out.println();
        System.out.println("Задача 6");
        int totalPlaces = 120;
        int seating = 60;
        int standing = totalPlaces - seating;
        if (standing < 0)
        {
            System.out.println("Вагон полностью забит");
        }
        else if (standing == 0)
        {
            System.out.println("В вагоне остались только сидячие места");
        }
        else
        {
            System.out.println("В вагоне есть " + standing + " стоячих мест.");

        }

        System.out.println();
        System.out.println("Задача 6");
        int one = 5, two = 2, three = 6;
        if (one > two && one >three)
        {
            System.out.println("Большее число " + one);

        }
        else if (two > one && two > three)
        {
            System.out.println("Большее число " + two);

        }
        else
        {
            System.out.println("Большее число " + three);

        }
    }
    }

