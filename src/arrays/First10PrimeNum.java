	package arrays;
	
	class First10PrimeNum {
		public static void main(String[] args) {
			int num= 2;
			int count=0;
			
			while(count<10)
			{
				int c=0;
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.println(num);
					count++;
				}num++;
				}
		}
	
	}
