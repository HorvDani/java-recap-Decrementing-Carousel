public class Main {
    public static void main(String[] args) {

        // Empty case
        CarouselRun run = new DecrementingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        System.out.println("------------------------------");
        // Regular case
        DecrementingCarousel carousel = new DecrementingCarousel(7);

        carousel.addElement(2);
        carousel.addElement(3);
        carousel.addElement(1);

        CarouselRun run1 = carousel.run();

        System.out.println(run1.isFinished()); //false
        System.out.println(run1.next()); //2
        System.out.println(run1.next()); //3
        System.out.println(run1.next()); //1
        System.out.println(run1.next()); //1
        System.out.println(run1.next()); //2
        System.out.println(run1.next()); //1
        System.out.println(run1.isFinished()); //true
        System.out.println(run1.next()); //-1

        System.out.println("------------------------------");

        // More elements

        DecrementingCarousel carousel1 = new DecrementingCarousel(3);

        System.out.println(carousel1.addElement(-2)); //false
        System.out.println(carousel1.addElement(0)); //false

        System.out.println(carousel1.addElement(2)); //true
        System.out.println(carousel1.addElement(3)); //true
        System.out.println(carousel1.addElement(1)); //true

        //carousel is full
        System.out.println(carousel1.addElement(2)); //false

        CarouselRun run2 = carousel1.run();

        System.out.println(run2.next()); //2
        System.out.println(run2.next()); //3
        System.out.println(run2.next()); //1

        System.out.println(run2.next()); //1
        System.out.println(run2.next()); //2

        System.out.println(run2.next()); //1

        System.out.println(run2.isFinished()); //true
        System.out.println(run2.next()); //-1
    }
}
