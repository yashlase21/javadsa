import java.util.Scanner;
class TrafficSignal
{
	public static void main(String[] args)
{
	Scanner traffic = new Scanner(System.in);
	char signal = traffic.next().charAt(0);
	String result=(signal=='r' || signal== 'R') ? "Rider Stopped" :(signal == 'o' || signal == 'O')?"Rider get ready":(signal == 'g' || signal == 'G')?"Ride GO":"Invalid Signal Provided :(";

}

}
