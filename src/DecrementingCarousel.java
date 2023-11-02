public class DecrementingCarousel {


    final int capacity;
    static int[] carousel;
    int index = 0;
    boolean isRun = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if(element > 0 && index < capacity && !isRun){
            carousel[index] = element;
            index++;
            return true;
        }else{
            return false;
        }
    }

    public CarouselRun run(){
        if(!isRun){
            isRun = true;
            return new CarouselRun();
        }else{
            return null;
        }
    }
}
