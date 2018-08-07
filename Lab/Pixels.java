public class Pixels{
	public static void main(String[] args) {
		int[][] test = {{234, 246, 117, 85}, {72, 108, 255, 4}};
		System.out.println(avgIntensity(test));
		System.out.println(maxIntensity(test, 1));
		int[][] result = threshold(test, 108);
		for(int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++)
		System.out.println(result[i][j]);
		}

	}

	public static int avgIntensity(int[][] image) {
		int sum = 0;

		for(int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++)
				sum += image[i][j];
		}

		return sum/(image.length * image[0].length);
	}

	public static int maxIntensity(int[][] image, int column){
		int max = image[0][column];
		for(int i = 1; i < image.length; i++){
			if (image[i][column] > max)
				max = image[i][column];
		}

		return max;
	}

	public static int[][] threshold(int[][] image, int limit){
		for(int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++){
				if(image[i][j] >= limit)
					image[i][j] = 255;
				else
					image[i][j] = 0;
			}
		}
		return image;
	}
	
		
}