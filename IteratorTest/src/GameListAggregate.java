class GameListAggregate implements Aggregate{
	private Game[] list=new Game[20];
	private int number0fStock;

	@Override
	public Iterator createIterator() {
		return new GameListIterator(this);

		}
	public void add(Game game) {
		list[number0fStock]=game;
		number0fStock+=1;
	}
	public Object getAt(int number) {
		return list[number];

	}
	public int getNumber0fStock() {
		return number0fStock;
	}


	}


