package practiceJustOneClass;

public class PaintJob {
	public static void main(String[] args) {
		//System.out.println(Math.ceil(5.0000001));
		System.out.println(getBucketCount(1.2,3,2));
	}
	  
    public static int getBucketCount( double width, double height, double areaPerBucket, int extraBuckets){
        if ((width * height * areaPerBucket <= 0)  || (extraBuckets < 0)) {
            return -1;
        }
    double area  = width*height;
    double neededBuckets = Math.ceil( area/areaPerBucket);
    return (int) neededBuckets - extraBuckets;
    }
    public static int getBucketCount( double width, double height, double areaPerBucket)  {
        if (width * height * areaPerBucket <= 0) {
            return -1;
        }
        double area  = width*height;
        double neededBuckets = Math.ceil( area/areaPerBucket);
        return (int) neededBuckets;
    }
    public static int getBucketCount( double area, double areaPerBucket)  {
        if (area * areaPerBucket <= 0) {
            return -1;
        }
        double neededBuckets = Math.ceil( area/areaPerBucket);
        return (int) neededBuckets;
    }
}
