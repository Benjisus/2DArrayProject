package array.controller;



	import array.model.MarshmallowCreature;
    import array.model.Tshirts;

   


	public class Array2DController 
	{

		int[][] myInts = new int [5][3];
		String[][] myStrings = new String[4][4];
		Tshirts[][] myShirts = new Tshirts[6][4];
		private MarshmallowCreature [][] myMonster;
		
		
		
		public void start() 
		{
			fillInts();
			fillStrings();
			fillShirts();
			changeInts();
			
		}
		
		
		
		private void fillMonsters()
		{
			myMonster[0][0] = new MarshmallowCreature();
			myMonster[0][1] = new MarshmallowCreature("Ben", 9, 6,7,true);
			
			myMonster[1][0] = new MarshmallowCreature();
			myMonster[1][1] = new MarshmallowCreature("class monster", 3, 1,2,false);
			
		}
		
		
		private void fillInts()
		{
			for(int row = 0; row < myInts.length; row++)
			{
				for(int col = 0; col < myInts[0].length; col++)
				{
					myInts[row][col] = row + 4 * 3 + col;
					
				}
			}
		}
		
		private void changeInts()
		{
			for(int row = 0; row < myInts.length; row++)
			{
				for(int col = 0; col < myInts[0].length; col++)
				{
					myInts[row][col] = row + 4  + col;
					
				}
			}
		}
		
		private void fillShirts()
		{
			String color = "purple";
			for(int row = 0; row < myShirts.length; row++)
			{
				for(int col = 0; col < myShirts[0].length; col++)
				{
					myShirts[row][col] = new Tshirts(color);
				}
			}
		}
		
		private void changeShirts()
		{
			String color = "purple";
			for(int row = 0; row < myShirts.length; row++)
			{
				for(int col = 0; col < myShirts[0].length; col++)
				{
					if (col == 2)
					{
						color = "red";
					}
					
					myShirts[row][col] = new Tshirts(color);
				}
			}
		}
		
		private void fillStrings()
		{
			myStrings [0][0] = "Aatrox";
			myStrings [0][1] = "Ahri";
			myStrings [0][2] = "Akali";
			myStrings [0][3] = "Alistar";
			myStrings [1][0] = "Amumu";
			myStrings [1][1] = "Anivia";
			myStrings [1][2] = "Annie";
			myStrings [1][3] = "Ashe";
			myStrings [2][0] = "Blitzcrank";
			myStrings [2][1] = "Brand";
			myStrings [2][2] = "Caitlyn";
			myStrings [2][3] = "Cassiopeia";
			myStrings [3][0] = "Cho'Gath";
			myStrings [3][1] = "Corki";
			myStrings [3][2] = "Darius";
			myStrings [3][3] = "Diana";
		
			
			}
		
	}



