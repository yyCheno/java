package facade;

public class HomeTheateFacede {
	
	private DVDPlayer dvdPlayer ;
	private Popcorn popcorn;
	private Projector projector;
	private Screen screen;
	
	public HomeTheateFacede() {
		// TODO Auto-generated constructor stub
		super();
		this.dvdPlayer  = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
	}
	public void ready() {
		popcorn.on();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
}
