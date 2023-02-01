package enumLearning;

public enum VideoGame 
{
	GTA("two"),PUBG("PUBG"),FREEFIRE("FREEFIRE"),
	COD("COD"),CHESS("CHESS");
  final String games;
	VideoGame(String games)
	{
		this.games=games;
	}
	public  String getGames() {
		return games;
	}
//	public  static VideoGame  getCurrent(String games) {
//		for (VideoGame game1:VideoGame.values())
//		{
//			if (game1.games.equals(games))
//			{
//			return game1;
//			}
//			
//		}
//		return null;
//}
}
