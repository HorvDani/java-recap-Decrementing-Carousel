public class CarouselRun {

    int[] array = DecrementingCarousel.carousel.clone();
    int position = 0;
    int limitOfRuns = 1;





    public int next(){
        int count = 0;
        while (count < array.length && array[position %= array.length] <= 0) {
            position++;
            count++;
        }
        if (count == array.length) return -1;
        return array[position++]--;
    }
    public boolean isFinished(){
        if(limitOfRuns == 0){
            return true;
        }else{
            for(int i : array){
                if(i > 0){
                    return false;
                }
            }
        }
        return true;
    }
}
