class Short1 {
    public static void main(String[] args) {
        findSum();
    }

    static void findSum() {
        short sum = 0;
        for (short i = 1; i <= 10; i++) {
            sum = (short) (sum+i);
			
        }
        System.out.println(sum);
    }
}


		
	