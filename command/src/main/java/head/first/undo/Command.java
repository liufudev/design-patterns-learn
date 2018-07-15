package head.first.undo;

public interface Command {
	public void execute();

	public void undo();
}
