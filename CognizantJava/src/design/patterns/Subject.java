package design.patterns;
public interface Subject
{
	void subscribe(Observer o);
	void unSubscibe(Observer o);
	void Notify();
}