package Life;

public class Cell {

	private int Status; //0-����1-��
	private int Alive; //��Χ������
	public Cell()
	{
		Status=0;
		Alive=0;
	}
	public Cell(int status,int alive)
	{
		Status=status;
		Alive=alive;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getAlive() {
		return Alive;
	}
	public void setAlive(int alive) {
		Alive = alive;
	}
	public void UpdateStatus()
	{
		if(this.getAlive()<2||this.getAlive()>3)
		{
			this.setStatus(0); //����
		}
		else if(this.getAlive()==3)
		{
			this.setStatus(1); //��->��
		}
		
	}
}

