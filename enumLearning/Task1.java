package enumLearning;

//import java.util.Stack;

public class Task1 
{
	public static void main(String []args)
	{
		VideoGame[] video=VideoGame.values() ;
		for(VideoGame vid:video) {
			if(vid.getGames().equals("two")) {
				System.out.println(vid.games);
			}
		}
		}
		//VideoGame[] game =VideoGame.values();
//		for (VideoGame game1:game)
//		{
//			System.out.println(game1+"----->"+game1.getGames());//arguments print
//		}
//		
//		System.out.println("--------------------------");
//		
//		for (VideoGame game1:game)
//		{
//			System.out.println(game1 +"\t---->"+game1.ordinal());//index value
//		}
//		System.out.println("--------------------------");
		
		//String hari="GTA";
	//System.out.println(VideoGame.values());
	}

