public class Main
{
    public static void main(String[] args)
    {
        GoodStudent student1 = new GoodStudent("Alan", "Turning", 191254, 3.56, true);
        GoodStudent student2 = new GoodStudent("Florence", "Nightingal", 190692, 3.89, false);
        GoodStudent student3 = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        //Student 1
        System.out.println(student1.getFristName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getID());
        System.out.println(student1.getGPA());

        //Student 2
        System.out.println(student2.getFristName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getID());
        System.out.println(student2.getGPA());

        //Student 3
        System.out.println(student3.getFristName());
        System.out.println(student3.getLastName());
        System.out.println(student3.getID());
        System.out.println(student3.getGPA());

        System.out.println(student1.CSGPA());
        System.out.println(student2.CSGPA());
        System.out.println(student3.CSGPA());

    }
}