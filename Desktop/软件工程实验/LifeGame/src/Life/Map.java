package Life;
import java.util.Random;

public class Map {

	final static public int row=16;
	final static public int col=16;
	public static Cell cell[][];
	//��ʼ����������ɵ�ͼ
	public Map() {
		super();
		Map.cell=new Cell[row][col];
		//Random rnd=new Random();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				cell[i][j]=new Cell();
				Random rnd=new Random();
				cell[i][j].setStatus(rnd.nextInt(2));
			}
		}
	}
	public static Cell[][] getCell() {
		return cell;
	}
	public static void setCell(Cell[][] cell) {
		Map.cell = cell;
	}
	//��ȡ�����õ�ǰϸ����Χ������״̬
	public static void getNeighborAlive()
	{
		for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			int living=0;
    			if(i>0&&j>0) living+=cell[i-1][j-1].getStatus();//���Ϸ�
    			if(i>0) living+=cell[i-1][j].getStatus();//���Ϸ�
    			if(j>0) living+=cell[i][j-1].getStatus();//����
    			if(i<row-1&&j<col-1) living+=cell[i+1][j+1].getStatus();//���·�
    			if(i<row-1) living+=cell[i+1][j].getStatus();//���·�
    			if(j<col-1) living+=cell[i][j+1].getStatus();//���ҷ�
    			if(i<row-1&&j>0) living+=cell[i+1][j-1].getStatus();//���·�
    			if(i>0&&j<col-1) living+=cell[i-1][j+1].getStatus();//���Ϸ�
    			cell[i][j].setAlive(living);
    		}
    	}
		//System.out.println("I finished!");
	}
	
	
	public static int update()
	{
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				int status=cell[i][j].getStatus();
				cell[i][j].UpdateStatus();
				if(status==cell[i][j].getStatus())
					count++;
			}
		}
		return count;
	}
	
	/*public static void printMap() {
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			System.out.print(cell[i][j].getStatus()+" ");
    		}
    		System.out.println();
    	}
    }*/

}
