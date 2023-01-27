public class Minimum_Number_Of_Platforms {
    public static int minPlatforms(int[] arr,int dep[]){
        int result =1;

        int arrivalIndex =1;
        int departureIndex =0;
        int platformRequired =1;

        while(arrivalIndex<arr.length && departureIndex<dep.length){
            int currentArivalTime = arr[arrivalIndex];
            int currentDepartureTime = dep[departureIndex];

            if(currentArivalTime<currentDepartureTime){
                platformRequired++;
                arrivalIndex++;
            }

            else{
                platformRequired--;
                departureIndex++;
            }

            if(platformRequired>result){
                result = platformRequired;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {900,915,1100};
        int dep[] = {1000,1105,1200};

        System.out.println(minPlatforms(arr, dep));
        
    }

}
