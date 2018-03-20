
package testlocation;



public class TestLocation {


    public static void main(String[] args) {
        double[][] arr = {{23.5,35.0,2,10},{4.5,3,45,3.5},{35,44,5.5,9.6}};
        
        Location largest = locateLargest(arr);
        
        System.out.println("The largeset element is " + largest.getMaxVal());
        System.out.println("It is at the index (" + largest.row + "," +largest.col +")");
        
        
        
    }
    
    public static Location locateLargest(double[][] a){
        int r=0;
        int c=0;
        double max = a[0][0];
        
        for (int i = 1;i<a.length;i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j]>max){
                    max = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        
        Location location = new Location(r, c, max);
        return location;  
    }
    
}
